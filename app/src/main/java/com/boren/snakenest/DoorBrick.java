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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class DoorBrick extends AppCompatActivity {

    private Animation animation;
    private ImageView dice;
    private TextView rolingInfo, rolingDiceRollDamage, openClosedTrap;
    private Button buttonOk, buttonSelectNumber;

    int newHealth;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door_brick);

        dice = findViewById(R.id.imageViewDice);
        rolingInfo = findViewById(R.id.rolingInfo3);
        rolingDiceRollDamage = findViewById(R.id.rolingDiceRollDamage);
        openClosedTrap = findViewById(R.id.openClosedTrap);
        buttonOk = findViewById(R.id.buttonOk);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();

        int health = sharedPreferences.getInt("health", 0);
        int luck = sharedPreferences.getInt("luck", 0);


        int randDoor = rand.nextInt(3);
        switch (randDoor) {
            case 0:
                openClosedTrap.setText("The door opens up");
                break;
            case 1:
                openClosedTrap.setText("The door stays closed");
                break;
            case 2:
                openClosedTrap.setText("Its a trap");
                int randDamage = rand.nextInt(12) + 1;
                rolingDiceRollDamage.setText("You rolled a " + randDamage);
                int damage = randDamage-luck;
                if (damage <= 0){
                    rolingInfo.setText("You take no damage");
                }
                else {
                    rolingInfo.setText("You take " + damage + " damage");
                }
                rolingDiceRollDamage.setVisibility(View.VISIBLE);
                rolingInfo.setVisibility(View.VISIBLE);
                newHealth = health - damage;
                break;
        }

        animation = AnimationUtils.loadAnimation(DoorBrick.this, R.anim.dice_animation);
        dice.setAnimation(animation);

        dice.setVisibility(View.INVISIBLE);

        buttonOk.setOnClickListener(v -> {
            Intent intent = new Intent(DoorBrick.this, MainActivity.class);
            editor.putInt("health", health);
            editor.commit();
            startActivity(intent);
            finish();
        });
    }
}