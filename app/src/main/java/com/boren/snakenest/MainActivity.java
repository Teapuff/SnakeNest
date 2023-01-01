package com.boren.snakenest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewHP, textViewAgility, textViewLuck, textViewStrength, textViewArmor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewHP = findViewById(R.id.textViewHP);
        textViewAgility = findViewById(R.id.textViewAgility);
        textViewLuck = findViewById(R.id.textViewLuck);
        textViewStrength = findViewById(R.id.textViewStrength);
        textViewArmor = findViewById(R.id.textViewArmor);

        int hp = getIntent().getIntExtra("Health", 0);
        int strength = getIntent().getIntExtra("Strength", 0);
        int agility = getIntent().getIntExtra("Agility", 0);
        int armor = getIntent().getIntExtra("Armor", 0);
        int luck = getIntent().getIntExtra("Luck", 0);

        textViewHP.setText("" + hp);
        textViewStrength.setText("" + strength);
        textViewAgility.setText("" + agility);
        textViewArmor.setText("" + armor);
        textViewLuck.setText("" + luck);
    }

    public void getBrick () {
    }
}