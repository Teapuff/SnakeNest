package com.boren.snakenest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class FallenWarrior extends AppCompatActivity {

    private Button buttonYes, buttonNo, buttonOk;
    private TextView textViewChoice, textViewAction;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    int health;
    int gold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fallen_warrior);

        buttonYes = findViewById(R.id.buttonYes);
        buttonNo = findViewById(R.id.buttonNo);
        buttonOk = findViewById(R.id.buttonFallenOk);
        textViewChoice = findViewById(R.id.textViewChoice);
        textViewAction = findViewById(R.id.textViewAction);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();

        health = sharedPreferences.getInt("health", 0);
        gold = sharedPreferences.getInt("gold", 0);

        buttonYes.setOnClickListener(v -> {
            Random rand = new Random();
            int randSearch = rand.nextInt(3);
            switch (randSearch){
                case 0:
                    int low = 250;
                    int high = 500;
                    int randGold = rand.nextInt(high-low) + low;
                    textViewChoice.setText("You found a treasure worth " + randGold + " gold");
                    buttonOk.setVisibility(View.VISIBLE);
                    buttonYes.setClickable(false);
                    buttonNo.setClickable(false);
                    gold = gold + randGold;
                    break;
                case 1:
                    textViewChoice.setText("You found a rope");
                    buttonYes.setClickable(false);
                    buttonNo.setClickable(false);
                    buttonOk.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    textViewChoice.setText("You got bitten by a crustacean");
                    int randDMG = rand.nextInt(6) + 1;
                    textViewAction.setText("You took " + randDMG + " damage");
                    health = health - randDMG;
                    buttonYes.setClickable(false);
                    buttonNo.setClickable(false);
                    buttonOk.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    textViewChoice.setText("You found nothing");
                    buttonYes.setClickable(false);
                    buttonNo.setClickable(false);
                    buttonOk.setVisibility(View.VISIBLE);
                    break;
            }
        });

        buttonNo.setOnClickListener(v -> {
            Intent intent = new Intent(FallenWarrior.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        buttonOk.setOnClickListener(v -> {
            editor.putInt("health", health);
            editor.putInt("gold", gold);
            editor.commit();
            Intent intent = new Intent(FallenWarrior.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}