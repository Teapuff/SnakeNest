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

public class TheRoofCollapsesTrapCard extends AppCompatActivity {

    private Animation animation;
    private ImageView dice;
    private TextView rolingDiceRollSuvival, rolingDiceRollDamage, rolingDiceDamage;
    private Button buttonOk, buttonSelectNumber;
    private EditText editTextNumber;

    int checkRollSurvival;
    int newHealth;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_roof_collapses_trap_card);

        Random rand = new Random();
        int randDMG = rand.nextInt(6) + 1;
        int randSurvival = rand.nextInt(12) + 1;

        dice = findViewById(R.id.imageViewDice);
        rolingDiceRollSuvival = findViewById(R.id.rolingDiceRollSuvival);
        rolingDiceRollDamage = findViewById(R.id.openClosedTrap);
        rolingDiceDamage = findViewById(R.id.successOrFail);
        editTextNumber = findViewById(R.id.editTextNumber);
        buttonOk = findViewById(R.id.buttonOk);
        buttonSelectNumber = findViewById(R.id.buttonSelectNumber);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();

        int health = sharedPreferences.getInt("health", 0);

        int damage = randDMG-2;

        animation = AnimationUtils.loadAnimation(TheRoofCollapsesTrapCard.this, R.anim.dice_animation);
        dice.setAnimation(animation);

        dice.setVisibility(View.INVISIBLE);

        buttonSelectNumber.setOnClickListener(v -> {

            checkRollSurvival = Integer.parseInt(editTextNumber.getText().toString());

            if (checkRollSurvival == randSurvival){
                newHealth = -1;
                rolingDiceRollSuvival.setText("You rolled a " + randSurvival + ", Sorry you died");
            }
            else{
                newHealth = health-damage;

                rolingDiceRollSuvival.setText("You rolled a " + randSurvival + ", You survived!");
                rolingDiceRollDamage.setText("You rolled a " + randDMG);
                if (damage <= 0){
                    rolingDiceDamage.setText("You take no damage");
                }
                else {
                    rolingDiceRollDamage.setText("You roll a " + randDMG + " damage");
                    rolingDiceDamage.setText("You take " + damage + " damage");

                    buttonOk.setOnClickListener(v1 -> {
                        if(damage <= 0) {
                            Intent intent = new Intent(TheRoofCollapsesTrapCard.this, MainActivity.class);
                            editor.putInt("health", health);
                            editor.commit();
                            startActivity(intent);
                            finish();
                        }
                        else if(damage > 0){
                            Intent intent = new Intent(TheRoofCollapsesTrapCard.this, MainActivity.class);
                            editor.putInt("health", newHealth);
                            editor.commit();
                            startActivity(intent);
                            finish();
                        }
                    });
                }
            }
        });
    }
}