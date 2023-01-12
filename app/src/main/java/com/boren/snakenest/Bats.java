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

public class Bats extends AppCompatActivity {

    private Animation animation;
    private ImageView dice;
    private TextView rolingDiceRoll, rolingDiceDamage;
    private Button buttonOk;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bats);

        Random rand = new Random();
        int randDMG = rand.nextInt(6) + 1;
        int newHealth;

        dice = findViewById(R.id.imageViewDice);
        rolingDiceRoll = findViewById(R.id.textViewRoll);
        rolingDiceDamage = findViewById(R.id.textViewDamage);
        buttonOk = findViewById(R.id.button3);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();

        int health = sharedPreferences.getInt("health", 0);
        rolingDiceRoll.setText("You rolled a " + randDMG);
        rolingDiceDamage.setText("You take " + randDMG + " damage");


        newHealth = health - randDMG;

        animation = AnimationUtils.loadAnimation(Bats.this, R.anim.dice_animation);
        dice.setAnimation(animation);

        dice.setVisibility(View.INVISIBLE);

        buttonOk.setOnClickListener(v -> {
            Intent intent = new Intent(Bats.this, MainActivity.class);
            editor.putInt("health", newHealth);
            editor.commit();
            startActivity(intent);
            finish();

        });
    }
}