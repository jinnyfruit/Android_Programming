package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView label_User_Name;
    EditText txtUserName;
    Button btnBegin;
    private Context context;
    private int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();

        label_User_Name = findViewById(R.id.textView1);
        txtUserName = findViewById(R.id.textUserName);
        btnBegin = findViewById(R.id.button1);

        btnBegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = txtUserName.getText().toString();
                if(username.compareTo("Younhyun Jung")==0){
                    label_User_Name.setText("OK, Please wait...");
                    Toast.makeText(context, "Hi! Prof." + username, duration).show();
                }
                else{
                    Toast.makeText(context, username + "is not a valid User", duration).show();
                }
            }
        });

    }
}