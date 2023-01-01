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

public class ToxicFogTrapCard extends AppCompatActivity {

    private Animation animation;
    private ImageView dice;
    private TextView rolingDiceRoll, rolingDiceDamage;
    private Button buttonOk;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toxic_fog_trap_card);

        Random rand = new Random();
        int randDMG = rand.nextInt(6) + 1;
        int randDays = rand.nextInt(6) + 1;

        dice = findViewById(R.id.imageViewDice);
        rolingDiceRoll = findViewById(R.id.rolingDiceRoll);
        rolingDiceDamage = findViewById(R.id.rolingDiceDamage);
        buttonOk = findViewById(R.id.buttonOk);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();
        ;
        int health = sharedPreferences.getInt("health", 0);
        int days = sharedPreferences.getInt("days", 0);

        int damage = randDMG-3;
        int newHealth = health-damage;
        int lostdays = randDays - 3;
        int newDays = days - lostdays;


        rolingDiceRoll.setText("You rolled a " + randDMG + " for damage and a " + randDays + " for days");
        if (damage <= 0){
            if (lostdays <= 0){
                rolingDiceDamage.setText("You take no damage and loses no extra days");
            }
            else{
                rolingDiceDamage.setText("You take no damage but loses " + lostdays + " days");
            }
        }
        else {
            if (lostdays <= 0){
                rolingDiceDamage.setText("You take " + damage + " damage but no extra days");
            }
            else{
                rolingDiceDamage.setText("You take " + damage + " damage and loses " + lostdays + " extra days");
            }
        }

        animation = AnimationUtils.loadAnimation(ToxicFogTrapCard.this, R.anim.dice_animation);
        dice.setAnimation(animation);

        dice.setVisibility(View.INVISIBLE);

        buttonOk.setOnClickListener(v -> {
            if(damage <= 0) {
                Intent intent = new Intent(ToxicFogTrapCard.this, MainActivity.class);
                editor.putInt("health", health);
                editor.putInt("days", newDays);
                editor.commit();
                startActivity(intent);
                finish();
            }
            else if(damage > 0){
                Intent intent = new Intent(ToxicFogTrapCard.this, MainActivity.class);
                editor.putInt("health", newHealth);
                editor.putInt("days", newDays);
                editor.commit();
                startActivity(intent);
                finish();

            }
        });
    }

}