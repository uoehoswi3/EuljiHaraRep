package com.example.euljiharu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button EuljiButton, HaruButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EuljiButton = findViewById(R.id.btn_eulji);
        HaruButton = findViewById(R.id.btn_haru);

        EuljiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, EuljiActivity.class);
                startActivity(intent);
            }
        });

        HaruButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, HaruActivity.class);
                startActivity(intent);
            }
        });
    }

    private long backKeyPressedTime = 0;
    @Override
    public void onBackPressed() {
        // super.onBackPressed();
        if (System.currentTimeMillis() > backKeyPressedTime + 1000) {
            backKeyPressedTime = System.currentTimeMillis();
            Toast.makeText(this, "\'뒤로\' 버튼을 한 번 더 누르시면 종료됩니다.", Toast.LENGTH_SHORT).show();
            return;
        }
        if (System.currentTimeMillis() <= backKeyPressedTime + 1000) {
            finishAffinity();
        }
    }
}