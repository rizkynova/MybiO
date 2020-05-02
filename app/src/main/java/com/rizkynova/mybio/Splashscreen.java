package com.rizkynova.mybio;

/*
Nama  : Rizky Novayandi
Kelas : IF4
NIM   : 10117140
Waktu Pengerjaan SplashScreen : 2 Mei 2020 17:24 WIB
*/


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class Splashscreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        //progressbar
        ProgressBar progbar = (ProgressBar) findViewById(R.id.progressBar2);

        ProgressBarAnimation mProgressAnimation = new ProgressBarAnimation(progbar, 4000);
        mProgressAnimation.setProgress(100);



        //splashscreen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(Splashscreen.this, MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
