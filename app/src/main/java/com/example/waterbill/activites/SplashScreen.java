package com.example.waterbill.activites;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.waterbill.R;

public class SplashScreen extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);


        ProgressBar progressBar = (ProgressBar) findViewById(R.id.splashpd);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                    Intent intent=new Intent(SplashScreen.this, SigninSignup.class);
                    startActivity(intent);
                    finish();
            }
        },3000);
    }
}
