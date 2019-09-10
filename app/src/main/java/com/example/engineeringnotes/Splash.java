package com.example.engineeringnotes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;

public class Splash extends Activity {


        private  static int SPLASH_TIME__OUT =3000;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Splash.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME__OUT);
    }
}
