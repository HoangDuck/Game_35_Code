package com.example.gtfpver2;

import android.content.Intent;
import android.os.Bundle;
import android.support.p003v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class PlayGame extends AppCompatActivity {
    Button buttonA;
    Button buttonB;
    Button buttonC;
    Button buttonD;
    private boolean close;
    private int sum = 0;
    TextView textViewChooseNumber;
    TextView textViewPoint;
    TextView textViewPointPlus;
    TextView textViewTurn;
    private int tong;
    private boolean turn;
    /* access modifiers changed from: private */
    public int value;
    String valueButton;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0297R.layout.activity_play_game);
        this.close = false;
        addControls();
        addEvents();
        GetValues();
        SetButton();
        AddPoints();
        if (!this.turn) {
            AISTurn();
            SetButton();
            AddPoints();
            SetTurn();
        }
    }

    private void addEvents() {
        this.buttonA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                PlayGame playGame = PlayGame.this;
                playGame.valueButton = playGame.buttonA.getText().toString();
                PlayGame playGame2 = PlayGame.this;
                int unused = playGame2.value = Integer.parseInt(playGame2.valueButton);
                PlayGame.this.PlayGames();
            }
        });
        this.buttonB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                PlayGame playGame = PlayGame.this;
                playGame.valueButton = playGame.buttonB.getText().toString();
                PlayGame playGame2 = PlayGame.this;
                int unused = playGame2.value = Integer.parseInt(playGame2.valueButton);
                PlayGame.this.PlayGames();
            }
        });
        this.buttonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                PlayGame playGame = PlayGame.this;
                playGame.valueButton = playGame.buttonC.getText().toString();
                PlayGame playGame2 = PlayGame.this;
                int unused = playGame2.value = Integer.parseInt(playGame2.valueButton);
                PlayGame.this.PlayGames();
            }
        });
        this.buttonD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                PlayGame playGame = PlayGame.this;
                playGame.valueButton = playGame.buttonD.getText().toString();
                PlayGame playGame2 = PlayGame.this;
                int unused = playGame2.value = Integer.parseInt(playGame2.valueButton);
                PlayGame.this.PlayGames();
            }
        });
    }

    private void SetTurn() {
        if (this.sum > 35) {
            if (this.turn) {
                this.textViewTurn.setText("AI WON");
            } else {
                this.textViewTurn.setText("YOU WON");
            }
            this.textViewPointPlus.setVisibility(4);
            this.buttonA.setVisibility(4);
            this.buttonB.setVisibility(4);
            this.buttonC.setVisibility(4);
            this.buttonD.setVisibility(4);
            this.textViewChooseNumber.setVisibility(4);
        } else if (this.turn) {
            this.textViewTurn.setText("Your turn");
            this.turn = false;
        } else {
            this.textViewTurn.setText("AI selected");
            this.turn = true;
        }
    }

    private void addControls() {
        this.textViewPoint = (TextView) findViewById(C0297R.C0299id.textViewPoint);
        this.textViewPointPlus = (TextView) findViewById(C0297R.C0299id.textViewPointPlus);
        this.textViewTurn = (TextView) findViewById(C0297R.C0299id.textViewTurn);
        this.textViewChooseNumber = (TextView) findViewById(C0297R.C0299id.textViewChooseNumber);
        this.buttonA = (Button) findViewById(C0297R.C0299id.buttonA);
        this.buttonB = (Button) findViewById(C0297R.C0299id.buttonB);
        this.buttonC = (Button) findViewById(C0297R.C0299id.buttonC);
        this.buttonD = (Button) findViewById(C0297R.C0299id.buttonD);
    }

    /* access modifiers changed from: private */
    public void PlayGames() {
        SetButton();
        AddPoints();
        SetTurn();
        if (!this.turn) {
            AISTurn();
            SetButton();
            AddPoints();
            SetTurn();
        }
    }

    private void AddPoints() {
        this.textViewPointPlus.setText(String.valueOf(this.value));
        AddValues();
    }

    private void SetButton() {
        boolean flag;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        int i = 1;
        do {
            this.buttonA.setText(String.valueOf(i));
            if (i == this.value) {
                flag = false;
            } else {
                flag = true;
            }
            i++;
        } while (!flag);
        do {
            this.buttonB.setText(String.valueOf(i));
            if (i == this.value) {
                flag2 = false;
            } else {
                flag2 = true;
            }
            i++;
        } while (!flag2);
        do {
            this.buttonC.setText(String.valueOf(i));
            if (i == this.value) {
                flag3 = false;
            } else {
                flag3 = true;
            }
            i++;
        } while (!flag3);
        do {
            this.buttonD.setText(String.valueOf(i));
            if (i == this.value) {
                flag4 = false;
            } else {
                flag4 = true;
            }
            i++;
        } while (!flag4);
    }

    private void AddValues() {
        int parseInt = Integer.parseInt(this.textViewPoint.getText().toString().trim()) + this.value;
        this.sum = parseInt;
        this.textViewPoint.setText(String.valueOf(parseInt));
    }

    private void AISTurn() {
        int t;
        Random random = new Random();
        do {
            t = random.nextInt(4) + 1;
        } while (t == this.value);
        this.value = t;
    }

    private void GetValues() {
        Intent intent = getIntent();
        this.value = intent.getIntExtra("value", 1);
        this.turn = intent.getBooleanExtra("turn", true);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.close) {
            startActivity(new Intent(this, Pause.class));
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (!this.close) {
            this.close = true;
        } else {
            this.close = false;
        }
    }
}
