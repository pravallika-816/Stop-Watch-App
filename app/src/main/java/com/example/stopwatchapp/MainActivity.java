package com.example.stopwatchapp;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView timeDisplay;
    private Button startButton, stopButton, resetButton;

    private Handler handler = new Handler();
    private long startTime = 0L, timeInMillis = 0L;
    private boolean isRunning = false;

    private Runnable updateTime = new Runnable() {
        @Override
        public void run() {
            timeInMillis = System.currentTimeMillis() - startTime;
            int millis = (int) (timeInMillis % 1000) / 10;
            int seconds = (int) (timeInMillis / 1000) % 60;
            int minutes = (int) (timeInMillis / (1000 * 60));

            String formattedTime = String.format("%02d:%02d:%02d", minutes, seconds, millis);
            timeDisplay.setText(formattedTime);

            if (isRunning) {
                handler.postDelayed(this, 10);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeDisplay = findViewById(R.id.time_display);
        startButton = findViewById(R.id.start_button);
        stopButton = findViewById(R.id.stop_button);
        resetButton = findViewById(R.id.reset_button);

        startButton.setOnClickListener(v -> startStopwatch());
        stopButton.setOnClickListener(v -> stopStopwatch());
        resetButton.setOnClickListener(v -> resetStopwatch());
    }

    private void startStopwatch() {
        if (!isRunning) {
            startTime = System.currentTimeMillis() - timeInMillis;
            isRunning = true;
            handler.post(updateTime);
        }
    }

    private void stopStopwatch() {
        isRunning = false;
        handler.removeCallbacks(updateTime);
    }

    private void resetStopwatch() {
        isRunning = false;
        handler.removeCallbacks(updateTime);
        timeInMillis = 0;
        timeDisplay.setText("00:00:00");
    }
}
