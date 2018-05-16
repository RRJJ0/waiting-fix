package com.example.gavin.unnamed_diary;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class set_password extends AppCompatActivity {
    Intent it=new Intent(this,entrance.class);

    String str="",save_str;
    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,B_del;
    TextView text;
    SharedPreferences spf=getSharedPreferences("str", Context.MODE_PRIVATE| MODE_WORLD_READABLE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        text=(TextView)findViewById(R.id.editText);
        b1=(ImageButton)findViewById(R.id.one);
        b2=(ImageButton)findViewById(R.id.two);
        b3=(ImageButton)findViewById(R.id.three);
        b4=(ImageButton)findViewById(R.id.four);
        b5=(ImageButton)findViewById(R.id.five);
        b6=(ImageButton)findViewById(R.id.six);
        b7=(ImageButton)findViewById(R.id.seven);
        b8=(ImageButton)findViewById(R.id.eight);
        b9=(ImageButton)findViewById(R.id.nine);
        b0=(ImageButton)findViewById(R.id.zero);
        B_del=(ImageButton)findViewById(R.id.delete);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+"1";
                text.setText(str);
                if(changepage(str)){
                    //換頁
                    setpassword();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+"2";
                text.setText(str);
                if(changepage(str)){
                    //換頁
                    setpassword();
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+"3";
                text.setText(str);
                if(changepage(str)){
                    //換頁
                    setpassword();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+"4";
                text.setText(str);
                if(changepage(str)){
                    //換頁
                    setpassword();
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+"5";
                text.setText(str);
                if(changepage(str)){
                    //換頁
                    setpassword();
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+"6";
                text.setText(str);
                if(changepage(str)){
                    //換頁
                    setpassword();
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+"7";
                text.setText(str);
                if(changepage(str)){
                    //換頁
                    setpassword();
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+"8";
                text.setText(str);
                if(changepage(str)){
                    //換頁
                    setpassword();
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+"9";
                text.setText(str);
                if(changepage(str)){
                    //換頁
                    setpassword();
                }
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+"0";
                text.setText(str);
                if(changepage(str)){
                    setpassword();
                }
            }
        });

        B_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str.substring(0,str.length());
                text.setText(str);

            }
        });
    }

    public boolean changepage(String s){
        if(s.length()==4){
            spf.edit().putString("save_str","str").commit();


            return true;
        }
        else{
            return false;
        }
    }

    void setpassword(){
        AlertDialog.Builder ab=new AlertDialog.Builder(set_password.this)
                .setTitle("注意").setMessage("確定要設為密碼嗎")
                .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        startActivity(it);
                    }
                })
                .setNegativeButton("重設", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        str="";
                        text.setText("請設定密碼");
                    }
                });
        ab.show();
    }


}
