package com.example.gtfpver2;

import android.content.Intent;
import android.os.Bundle;
import android.support.p003v7.app.AppCompatActivity;
import android.view.View;
import java.util.Random;

public class StartGame extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0297R.layout.activity_start_game);
    }

    public void AITurn(View view) {
        Intent intent = new Intent(this, PlayGame.class);
        intent.putExtra("value", new Random().nextInt(4) + 1);
        intent.putExtra("turn", true);
        startActivity(intent);
    }

    public void HumanTurn(View view) {
        startActivity(new Intent(this, HumanChoose.class));
    }
}
