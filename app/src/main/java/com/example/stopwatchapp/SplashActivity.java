package com.example.stopwatchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.stopwatchapp.MainActivity;
import com.example.stopwatchapp.R;

public class SplashActivity extends Activity {

    private static final int SPLASH_DELAY = 1000; // 2 seconds delay

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // Ensure you have a splash layout

        // Delay and move to next activity
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class); // Change to HomeActivity if needed
            startActivity(intent);
            finish(); // Close SplashActivity
        }, SPLASH_DELAY);
    }
}
