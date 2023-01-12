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

public class Monster extends AppCompatActivity {

    private Button button1, button2, button3, buttonOk;
    private TextView textViewMonster, textViewChoice, textViewChoiceInfo, textViewDamage, textViewHealth;

    Random rand = new Random();

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    int monsterHealth;
    int health ;
    String monster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        buttonOk = findViewById(R.id.buttonOk);
        textViewMonster = findViewById(R.id.textViewMonster);
        textViewChoice = findViewById(R.id.textViewRoll);
        textViewChoiceInfo = findViewById(R.id.textViewChoiceInfo);
        textViewDamage = findViewById(R.id.textViewDamage);
        textViewHealth = findViewById(R.id.textViewHealth);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();

        health = sharedPreferences.getInt("health", 0);

        int randMonster = rand.nextInt(5);

        switch (randMonster){
            case 0:
                monster = "Black Elf";
                break;
            case 1:
                monster = "Mountain Troll";
                break;
            case 2:
                monster = "Skeleton";
                break;
            case 3:
                monster = "Orch";
                break;
        }
        textViewMonster.setText("You encounter a " + monster);

        monsterHealth = rand.nextInt(4) + 1;

        textViewHealth.setText("Your health is " + health);

        button1.setOnClickListener(v -> {
            int monsterChoice = rand.nextInt(3) +1;

            if (monsterChoice == 1) {
                textViewChoiceInfo.setText("The " + monster + " choose 1");
                textViewDamage.setText("Its a draw");
            }
            if (monsterChoice == 2) {
                textViewChoiceInfo.setText("The " + monster + " choose 2");
                textViewDamage.setText("The " + monster + " take 1 damage");
                monsterHealth --;
            }
            if (monsterChoice == 3) {
                textViewChoiceInfo.setText("The " + monster + " choose 3");
                textViewDamage.setText("You take 1 damage");
                health --;
                editor.putInt("health", health);
                editor.commit();
                textViewHealth.setText("Your health is " + health);
            }
            if (monsterHealth == 0 || health == 0){
                if (monsterHealth == 0){
                    textViewHealth.setText("The " + monster + " died");
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

        button2.setOnClickListener(v -> {
            int monsterChoice = rand.nextInt(3) +1;

            if (monsterChoice == 1) {
                textViewChoiceInfo.setText("The " + monster + " choose 3");
                textViewDamage.setText("You take 1 damage");
                health --;
                editor.putInt("health", health);
                editor.commit();
                textViewHealth.setText("Your health is " + health);
            }
            if (monsterChoice == 2) {
                textViewChoiceInfo.setText("The " + monster + " choose 1");
                textViewDamage.setText("Its a draw");
            }
            if (monsterChoice == 3) {
                textViewChoiceInfo.setText("The " + monster + " choose 2");
                textViewDamage.setText("The " + monster + " take 1 damage");
                monsterHealth --;
            }
            if (monsterHealth == 0 || health == 0){
                if (monsterHealth == 0){
                    textViewHealth.setText("The " + monster + " died");
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

        button3.setOnClickListener(v -> {
            int monsterChoice = rand.nextInt(3) +1;

            if (monsterChoice == 1) {
                textViewChoiceInfo.setText("The " + monster + " choose 2");
                textViewDamage.setText("The " + monster + " take 1 damage");
                monsterHealth --;
            }
            if (monsterChoice == 2) {
                textViewChoiceInfo.setText("The " + monster + " choose 3");
                textViewDamage.setText("You take 1 damage");
                health --;
                editor.putInt("health", health);
                editor.commit();
                textViewHealth.setText("Your health is " + health);
            }
            if (monsterChoice == 3) {
                textViewChoiceInfo.setText("The " + monster + " choose 1");
                textViewDamage.setText("Its a draw");
            }
            if (monsterHealth == 0 || health == 0){
                if (monsterHealth == 0){
                    textViewHealth.setText("The " + monster + " died");
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

        buttonOk.setOnClickListener(v -> {
            editor.putInt("health", health);
            editor.commit();
            Intent intent = new Intent(Monster.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}