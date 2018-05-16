package com.example.gavin.unnamed_diary;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

public class entrance extends AppCompatActivity {

    Intent intent, it1;
    int sum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrance_page);
        it1=new Intent(entrance.this,set_password.class);
        intent = new Intent(entrance.this,input_password.class);

    }

    public boolean onTouchEvent(MotionEvent event) {

        if(sum==0){
           sum++;
        startActivity(it1);
        }
       else {

            startActivity(intent);
        }

        return true;

    }
}
