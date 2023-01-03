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

public class Clutter extends AppCompatActivity {

    private Animation animation;
    private ImageView dice;
    private TextView rolingDiceSuccess, successOrFail;
    private Button buttonOk;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clutter);

        Random rand = new Random();
        int randSuccess = rand.nextInt(12) + 1;

        dice = findViewById(R.id.imageViewDice);
        rolingDiceSuccess = findViewById(R.id.openClosedTrap);
        successOrFail = findViewById(R.id.successOrFail);
        buttonOk = findViewById(R.id.buttonOk);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();

        int days = sharedPreferences.getInt("days", 0);
        int agility = sharedPreferences.getInt("agility", 0);

        rolingDiceSuccess.setText("You rolled a " + randSuccess);
        if (randSuccess <= agility){
            successOrFail.setText("You succeeded going through the room");
        }
        else {
            successOrFail.setText("You failed going through the room");
        }

        animation = AnimationUtils.loadAnimation(Clutter.this, R.anim.dice_animation);
        dice.setAnimation(animation);

        dice.setVisibility(View.INVISIBLE);

        buttonOk.setOnClickListener(v -> {
            Intent intent = new Intent(Clutter.this, MainActivity.class);
            startActivity(intent);
            finish();

        });
    }
}