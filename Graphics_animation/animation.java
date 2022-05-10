package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.content.res.Resources;

public class MyDrawEx extends View{
private Paint mPaint;
    private Bitmap mAndroidGreen;
    private Bitmap mAndroidRed;
    private int nAngle = 0;

    public void init()
    {
        mPaint = new Paint();
        Resources resources = getResources();
        mAndroidGreen = BitmapFactory.decodeResource(resources, R.drawable.android_green);
        mAndroidRed = BitmapFactory.decodeResource(resources,R.drawable.android_red);
    }

    public  MyDrawEx(Context c){
        super(c);
        init();
    }

    public  MyDrawEx(Context c, AttributeSet a){
        super(c,a);
        init();
    }

    public boolean onTouchEvent (MotionEvent event){

        if (event.getAction() == MotionEvent.ACTION_UP){
            nAngle += 10;
            invalidate();
        }
        return true;
    }

    protected void onDraw(Canvas canvas){
        canvas.drawBitmap(mAndroidGreen,0,0,mPaint);
        canvas.save();

        canvas.rotate(nAngle);
        canvas.drawBitmap(mAndroidRed,0,0,mPaint);
    }

}
