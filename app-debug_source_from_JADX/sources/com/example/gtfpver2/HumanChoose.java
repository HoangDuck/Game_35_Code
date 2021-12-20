package com.example.gtfpver2;

import android.content.Intent;
import android.os.Bundle;
import android.support.p003v7.app.AppCompatActivity;
import android.view.View;

public class HumanChoose extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0297R.layout.activity_human_choose);
    }

    public void NumberOne(View view) {
        Intent intent = new Intent(this, PlayGame.class);
        intent.putExtra("value", 1);
        intent.putExtra("turn", false);
        startActivity(intent);
    }

    public void NumberTwo(View view) {
        Intent intent = new Intent(this, PlayGame.class);
        intent.putExtra("value", 2);
        intent.putExtra("turn", false);
        startActivity(intent);
    }

    public void NumberThree(View view) {
        Intent intent = new Intent(this, PlayGame.class);
        intent.putExtra("value", 3);
        intent.putExtra("turn", false);
        startActivity(intent);
    }

    public void NumberFour(View view) {
        Intent intent = new Intent(this, PlayGame.class);
        intent.putExtra("value", 4);
        intent.putExtra("turn", false);
        startActivity(intent);
    }

    public void NumberFive(View view) {
        Intent intent = new Intent(this, PlayGame.class);
        intent.putExtra("value", 5);
        intent.putExtra("turn", false);
        startActivity(intent);
    }
}
