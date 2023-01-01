package com.boren.snakenest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class DamageActivity extends AppCompatActivity {

    private Animation animation;
    private ImageView dice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_damage);

        int strength = getIntent().getIntExtra("Strength", 0);

        dice = findViewById(R.id.imageViewDice);

        int newHealth = getIntent().getIntExtra("oldHealth", 0);
        int oldHealth = getIntent().getIntExtra("newHealth", 0);

        animation = AnimationUtils.loadAnimation(DamageActivity.this, R.anim.dice_animation);
        dice.setAnimation(animation);

        dice.setVisibility(View.INVISIBLE);



    }
}