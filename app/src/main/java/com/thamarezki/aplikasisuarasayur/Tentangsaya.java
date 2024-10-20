package com.thamarezki.aplikasisuarasayur;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tentangsaya extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tentangsaya);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ImageView iv = findViewById(R.id.tombolkembali);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(view.getContext(), MainActivity.class);
                startActivity(r);
                finish();
            }
        });
        ImageView sm1 = findViewById(R.id.insta);
        sm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Url("https://www.instagram.com/ezkiif/profilecard/?igsh=Y213MnVtdGE5NmN2");
            }
        });

        ImageView sm2 = findViewById(R.id.git);
        sm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Url("https://github.com/Madaniproblem");
            }
        });
        ImageView sm3 = findViewById(R.id.linkedin);
        sm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Url("https://www.linkedin.com/in/thamarezki-f-739661319?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app");
            }
        });
    }
    public void onBackPressed(){
        super.onBackPressed();
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();
    }
    private void Url(String link) {
        Uri l = Uri.parse(link);
        startActivity(new Intent(Intent.ACTION_VIEW,l));
    }
}