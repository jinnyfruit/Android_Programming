package com.example.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean running;
    private int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.textView01);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView.setText("스레드에서 받은 값:"+ value);
            }
        }
        );
    }

    @Override
    protected void onResume(){
        super.onResume();

        running = true;
        Thread thread1 = new BackgroundThread();
        thread1.start();
    }

    @Override
    protected void onPause(){
        super.onPause();
        running = false;
        value = 0;
    }

class BackgroundThread extends Thread{
        public void run(){
            while (running){
                try {Thread.sleep(1000);
                value++;
                }catch (Exception ex){}
            }
        }
}

}



