package com.boren.snakenest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseChar extends AppCompatActivity {

    private Button cat, chinchilla, dog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_char);

        cat = findViewById(R.id.buttonCat);
        chinchilla = findViewById(R.id.buttonChinchilla);
        dog = findViewById(R.id.buttonDog);

        cat.setOnClickListener(v -> {
            Intent intent = new Intent(ChooseChar.this, MainActivity.class);
            intent.putExtra("Health", 9);
            intent.putExtra("Strength", 5);
            intent.putExtra("Agility", 10);
            intent.putExtra("Armor", 5);
            intent.putExtra("Luck", 7);
            startActivity(intent);
            finish();
        });

        chinchilla.setOnClickListener(v -> {
            Intent intent = new Intent(ChooseChar.this, MainActivity.class);
            intent.putExtra("Health", 8);
            intent.putExtra("Strength", 4);
            intent.putExtra("Agility", 10);
            intent.putExtra("Armor", 3);
            intent.putExtra("Luck", 6);
            startActivity(intent);
            finish();
        });

        dog.setOnClickListener(v -> {
            Intent intent = new Intent(ChooseChar.this, MainActivity.class);
            intent.putExtra("Health", 7);
            intent.putExtra("Strength", 7);
            intent.putExtra("Agility", 6);
            intent.putExtra("Armor", 8);
            intent.putExtra("Luck", 5);
            startActivity(intent);
            finish();
        });
    }
}