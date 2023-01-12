package com.boren.snakenest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EmptyRoomCard extends AppCompatActivity {

    private Button buttonOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty_room_card);

        buttonOk = findViewById(R.id.button3);

        buttonOk.setOnClickListener(v -> {
            Intent intent = new Intent(EmptyRoomCard.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}