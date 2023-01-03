package com.boren.snakenest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class TrapGridBrick extends AppCompatActivity {
    private Animation animation;
    private ImageView dice;
    private TextView rolingDiceSuccess, successOrFail;
    private Button buttonOk;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    boolean success = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trap_grid_brick);

        animation = AnimationUtils.loadAnimation(TrapGridBrick.this, R.anim.dice_animation);
        dice.setAnimation(animation);

        dice.setVisibility(View.INVISIBLE);

        while (!success){
            Random rand = new Random();
            int randSuccess = rand.nextInt(12) + 1;

            dice = findViewById(R.id.imageViewDice);
            rolingDiceSuccess = findViewById(R.id.rolingDiceRollSuccess);
            successOrFail = findViewById(R.id.successOrFail);
            buttonOk = findViewById(R.id.buttonOk);

            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            editor = sharedPreferences.edit();

            int days = sharedPreferences.getInt("days", 0);
            int strength = sharedPreferences.getInt("strength", 0);

            rolingDiceSuccess.setText("You rolled a " + randSuccess);
            if (randSuccess > strength){
                successOrFail.setText("You failed lifting the grid, and have to do it again next round");
            }
            else {
                successOrFail.setText("You succeeded lifting the grid");
                buttonOk.setVisibility(View.VISIBLE);
            }
        }

        buttonOk.setOnClickListener(v -> {
            Intent intent = new Intent(TrapGridBrick.this, MainActivity.class);
            startActivity(intent);
            finish();

        });
    }
}