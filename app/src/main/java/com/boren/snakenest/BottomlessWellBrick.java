package com.boren.snakenest;

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

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class BottomlessWellBrick extends AppCompatActivity {

    private Animation animation;
    private ImageView dice;
    private TextView rolingDiceSuccess, successOrFail;
    private Button buttonOk;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottomless_well_brick);

        Random rand = new Random();
        int randSuccess = rand.nextInt(12) + 1;

        dice = findViewById(R.id.imageViewDice);
        rolingDiceSuccess = findViewById(R.id.textViewRoll);
        successOrFail = findViewById(R.id.textViewDamage);
        buttonOk = findViewById(R.id.button3);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();

        int agility = sharedPreferences.getInt("agility", 0);
        int health = sharedPreferences.getInt("health", 0);

        rolingDiceSuccess.setText("You rolled a " + randSuccess);
        if (randSuccess <= agility){
            successOrFail.setText("You succeed jumping over the well");
        }
        else {
            successOrFail.setText("You fell down. Sorry you died");
            health = -1;
            editor.putInt("health", health);
            editor.commit();
        }

        animation = AnimationUtils.loadAnimation(BottomlessWellBrick.this, R.anim.dice_animation);
        dice.setAnimation(animation);

        dice.setVisibility(View.INVISIBLE);

        buttonOk.setOnClickListener(v -> {
            Intent intent = new Intent(BottomlessWellBrick.this, MainActivity.class);
            startActivity(intent);
            finish();

        });
    }
}