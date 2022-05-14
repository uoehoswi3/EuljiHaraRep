package com.example.euljiharu;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;
import android.widget.ImageButton;

public class Timer extends AppCompatActivity {
    private static final long START_TIME_IN_MILLIS = 60000;
    private TextView mTextViewCountDown;
    private Button mButtonStartPause;
    private Button mButtonReset;
    private ImageButton BackButton;


    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);


        mTextViewCountDown = findViewById(R.id.timer);
        mButtonStartPause = findViewById(R.id.start_pause);
        mButtonReset = findViewById(R.id.reset);
        BackButton=findViewById(R.id.btn_goback);

        BackButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(Timer.this,HaruActivity.class);
                startActivity(intent);
            }
        });

        mButtonStartPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTimerRunning) {
                    pauseTimer();
                } else {
                    startTimer();
                }
            }
        });

        mButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();
            }
        });

        updateCountDownText();
    }
    private void startTimer () {
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000
        ) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                mTimerRunning=false;
                mButtonStartPause.setText("Start");
                mButtonStartPause.setVisibility(View.INVISIBLE);
                mButtonReset.setVisibility(View.VISIBLE);
            }
        }.start();
        mTimerRunning = true;
        mButtonStartPause.setText("pause");
        mButtonReset.setVisibility(View.INVISIBLE);

    }

    private void pauseTimer () {
        mCountDownTimer.cancel();
        mTimerRunning=false;
        mButtonStartPause.setText("Start");
        mButtonReset.setVisibility(View.VISIBLE);
    }

    private void resetTimer () {
        mTimeLeftInMillis=START_TIME_IN_MILLIS;
        updateCountDownText();
        mButtonReset.setVisibility(View.INVISIBLE);
        mButtonStartPause.setVisibility(View.VISIBLE);
    }

    private void updateCountDownText () {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeftFormatted=String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);

        mTextViewCountDown.setText(timeLeftFormatted);
    }

}