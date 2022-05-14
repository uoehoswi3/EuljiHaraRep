package com.example.euljiharu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HeartRate extends AppCompatActivity {
    ImageButton Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_rate);

        Button=findViewById(R.id.btn_goback);

        Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HeartRate.this, HaruActivity.class);
                startActivity(intent);
            }
        });
    }
}