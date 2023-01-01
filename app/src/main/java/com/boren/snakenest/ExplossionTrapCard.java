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

public class ExplossionTrapCard extends AppCompatActivity {

    private Animation animation;
    private ImageView dice;
    private TextView rolingDiceRoll, rolingDiceDamage;
    private Button buttonOk;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explossion_trap_card);

        dice = findViewById(R.id.imageViewDice);
        rolingDiceDamage = findViewById(R.id.rolingDiceDamage);
        buttonOk = findViewById(R.id.buttonOk);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();

        int health = sharedPreferences.getInt("health", 0);
        int days = sharedPreferences.getInt("days", 0);

        int newHealth = health-4;
        int newDays = days - 1;

        animation = AnimationUtils.loadAnimation(ExplossionTrapCard.this, R.anim.dice_animation);
        dice.setAnimation(animation);

        dice.setVisibility(View.INVISIBLE);

        buttonOk.setOnClickListener(v -> {
            Intent intent = new Intent(ExplossionTrapCard.this, MainActivity.class);
            editor.putInt("health", newHealth);
            editor.putInt("days", newDays);
            editor.commit();
            startActivity(intent);
            finish();
        });
    }
}