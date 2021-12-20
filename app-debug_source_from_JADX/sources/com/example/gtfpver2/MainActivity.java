package com.example.gtfpver2;

import android.content.Intent;
import android.os.Bundle;
import android.support.p003v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0297R.layout.activity_main);
    }

    public void Play(View view) {
        startActivity(new Intent(this, StartGame.class));
    }
}
