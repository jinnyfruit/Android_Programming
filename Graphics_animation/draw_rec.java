package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        MyView vw = new MyView(this);
        setContentView(vw);
    }

    protected class MyView extends View {
        public MyView(Context context){
            super(context);
        }
        @Override
        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);
            Paint pnt = new Paint();
            pnt.setColor(Color.BLUE);
            canvas.drawColor(Color.RED);
            canvas.drawRect(100,100,200,200,pnt);
        }
    }

}