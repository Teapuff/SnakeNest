package com.boren.snakenest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Treasure extends AppCompatActivity {
    private Button buttonYes, buttonNo, buttonOk, button1, button2, button3;
    private TextView textViewChoice, textViewAction,textViewMonster,textViewChoiceInfo, textViewDamage, textViewHealth;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    int health, gold, newHealth, luck, damage, monsterHealth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treasure);

        buttonYes = findViewById(R.id.buttonYes);
        buttonNo = findViewById(R.id.buttonNo);
        buttonOk = findViewById(R.id.buttonFallenOk);
        textViewChoice = findViewById(R.id.textViewChoice);
        textViewAction = findViewById(R.id.textViewAction);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        buttonOk = findViewById(R.id.buttonOk);
        textViewMonster = findViewById(R.id.textViewMonster);
        textViewChoice = findViewById(R.id.textViewChoice);
        textViewChoiceInfo = findViewById(R.id.textViewChoiceInfo);
        textViewDamage = findViewById(R.id.textViewDamage);
        textViewHealth = findViewById(R.id.textViewHealth);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();

        health = sharedPreferences.getInt("health", 0);
        gold = sharedPreferences.getInt("gold", 0);
        luck = sharedPreferences.getInt("luck", 0);

        buttonNo.setOnClickListener(v -> {
            Intent intent = new Intent(Treasure.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        buttonYes.setOnClickListener(v -> {
            Random rand = new Random();
            int randSearch = rand.nextInt(7);
            switch (randSearch){
                case 0:
                    int low = 250;
                    int high = 500;
                    int randGold = rand.nextInt(high-low) + low;

                    textViewChoice.setText("You found a treasure worth " + randGold + " gold");
                    textViewChoice.setVisibility(View.VISIBLE);
                    buttonOk.setVisibility(View.VISIBLE);
                    buttonYes.setClickable(false);
                    buttonNo.setClickable(false);
                    gold = gold + randGold;
                    break;
                case 1:
                    textViewChoice.setText("You found a rope");
                    buttonYes.setClickable(false);
                    buttonNo.setClickable(false);
                    buttonOk.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    textViewChoice.setText("Its a trap!");
                    int randDMG = rand.nextInt(12) + 1;
                    damage = randDMG - luck;
                    if (damage <= 0){
                        textViewAction.setText("You take no damage");
                    }
                    else {
                        textViewAction.setText("You took " + damage + " damage");
                    }
                    newHealth = health - damage;
                    buttonYes.setClickable(false);
                    buttonNo.setClickable(false);
                    buttonOk.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    textViewChoice.setText("You found nothing");
                    buttonYes.setClickable(false);
                    buttonNo.setClickable(false);
                    buttonOk.setVisibility(View.VISIBLE);
                    break;
                case 4:
                    textViewChoice.setText("You found a small bottle");
                    buttonYes.setClickable(false);
                    buttonNo.setClickable(false);
                    buttonOk.setVisibility(View.VISIBLE);
                    break;
                case 5:
                    textViewChoice.setText("You found an amulett");
                    buttonYes.setClickable(false);
                    buttonNo.setClickable(false);
                    buttonOk.setVisibility(View.VISIBLE);
                    break;
                case 6:
                    int randNum = rand.nextInt(12) + 1;

                    if (randNum % 2 == 0){
                        textViewChoice.setText("You found nothing");
                        buttonYes.setClickable(false);
                        buttonNo.setClickable(false);
                        buttonOk.setVisibility(View.VISIBLE);
                    }

                    else {
                        buttonYes.setVisibility(View.INVISIBLE);
                        buttonNo.setVisibility(View.INVISIBLE);
                        button1.setVisibility(View.VISIBLE);
                        button2.setVisibility(View.VISIBLE);
                        button3.setVisibility(View.VISIBLE);

                        textViewChoice.setText("O no, you woke up the sekeleton, FIGHT!!!!");

                        monsterHealth = rand.nextInt(4) + 1;

                        textViewHealth.setVisibility(View.VISIBLE);
                        textViewChoiceInfo.setVisibility(View.VISIBLE);
                        textViewDamage.setVisibility(View.VISIBLE);

                        textViewHealth.setText("Your health is " + health);

                        button1.setOnClickListener(v1 -> {
                            int monsterChoice = rand.nextInt(3) +1;
                            textViewChoice.setVisibility(View.INVISIBLE);

                            if (monsterChoice == 1) {

                                textViewChoiceInfo.setText("The skeleton choose 1");
                                textViewDamage.setText("Its a draw");
                            }
                            if (monsterChoice == 2) {
                                textViewChoiceInfo.setText("The skeleton choose 2");
                                textViewDamage.setText("The skeleton take 1 damage");
                                monsterHealth --;
                            }
                            if (monsterChoice == 3) {
                                textViewChoiceInfo.setText("The skeleton choose 3");
                                textViewDamage.setText("You take 1 damage");
                                health --;
                                editor.putInt("health", health);
                                editor.commit();
                                textViewHealth.setText("Your health is " + health);
                            }
                            if (monsterHealth == 0 || health == 0){
                                if (monsterHealth == 0){
                                    textViewHealth.setText("The skeleton died");
                                }
                                else if(health == 0){
                                    textViewHealth.setText("You died");
                                }
                                button1.setVisibility(View.INVISIBLE);
                                button2.setVisibility(View.INVISIBLE);
                                button3.setVisibility(View.INVISIBLE);
                                buttonOk.setVisibility(View.VISIBLE);
                            }
                        });

                        button2.setOnClickListener(v2 -> {
                            int monsterChoice = rand.nextInt(3) +1;
                            textViewChoice.setVisibility(View.INVISIBLE);

                            if (monsterChoice == 1) {
                                textViewChoiceInfo.setText("The skeleton choose 3");
                                textViewDamage.setText("You take 1 damage");
                                health --;
                                editor.putInt("health", health);
                                editor.commit();
                                textViewHealth.setText("Your health is " + health);
                            }
                            if (monsterChoice == 2) {
                                textViewChoiceInfo.setText("The skeleton choose 1");
                                textViewDamage.setText("Its a draw");
                            }
                            if (monsterChoice == 3) {
                                textViewChoiceInfo.setText("The skeleton choose 2");
                                textViewDamage.setText("The skeleton take 1 damage");
                                monsterHealth --;
                            }
                            if (monsterHealth == 0 || health == 0){
                                if (monsterHealth == 0){
                                    textViewHealth.setText("The skeleton died");
                                }
                                else if(health == 0){
                                    textViewHealth.setText("You died");
                                }
                                button1.setVisibility(View.INVISIBLE);
                                button2.setVisibility(View.INVISIBLE);
                                button3.setVisibility(View.INVISIBLE);
                                buttonOk.setVisibility(View.VISIBLE);
                            }
                        });


                        button3.setOnClickListener(v3 -> {
                            int monsterChoice = rand.nextInt(3) +1;
                            textViewChoice.setVisibility(View.INVISIBLE);

                            if (monsterChoice == 1) {
                                textViewChoiceInfo.setText("The skeleton choose 2");
                                textViewDamage.setText("The skeleton take 1 damage");
                                monsterHealth --;
                            }
                            if (monsterChoice == 2) {
                                textViewChoiceInfo.setText("The skeleton choose 3");
                                textViewDamage.setText("You take 1 damage");
                                health --;
                                editor.putInt("health", health);
                                editor.commit();
                                textViewHealth.setText("Your health is " + health);
                            }
                            if (monsterChoice == 3) {
                                textViewChoiceInfo.setText("The skeleton choose 1");
                                textViewDamage.setText("Its a draw");
                            }
                            if (monsterHealth == 0 || health == 0){
                                if (monsterHealth == 0){
                                    textViewHealth.setText("The skeleton died");
                                }
                                else if(health == 0){
                                    textViewHealth.setText("You died");
                                }
                                button1.setVisibility(View.INVISIBLE);
                                button2.setVisibility(View.INVISIBLE);
                                button3.setVisibility(View.INVISIBLE);
                                buttonOk.setVisibility(View.VISIBLE);
                            }
                        });

                        buttonOk.setOnClickListener(v4 -> {
                            editor.putInt("health", health);
                            editor.commit();
                            Intent intent = new Intent(Treasure.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        });
                    }
            }
        });


        buttonOk.setOnClickListener(v -> {
            if(damage <= 0) {
                Intent intent = new Intent(Treasure.this, MainActivity.class);
                editor.putInt("health", health);
                editor.putInt("gold", gold);
                editor.commit();
                startActivity(intent);
                finish();
            }
            else if(damage > 0){
                Intent intent = new Intent(Treasure.this, MainActivity.class);
                editor.putInt("health", newHealth);
                editor.putInt("gold", gold);
                editor.commit();
                startActivity(intent);
                finish();
            }
        });

    }
}