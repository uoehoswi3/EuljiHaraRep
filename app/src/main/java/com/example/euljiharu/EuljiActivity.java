package com.example.euljiharu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class EuljiActivity extends AppCompatActivity {
    Button ScheduleButton, MemoButton, CameraButton;
    ImageButton BackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eulji);

       ScheduleButton=findViewById(R.id.btn_schedule);
       BackButton=findViewById(R.id.btn_goback);
       MemoButton=findViewById(R.id.btn_memo);
       CameraButton=findViewById(R.id.btn_camera);



       ScheduleButton.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(EuljiActivity.this, Schedule.class);
               startActivity(intent);
           }
       });
       BackButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(EuljiActivity.this, MainActivity.class);
               startActivity(intent);
           }
       });
        MemoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EuljiActivity.this, Memo.class);
                startActivity(intent);
            }
        });
        CameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EuljiActivity.this, Camera.class);
                startActivity(intent);
            }
        });
}
}