package com.boren.snakenest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Intro extends AppCompatActivity {

    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        start = findViewById(R.id.buttonStart);

        start.setOnClickListener(v -> {
            Intent intent = new Intent(Intro.this, ChooseChar.class);
            startActivity(intent);
            finish();
        });
    }
}