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
    private Button buttonOk, buttonRollAgain;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    int lostDays = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trap_grid_brick);

        dice = findViewById(R.id.imageViewDice);
        rolingDiceSuccess = findViewById(R.id.openClosedTrap);
        successOrFail = findViewById(R.id.successOrFail);
        buttonOk = findViewById(R.id.buttonOk);
        buttonRollAgain = findViewById(R.id.buttonRollAgain);

        animation = AnimationUtils.loadAnimation(TrapGridBrick.this, R.anim.dice_animation);
        dice.setAnimation(animation);

        dice.setVisibility(View.INVISIBLE);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();
        Random rand = new Random();

        int days = sharedPreferences.getInt("days", 0);
        int strength = sharedPreferences.getInt("strength", 0);
        int newDays;

        buttonRollAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randSuccess = rand.nextInt(12) + 1;

                rolingDiceSuccess.setText("You rolled a " + randSuccess);

                if (randSuccess <= strength){
                    successOrFail.setText("You succeeded lifting the grid");
                    buttonOk.setVisibility(View.VISIBLE);
                    buttonRollAgain.setVisibility(View.INVISIBLE);
                    lostDays = 0;
                }
                else if (randSuccess > strength){
                    successOrFail.setText("You failed lifting the grid, and have to do it again next round");
                    lostDays = lostDays +1;
                }
            }
        });

        newDays = days - lostDays;

        buttonOk.setOnClickListener(v -> {
            Intent intent = new Intent(TrapGridBrick.this, MainActivity.class);
            editor.putInt("days", newDays);
            editor.commit();
            startActivity(intent);
            finish();

        });
    }
}