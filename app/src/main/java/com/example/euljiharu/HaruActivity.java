package com.example.euljiharu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class HaruActivity extends AppCompatActivity {
    Button pedometerButton, StopWatchButton, TimerButton,HeartRateButton;
    ImageButton BackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haru);

        pedometerButton=findViewById(R.id.btn_pedometer);
        BackButton=findViewById(R.id.btn_goback);
        StopWatchButton=findViewById(R.id.btn_StopWatch);
        TimerButton=findViewById(R.id.btn_Timer);
        HeartRateButton=findViewById(R.id.btn_HeartRate);

        pedometerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HaruActivity.this, pedometer.class);
                startActivity(intent);
            }
        });
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HaruActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        StopWatchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HaruActivity.this, StopWatch.class);
                startActivity(intent);
            }
        });
        TimerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HaruActivity.this, Timer.class);
                startActivity(intent);
            }
        });
        HeartRateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HaruActivity.this, HeartRate.class);
                startActivity(intent);
            }
        });
    }
}