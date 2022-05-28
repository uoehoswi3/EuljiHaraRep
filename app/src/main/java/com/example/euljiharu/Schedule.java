package com.example.euljiharu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class Schedule extends AppCompatActivity {
    EditText mon1, mon2, mon3, mon4, mon5, mon6, mon7, mon8, mon9, tues1, tues2, tues3, tues4, tues5, tues6, tues7, tues8, tues9, wen1, wen2, wen3, wen4, wen5, wen6, wen7, wen8, wen9, th1, th2, th3, th4, th5, th6, th7, th8, th9, f1, f2, f3, f4, f5, f6, f7, f8, f9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        mon1= (EditText) findViewById(R.id.monday1);
        mon2 = (EditText) findViewById(R.id.monday2);
        mon3= (EditText) findViewById(R.id.monday3);
        mon4 = (EditText) findViewById(R.id.monday4);
        mon5= (EditText) findViewById(R.id.monday5);
        mon6 = (EditText) findViewById(R.id.monday6);
        mon7= (EditText) findViewById(R.id.monday7);
        mon8 = (EditText) findViewById(R.id.monday8);
        mon9= (EditText) findViewById(R.id.monday9);
        tues1 = (EditText) findViewById(R.id.tuesday1);
        tues2= (EditText) findViewById(R.id.tuesday2);
        tues3 = (EditText) findViewById(R.id.tuesday3);
        tues4= (EditText) findViewById(R.id.tuesday4);
        tues5 = (EditText) findViewById(R.id.tuesday5);
        tues6= (EditText) findViewById(R.id.tuesday6);
        tues7 = (EditText) findViewById(R.id.tuesday7);
        tues8= (EditText) findViewById(R.id.tuesday8);
        tues9 = (EditText) findViewById(R.id.tuesday9);
        wen1= (EditText) findViewById(R.id.wednesday1);
        wen2 = (EditText) findViewById(R.id.wednesday2);
        wen3= (EditText) findViewById(R.id.wednesday3);
        wen4 = (EditText) findViewById(R.id.wednesday4);
        wen5= (EditText) findViewById(R.id.wednesday5);
        wen6 = (EditText) findViewById(R.id.wednesday6);
        wen7= (EditText) findViewById(R.id.wednesday7);
        wen8 = (EditText) findViewById(R.id.wednesday8);
        wen9= (EditText) findViewById(R.id.wednesday9);
        th1 = (EditText) findViewById(R.id.thursday1);
        th2= (EditText) findViewById(R.id.thursday2);
        th3 = (EditText) findViewById(R.id.thursday3);
        th4= (EditText) findViewById(R.id.thursday4);
        th5 = (EditText) findViewById(R.id.thursday5);
        th6= (EditText) findViewById(R.id.thursday6);
        th7 = (EditText) findViewById(R.id.thursday7);
        th8= (EditText) findViewById(R.id.thursday8);
        th9 = (EditText) findViewById(R.id.thursday9);
        f1 = (EditText) findViewById(R.id.friday1);
        f2= (EditText) findViewById(R.id.friday2);
        f3 = (EditText) findViewById(R.id.friday3);
        f4= (EditText) findViewById(R.id.friday4);
        f5 = (EditText) findViewById(R.id.friday5);
        f6= (EditText) findViewById(R.id.friday6);
        f7 = (EditText) findViewById(R.id.friday7);
        f8= (EditText) findViewById(R.id.friday8);
        f9 = (EditText) findViewById(R.id.friday9);
        SharedPreferences sp = getSharedPreferences("temp", MODE_PRIVATE);

        String s = sp.getString("a", "");
        String s2 = sp.getString("b", "");
        String s3 = sp.getString("c", "");
        String s4 = sp.getString("d", "");
        String s5 = sp.getString("e", "");
        String s6 = sp.getString("f", "");
        String s7= sp.getString("g", "");
        String s8 = sp.getString("h", "");
        String s9= sp.getString("i", "");
        String s10 = sp.getString("j", "");
        String s11 = sp.getString("k", "");
        String s12 = sp.getString("l", "");
        String s13 = sp.getString("m", "");
        String s14 = sp.getString("n", "");
        String s15 = sp.getString("o", "");
        String s16 = sp.getString("p", "");
        String s17 = sp.getString("q", "");
        String s18 = sp.getString("r", "");
        String s19= sp.getString("s", "");
        String s20 = sp.getString("t", "");
        String s21 = sp.getString("u", "");
        String s22 = sp.getString("v", "");
        String s23 = sp.getString("w", "");
        String s24 = sp.getString("x", "");
        String s25 = sp.getString("y", "");
        String s26 = sp.getString("a1", "");
        String s27 = sp.getString("a2", "");
        String s28= sp.getString("a3", "");
        String s29= sp.getString("a4", "");
        String s30= sp.getString("a5", "");
        String s31 = sp.getString("a6", "");
        String s32 = sp.getString("a7", "");
        String s33 = sp.getString("a8", "");
        String s34 = sp.getString("a9", "");
        String s35 = sp.getString("b1", "");
        String s36 = sp.getString("b2", "");
        String s37 = sp.getString("b3", "");
        String s38 = sp.getString("b4", "");
        String s39 = sp.getString("b5", "");
        String s40= sp.getString("b6", "");
        String s41 = sp.getString("b7", "");
        String s42 = sp.getString("b8", "");
        String s43 = sp.getString("b9", "");
        String s44 = sp.getString("c1", "");
        String s45=sp.getString("c2"," ");

        mon1.setText(s);mon2.setText(s2);mon3.setText(s3);mon4.setText(s4);mon5.setText(s5);
        tues1.setText(s5);tues2.setText(s6);tues3.setText(s7);tues4.setText(s8);tues5.setText(s9);
        wen1.setText(s10);wen2.setText(s11);wen3.setText(s12);wen4.setText(s13);wen5.setText(s14);
        th1.setText(s15);th2.setText(s16);th3.setText(s17);th4.setText(s18);th5.setText(s19);
        f1.setText(s20);f2.setText(s21);f3.setText(s22);f4.setText(s23);f5.setText(s24);
        mon6.setText(s25);mon7.setText(s26);mon8.setText(s27);mon9.setText(s28);tues6.setText(s29);
        tues7.setText(s30);tues8.setText(s31);tues9.setText(s32);wen6.setText(s33);wen7.setText(s34);
        wen8.setText(s35);wen9.setText(s36);th6.setText(s37);th7.setText(s38);th8.setText(s39);th9.setText(s40);
        f6.setText(s41);f7.setText(s42);f8.setText(s43);f9.setText(s44);
    }
    protected void onStop() {
        super.onStop();

        SharedPreferences prefer = getSharedPreferences("temp", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefer.edit();
        editor.putString("a",mon1.getText().toString());
        editor.putString("b", mon2.getText().toString());
        editor.putString("c",mon3.getText().toString());
        editor.putString("d", mon4.getText().toString());
        editor.putString("e",mon5.getText().toString());
        editor.putString("f", tues1.getText().toString());
        editor.putString("g",tues2.getText().toString());
        editor.putString("h", tues3.getText().toString());
        editor.putString("i", tues4.getText().toString());
        editor.putString("j",tues5.getText().toString());
        editor.putString("k", wen1.getText().toString());
        editor.putString("l",wen2.getText().toString());
        editor.putString("m", wen3.getText().toString());
        editor.putString("n",wen4.getText().toString());
        editor.putString("o", wen5.getText().toString());
        editor.putString("p",th1.getText().toString());
        editor.putString("q", th2.getText().toString());
        editor.putString("r", th3.getText().toString());
        editor.putString("s", th4.getText().toString());
        editor.putString("t",th5.getText().toString());
        editor.putString("u",f1.getText().toString());
        editor.putString("v",f2.getText().toString());
        editor.putString("w",f3.getText().toString());
        editor.putString("x",f4.getText().toString());
        editor.putString("y", f5.getText().toString());
        editor.putString("a1", mon6.getText().toString());
        editor.putString("a2", mon7.getText().toString());
        editor.putString("a3",mon8.getText().toString());
        editor.putString("a4", mon9.getText().toString());
        editor.putString("a5",tues6.getText().toString());
        editor.putString("a6", tues7.getText().toString());
        editor.putString("a7",tues8.getText().toString());
        editor.putString("a8", tues9.getText().toString());
        editor.putString("a9",wen6.getText().toString());
        editor.putString("b1", wen7.getText().toString());
        editor.putString("b2", wen8.getText().toString());
        editor.putString("b3", wen9.getText().toString());
        editor.putString("b4",th6.getText().toString());
        editor.putString("b5",th7.getText().toString());
        editor.putString("b6",th8.getText().toString());
        editor.putString("b7",th9.getText().toString());
        editor.putString("b8",f6.getText().toString());
        editor.putString("b9", f7.getText().toString());
        editor.putString("c1",f8.getText().toString());
        editor.putString("c2",f9.getText().toString());

        editor.apply();

    }
}