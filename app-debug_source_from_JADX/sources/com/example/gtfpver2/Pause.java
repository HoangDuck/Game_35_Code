package com.example.gtfpver2;

import android.os.Bundle;
import android.support.p003v7.app.AppCompatActivity;
import android.view.View;

public class Pause extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0297R.layout.activity_pause);
    }

    public void ResumeButton(View view) {
        finish();
    }
}
