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

    CheckBox chkCream;
    CheckBox chkSugar;
    Button btnPay;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        chkCream =  findViewById(R.id.chkCream);
        chkSugar =  findViewById(R.id.chkSugar);
        btnPay =  findViewById(R.id.btnPay);

        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "Coffee";

                if(chkCream.isChecked()){
                    msg += "&cream";
                }

                if(chkSugar.isChecked()){
                    msg += "& Sugar";
                }
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
            }
        });
    }

}
