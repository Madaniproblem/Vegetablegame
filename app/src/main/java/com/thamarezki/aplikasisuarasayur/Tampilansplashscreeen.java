 package com.thamarezki.aplikasisuarasayur;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tampilansplashscreeen extends AppCompatActivity {

    private static int splash_time_out = 1300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tampilansplashscreeen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
              Intent v = new Intent(Tampilansplashscreeen.this,MainActivity.class);
              startActivity(v);
              finish();
           }
       },splash_time_out);

    }
}