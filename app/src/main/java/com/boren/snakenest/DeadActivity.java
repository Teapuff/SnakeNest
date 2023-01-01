package com.boren.snakenest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeadActivity extends AppCompatActivity {

    private Button buttonPlayAgain, buttonQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dead);

        buttonPlayAgain = findViewById(R.id.buttonPlayAgain);
        buttonQuit = findViewById(R.id.buttonQuit);

        buttonQuit.setOnClickListener(v -> {
            finish();
        });

        buttonPlayAgain.setOnClickListener(v -> {
            Intent intent = new Intent(DeadActivity.this, Intro.class);
            startActivity(intent);
            finish();
        });




    }
}