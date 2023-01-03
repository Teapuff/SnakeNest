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


public class PoisonousSnakeTrapCard extends AppCompatActivity {

    private Animation animation;
    private ImageView dice;
    private TextView rolingDiceRoll, rolingDiceDamage;
    private Button buttonOk;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poisonous_snake_trap_card);

        Random rand = new Random();
        int randDMG = rand.nextInt(12) + 1;

        dice = findViewById(R.id.imageViewDice);
        rolingDiceRoll = findViewById(R.id.rolingDiceRollSuccess);
        rolingDiceDamage = findViewById(R.id.successOrFail);
        buttonOk = findViewById(R.id.buttonOk);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();
;
        int health = sharedPreferences.getInt("health", 0);
        int agility = sharedPreferences.getInt("agility", 0);

        int damage = randDMG-agility;
        int newHealth = health-damage;


        rolingDiceRoll.setText("You rolled a " + randDMG);
        if (damage <= 0){
            rolingDiceDamage.setText("You take no damage");
        }
        else {
            rolingDiceDamage.setText("You take " + damage + " damage");
        }

        animation = AnimationUtils.loadAnimation(PoisonousSnakeTrapCard.this, R.anim.dice_animation);
        dice.setAnimation(animation);

        dice.setVisibility(View.INVISIBLE);

        buttonOk.setOnClickListener(v -> {
            if(damage <= 0) {
                Intent intent = new Intent(PoisonousSnakeTrapCard.this, MainActivity.class);
                editor.putInt("health", health);
                editor.commit();
                startActivity(intent);
                finish();
            }
            else if(damage > 0){
                Intent intent = new Intent(PoisonousSnakeTrapCard.this, MainActivity.class);
                editor.putInt("health", newHealth);
                editor.commit();
                startActivity(intent);
                finish();

            }
        });
    }
}