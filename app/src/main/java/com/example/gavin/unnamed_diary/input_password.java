package com.example.gavin.unnamed_diary;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class input_password extends AppCompatActivity {
    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,B_del;
    TextView text;
    Intent enter=new Intent(this,entrance.class);
    Intent out=new Intent(this,set_password.class);
    SharedPreferences spf=getSharedPreferences("str", Context.MODE_PRIVATE|MODE_WORLD_READABLE);
    String save_str= spf.getString("save_str","str");
    Intent it=new Intent(this,entrance.class);
    String st;
    int sum;//用來判斷輸入錯誤幾次

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
                st=st+"1";
                text.setText(st);
                if(st.length()==4){
                    if(sum>=10){
                        reset();
                    }
                    if(pass(st)){
                        startActivity(enter);
                    }
                    else{
                        text.setText("密碼錯誤");
                        st="";
                        sum++;
                    }
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st=st+"2";
                text.setText(st);
                if(st.length()==4){
                    if(sum>=10){
                        reset();
                    }
                    if(pass(st)){
                        startActivity(enter);
                    }
                    else{
                        text.setText("密碼錯誤");
                        st="";
                        sum++;
                    }
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st=st+"3";
                text.setText(st);
                if(st.length()==4){
                    if(sum>=10){
                        reset();
                    }
                    if(pass(st)){
                        startActivity(enter);
                    }
                    else{
                        text.setText("密碼錯誤");
                        st="";
                        sum++;
                    }
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st=st+"4";
                text.setText(st);
                if(st.length()==4){
                    if(sum>=10){
                        reset();
                    }
                    if(pass(st)){
                        startActivity(enter);
                    }
                    else{
                        text.setText("密碼錯誤");
                        st="";
                        sum++;
                    }
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st=st+"5";
                text.setText(st);
                if(st.length()==4){
                    if(sum>=10){
                        reset();
                    }
                    if(pass(st)){
                        startActivity(enter);
                    }
                    else{
                        text.setText("密碼錯誤");
                        st="";
                        sum++;
                    }
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st=st+"6";
                text.setText(st);
                if(st.length()==4){
                    if(sum>=10){
                        reset();
                    }
                    if(pass(st)){
                        startActivity(enter);
                    }
                    else{
                        text.setText("密碼錯誤");
                        st="";
                        sum++;
                    }
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st=st+"7";
                text.setText(st);
                if(st.length()==4){
                    if(sum>=10){
                        reset();
                    }
                    if(pass(st)){
                        startActivity(enter);
                    }
                    else{
                        text.setText("密碼錯誤");
                        st="";
                        sum++;
                    }
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st=st+"8";
                text.setText(st);
                if(st.length()==4){
                    if(sum>=10){
                        reset();
                    }
                    if(pass(st)){
                        startActivity(enter);
                    }
                    else{
                        text.setText("密碼錯誤");
                        st="";
                        sum++;
                    }
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st=st+"9";
                text.setText(st);
                if(st.length()==4){
                    if(sum>=10){
                        reset();
                    }
                    if(pass(st)){
                        startActivity(enter);
                    }
                    else{
                        text.setText("密碼錯誤");
                        st="";
                        sum++;
                    }
                }
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st=st+"0";
                text.setText(st);
                if(st.length()==4){
                    if(sum>=10){
                        reset();
                    }
                    if(pass(st)){
                        startActivity(enter);
                    }
                    else{
                        text.setText("密碼錯誤");
                        st="";
                        sum++;
                    }
                }
            }
        });

        B_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st=st.substring(0,st.length());
                text.setText(st);

            }
        });
    }

    public boolean pass(String str){
        if(str.equals(save_str)){
            return true;
        }
        else{

            return false;
        }
    }

    void reset(){
        AlertDialog.Builder ab=new AlertDialog.Builder(input_password.this)
                .setTitle("注意")
                .setMessage("您已經輸入密碼錯誤10次以上了，請問要重設密碼嗎")
                .setPositiveButton("是", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(out);
                    }
                })
                .setPositiveButton("否", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        ab.show();
    }

}
