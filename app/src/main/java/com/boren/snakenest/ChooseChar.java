package com.boren.snakenest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

public class ChooseChar extends AppCompatActivity {

    private Button cat, chinchilla, dog;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_char);

        cat = findViewById(R.id.buttonCat);
        chinchilla = findViewById(R.id.buttonChinchilla);
        dog = findViewById(R.id.buttonDog);

        cat.setOnClickListener(v -> {
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            editor = sharedPreferences.edit();
            editor.putString("name", "Cat");
            editor.putInt("health", 9);
            editor.putInt("strength", 5);
            editor.putInt("agility", 10);
            editor.putInt("armor", 5);
            editor.putInt("luck", 7);
            editor.putInt("days", 20);
            editor.commit();
            Intent intent = new Intent(ChooseChar.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        chinchilla.setOnClickListener(v -> {
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            editor = sharedPreferences.edit();
            editor.putString("name", "Chinchilla");
            editor.putInt("health", 8);
            editor.putInt("strength", 4);
            editor.putInt("agility", 10);
            editor.putInt("armor", 3);
            editor.putInt("luck", 6);
            editor.putInt("days", 20);
            editor.commit();
            Intent intent = new Intent(ChooseChar.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        dog.setOnClickListener(v -> {
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            editor = sharedPreferences.edit();
            editor.putString("name", "Dog");
            editor.putInt("health", 7);
            editor.putInt("strength", 7);
            editor.putInt("agility", 6);
            editor.putInt("armor", 8);
            editor.putInt("luck", 5);
            editor.putInt("days", 20);
            editor.commit();
            Intent intent = new Intent(ChooseChar.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}