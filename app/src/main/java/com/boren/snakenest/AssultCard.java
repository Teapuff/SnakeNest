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

public class AssultCard extends AppCompatActivity {

    private Animation animation;
    private ImageView dice;
    private Button buttonOk;
    private TextView textViewRoll, textViewDamage;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    int newHealth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assult_card);

        dice = findViewById(R.id.imageViewDice);
        buttonOk = findViewById(R.id.button3);
        textViewDamage = findViewById(R.id.textViewDamage);
        textViewRoll = findViewById(R.id.textViewRoll);
        textViewRoll = findViewById(R.id.textViewRoll);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();

        int health = sharedPreferences.getInt("health", 0);
        int luck = sharedPreferences.getInt("luck", 0);

        Random rand = new Random();
        int randDMG = rand.nextInt(12) + 1;

        int damage = randDMG-luck;

        animation = AnimationUtils.loadAnimation(AssultCard.this, R.anim.dice_animation);
        dice.setAnimation(animation);

        dice.setVisibility(View.INVISIBLE);

        textViewRoll.setText("You rolled a " + randDMG);

        if (damage <= 0){
            textViewDamage.setText("You take no damage");
        }
        else{
            textViewDamage.setText("You take " + damage + " damage");
            newHealth = health - damage;
        }

        int randMonster = rand.nextInt(5);

        buttonOk.setOnClickListener(v -> {
            Intent intent = new Intent(AssultCard.this, Monster.class);
            startActivity(intent);
            finish();
        });
    }
}