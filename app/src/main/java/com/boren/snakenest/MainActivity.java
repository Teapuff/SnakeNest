package com.boren.snakenest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.boren.snakenest.heroes.YourStat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    YourStat yourStat = new YourStat();

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private TextView textViewHealth, textViewAgility, textViewLuck, textViewStrength, textViewArmor, textViewDays;
    private ImageView imageViewBrick1, imageViewBrick2, imageViewBrick3, imageViewBrick4, imageViewBrick5, imageViewBrick6, imageViewBrick7, imageViewBrick8
            , imageViewBrick9, imageViewBrick10, imageViewBrick11, imageViewBrick12, imageViewBrick13, imageViewBrick14, imageViewBrick15, imageViewBrick16
            , imageViewBrick17, imageViewBrick18, imageViewBrick19, imageViewBrick20, imageViewBrick21, imageViewBrick22, imageViewBrick23, imageViewBrick24
            , imageViewBrick25, imageViewBrick26, imageViewBrick27, imageViewBrick28, imageViewBrick29, imageViewBrick30, imageViewBrick31, imageViewBrick32
            , imageViewBrick33, imageViewBrick34, imageViewBrick35, imageViewBrick36, imageViewBrick37, imageViewBrick38, imageViewBrick39, imageViewBrick40
            , imageViewBrick41, imageViewBrick42, imageViewBrick43, imageViewBrick44, imageViewBrick45, imageViewBrick46, imageViewBrick47, imageViewBrick48
            , imageViewBrick49, imageViewBrick50, imageViewBrick51, imageViewBrick52, imageViewBrick53, imageViewBrick54, imageViewBrick55, imageViewBrick56
            , imageViewBrick57, imageViewBrick58, imageViewBrick59, imageViewBrick60, imageViewBrick61, imageViewBrick62, imageViewBrick63, imageViewBrick64
            , imageViewBrick65, imageViewBrick66;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewHealth = findViewById(R.id.textViewHP);
        textViewAgility = findViewById(R.id.textViewAgility);
        textViewLuck = findViewById(R.id.textViewLuck);
        textViewStrength = findViewById(R.id.textViewStrength);
        textViewArmor = findViewById(R.id.textViewArmor);
        textViewDays = findViewById(R.id.textViewDays);

        imageViewBrick1 = findViewById(R.id.imageViewBrick1);
        imageViewBrick2 = findViewById(R.id.imageViewBrick2);
        imageViewBrick3 = findViewById(R.id.imageViewBrick3);
        imageViewBrick4 = findViewById(R.id.imageViewBrick4);
        imageViewBrick5 = findViewById(R.id.imageViewBrick5);
        imageViewBrick6 = findViewById(R.id.imageViewBrick6);
        imageViewBrick7 = findViewById(R.id.imageViewBrick7);
        imageViewBrick8 = findViewById(R.id.imageViewBrick8);
        imageViewBrick9 = findViewById(R.id.imageViewBrick9);
        imageViewBrick10 = findViewById(R.id.imageViewBrick10);
        imageViewBrick11 = findViewById(R.id.imageViewBrick11);
        imageViewBrick12 = findViewById(R.id.imageViewBrick12);
        imageViewBrick13 = findViewById(R.id.imageViewBrick13);
        imageViewBrick14 = findViewById(R.id.imageViewBrick14);
        imageViewBrick15 = findViewById(R.id.imageViewBrick15);
        imageViewBrick16 = findViewById(R.id.imageViewBrick16);
        imageViewBrick17 = findViewById(R.id.imageViewBrick17);
        imageViewBrick18 = findViewById(R.id.imageViewBrick18);
        imageViewBrick19 = findViewById(R.id.imageViewBrick19);
        imageViewBrick20 = findViewById(R.id.imageViewBrick20);
        imageViewBrick21 = findViewById(R.id.imageViewBrick21);
        imageViewBrick22 = findViewById(R.id.imageViewBrick22);
        imageViewBrick23 = findViewById(R.id.imageViewBrick23);
        imageViewBrick24 = findViewById(R.id.imageViewBrick24);
        imageViewBrick25 = findViewById(R.id.imageViewBrick25);
        imageViewBrick26 = findViewById(R.id.imageViewBrick26);
        imageViewBrick27 = findViewById(R.id.imageViewBrick27);
        imageViewBrick28 = findViewById(R.id.imageViewBrick28);
        imageViewBrick29 = findViewById(R.id.imageViewBrick29);
        imageViewBrick30 = findViewById(R.id.imageViewBrick30);
        imageViewBrick31 = findViewById(R.id.imageViewBrick31);
        imageViewBrick32 = findViewById(R.id.imageViewBrick32);
        imageViewBrick33 = findViewById(R.id.imageViewBrick33);
        imageViewBrick34 = findViewById(R.id.imageViewBrick34);
        imageViewBrick35 = findViewById(R.id.imageViewBrick35);
        imageViewBrick36 = findViewById(R.id.imageViewBrick36);
        imageViewBrick37 = findViewById(R.id.imageViewBrick37);
        imageViewBrick38 = findViewById(R.id.imageViewBrick38);
        imageViewBrick39 = findViewById(R.id.imageViewBrick39);
        imageViewBrick40 = findViewById(R.id.imageViewBrick40);
        imageViewBrick41 = findViewById(R.id.imageViewBrick41);
        imageViewBrick42 = findViewById(R.id.imageViewBrick42);
        imageViewBrick43 = findViewById(R.id.imageViewBrick43);
        imageViewBrick44 = findViewById(R.id.imageViewBrick44);
        imageViewBrick45 = findViewById(R.id.imageViewBrick45);
        imageViewBrick46 = findViewById(R.id.imageViewBrick46);
        imageViewBrick47 = findViewById(R.id.imageViewBrick47);
        imageViewBrick48 = findViewById(R.id.imageViewBrick48);
        imageViewBrick49 = findViewById(R.id.imageViewBrick49);
        imageViewBrick50 = findViewById(R.id.imageViewBrick50);
        imageViewBrick51 = findViewById(R.id.imageViewBrick51);
        imageViewBrick52 = findViewById(R.id.imageViewBrick52);
        imageViewBrick53 = findViewById(R.id.imageViewBrick53);
        imageViewBrick54 = findViewById(R.id.imageViewBrick54);
        imageViewBrick55 = findViewById(R.id.imageViewBrick55);
        imageViewBrick56 = findViewById(R.id.imageViewBrick56);
        imageViewBrick57 = findViewById(R.id.imageViewBrick57);
        imageViewBrick58 = findViewById(R.id.imageViewBrick58);
        imageViewBrick59 = findViewById(R.id.imageViewBrick59);
        imageViewBrick60 = findViewById(R.id.imageViewBrick60);
        imageViewBrick61 = findViewById(R.id.imageViewBrick61);
        imageViewBrick62 = findViewById(R.id.imageViewBrick62);
        imageViewBrick63 = findViewById(R.id.imageViewBrick63);
        imageViewBrick64 = findViewById(R.id.imageViewBrick64);
        imageViewBrick65 = findViewById(R.id.imageViewBrick65);
        imageViewBrick66 = findViewById(R.id.imageViewBrick66);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();
        String name = sharedPreferences.getString("name", "");
        int health = sharedPreferences.getInt("health", 0);
        int strength = sharedPreferences.getInt("strength", 0);
        int agility = sharedPreferences.getInt("agility", 0);
        int armor = sharedPreferences.getInt("armor", 0);
        int luck = sharedPreferences.getInt("luck", 0);
        int days = sharedPreferences.getInt("days", 0);

        textViewHealth.setText("" + health);
        textViewAgility.setText("" + agility);
        textViewLuck.setText("" + luck);
        textViewStrength.setText("" + strength);
        textViewArmor.setText("" + armor);
        textViewDays.setText("" + days);

        yourStat.setName(name);
        yourStat.setHelth(health);
        yourStat.setStrength(strength);
        yourStat.setAgility(agility);
        yourStat.setArmor(armor);
        yourStat.setLuck(luck);
    }


    public void getBrick (View view) {
        Random rand = new Random();
        int randBrick = rand.nextInt(8);

        switch (4){
            case 0:
                trap(view);
                break;
            case 1:
                darkroom(view);
                break;
            case 2:
                clutter(view);
                clutterCard(); //inte kunna gå vidare om man misslyckas
                break;
            case 3:
                corridor(view); //info att man får ta en ny bricka
                break;
            case 4:
                //göra så man gör om det tills man lyckas
                trapGrid(view);
                trapGridCard();
                break;
            case 5:
                door(view);
                break;
            case 6:
                turningRoom(view);
                break;
            case 7:
                bottomlessWell(view);
                break;
            case 8:
                room(view);
                break;
        }
    }

    public void trap(View view){
        if (view.getId() == imageViewBrick1.getId()){
            imageViewBrick1.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick2.getId()){
            imageViewBrick2.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick3.getId()){
            imageViewBrick3.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick4.getId()){
            imageViewBrick4.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick5.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick6.getId()){
            imageViewBrick6.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick7.getId()){
            imageViewBrick7.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick8.getId()){
            imageViewBrick8.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick9.getId()){
            imageViewBrick9.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick10.getId()){
            imageViewBrick10.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick11.getId()){
            imageViewBrick11.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick12.getId()){
            imageViewBrick12.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick13.getId()){
            imageViewBrick13.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick14.getId()){
            imageViewBrick14.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick15.getId()){
            imageViewBrick15.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick16.getId()){
            imageViewBrick16.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick17.getId()){
            imageViewBrick17.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick18.getId()){
            imageViewBrick18.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick19.getId()){
            imageViewBrick19.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick20.getId()){
            imageViewBrick20.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick21.getId()){
            imageViewBrick21.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick22.getId()){
            imageViewBrick22.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick23.getId()){
            imageViewBrick23.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick24.getId()){
            imageViewBrick24.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick25.getId()){
            imageViewBrick25.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick26.getId()){
            imageViewBrick26.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick27.getId()){
            imageViewBrick27.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick28.getId()){
            imageViewBrick28.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick29.getId()){
            imageViewBrick29.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick30.getId()){
            imageViewBrick30.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick31.getId()){
            imageViewBrick31.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick32.getId()){
            imageViewBrick32.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick33.getId()){
            imageViewBrick33.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick34.getId()){
            imageViewBrick34.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick35.getId()){
            imageViewBrick35.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick36.getId()){
            imageViewBrick36.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick37.getId()){
            imageViewBrick37.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick38.getId()){
            imageViewBrick38.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick39.getId()){
            imageViewBrick39.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick40.getId()){
            imageViewBrick40.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick41.getId()){
            imageViewBrick41.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick42.getId()){
            imageViewBrick42.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick43.getId()){
            imageViewBrick43.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick44.getId()){
            imageViewBrick44.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick45.getId()){
            imageViewBrick45.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick46.getId()){
            imageViewBrick46.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick47.getId()){
            imageViewBrick47.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick48.getId()){
            imageViewBrick48.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick49.getId()){
            imageViewBrick49.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick50.getId()){
            imageViewBrick50.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick51.getId()){
            imageViewBrick51.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick52.getId()){
            imageViewBrick52.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick53.getId()){
            imageViewBrick53.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick54.getId()){
            imageViewBrick54.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick55.getId()){
            imageViewBrick55.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick56.getId()){
            imageViewBrick56.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick57.getId()){
            imageViewBrick57.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick58.getId()){
            imageViewBrick58.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick59.getId()){
            imageViewBrick59.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick60.getId()){
            imageViewBrick60.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick61.getId()){
            imageViewBrick61.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick62.getId()){
            imageViewBrick62.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick63.getId()){
            imageViewBrick63.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick64.getId()){
            imageViewBrick64.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick65.getId()){
            imageViewBrick65.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
        if (view.getId() == imageViewBrick66.getId()){
            imageViewBrick66.setImageResource(R.drawable.trap_brick);
            allBricks(view);
            trapCard();
        }
    }

    public void darkroom(View view){
        if (view.getId() == imageViewBrick1.getId()){
            imageViewBrick1.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick2.getId()){
            imageViewBrick2.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick3.getId()){
            imageViewBrick3.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick4.getId()){
            imageViewBrick4.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick5.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick6.getId()){
            imageViewBrick6.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick7.getId()){
            imageViewBrick7.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick8.getId()){
            imageViewBrick8.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick9.getId()){
            imageViewBrick9.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick10.getId()){
            imageViewBrick10.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick11.getId()){
            imageViewBrick11.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick12.getId()){
            imageViewBrick12.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick13.getId()){
            imageViewBrick13.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick14.getId()){
            imageViewBrick14.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick15.getId()){
            imageViewBrick15.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick16.getId()){
            imageViewBrick16.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick17.getId()){
            imageViewBrick17.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick18.getId()){
            imageViewBrick18.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick19.getId()){
            imageViewBrick19.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick20.getId()){
            imageViewBrick20.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick21.getId()){
            imageViewBrick21.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick22.getId()){
            imageViewBrick22.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick23.getId()){
            imageViewBrick23.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick24.getId()){
            imageViewBrick24.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick25.getId()){
            imageViewBrick25.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick26.getId()){
            imageViewBrick26.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick27.getId()){
            imageViewBrick27.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick28.getId()){
            imageViewBrick28.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick29.getId()){
            imageViewBrick29.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick30.getId()){
            imageViewBrick30.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick31.getId()){
            imageViewBrick31.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick32.getId()){
            imageViewBrick32.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick33.getId()){
            imageViewBrick33.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick34.getId()){
            imageViewBrick34.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick35.getId()){
            imageViewBrick35.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick36.getId()){
            imageViewBrick36.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick37.getId()){
            imageViewBrick37.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick38.getId()){
            imageViewBrick38.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick39.getId()){
            imageViewBrick39.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick40.getId()){
            imageViewBrick40.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick41.getId()){
            imageViewBrick41.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick42.getId()){
            imageViewBrick42.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick43.getId()){
            imageViewBrick43.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick44.getId()){
            imageViewBrick44.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick45.getId()){
            imageViewBrick45.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick46.getId()){
            imageViewBrick46.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick47.getId()){
            imageViewBrick47.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick48.getId()){
            imageViewBrick48.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick49.getId()){
            imageViewBrick49.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick50.getId()){
            imageViewBrick50.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick51.getId()){
            imageViewBrick51.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick52.getId()){
            imageViewBrick52.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick53.getId()){
            imageViewBrick53.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick54.getId()){
            imageViewBrick54.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick55.getId()){
            imageViewBrick55.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick56.getId()){
            imageViewBrick56.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick57.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick58.getId()){
            imageViewBrick58.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick59.getId()){
            imageViewBrick59.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick60.getId()){
            imageViewBrick60.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick61.getId()){
            imageViewBrick61.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick62.getId()){
            imageViewBrick62.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick63.getId()){
            imageViewBrick63.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick64.getId()){
            imageViewBrick64.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick65.getId()){
            imageViewBrick65.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick66.getId()){
            imageViewBrick66.setImageResource(R.drawable.darkroom_brick);
            allBricks(view);
        }
    }

    public void clutter(View view){
        if (view.getId() == imageViewBrick1.getId()){
            imageViewBrick1.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick2.getId()){
            imageViewBrick2.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick3.getId()){
            imageViewBrick3.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick4.getId()){
            imageViewBrick4.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick5.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick6.getId()){
            imageViewBrick6.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick7.getId()){
            imageViewBrick7.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick8.getId()){
            imageViewBrick8.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick9.getId()){
            imageViewBrick9.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick10.getId()){
            imageViewBrick10.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick11.getId()){
            imageViewBrick11.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick12.getId()){
            imageViewBrick12.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick13.getId()){
            imageViewBrick13.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick14.getId()){
            imageViewBrick14.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick15.getId()){
            imageViewBrick15.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick16.getId()){
            imageViewBrick16.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick17.getId()){
            imageViewBrick17.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick18.getId()){
            imageViewBrick18.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick19.getId()){
            imageViewBrick19.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick20.getId()){
            imageViewBrick20.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick21.getId()){
            imageViewBrick21.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick22.getId()){
            imageViewBrick22.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick23.getId()){
            imageViewBrick23.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick24.getId()){
            imageViewBrick24.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick25.getId()){
            imageViewBrick25.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick26.getId()){
            imageViewBrick26.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick27.getId()){
            imageViewBrick27.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick28.getId()){
            imageViewBrick28.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick29.getId()){
            imageViewBrick29.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick30.getId()){
            imageViewBrick30.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick31.getId()){
            imageViewBrick31.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick32.getId()){
            imageViewBrick32.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick33.getId()){
            imageViewBrick33.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick34.getId()){
            imageViewBrick34.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick35.getId()){
            imageViewBrick35.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick36.getId()){
            imageViewBrick36.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick37.getId()){
            imageViewBrick37.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick38.getId()){
            imageViewBrick38.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick39.getId()){
            imageViewBrick39.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick40.getId()){
            imageViewBrick40.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick41.getId()){
            imageViewBrick41.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick42.getId()){
            imageViewBrick42.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick43.getId()){
            imageViewBrick43.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick44.getId()){
            imageViewBrick44.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick45.getId()){
            imageViewBrick45.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick46.getId()){
            imageViewBrick46.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick47.getId()){
            imageViewBrick47.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick48.getId()){
            imageViewBrick48.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick49.getId()){
            imageViewBrick49.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick50.getId()){
            imageViewBrick50.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick51.getId()){
            imageViewBrick51.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }

        if (view.getId() == imageViewBrick52.getId()){
            imageViewBrick52.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick53.getId()){
            imageViewBrick53.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick54.getId()){
            imageViewBrick54.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick55.getId()){
            imageViewBrick55.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick56.getId()){
            imageViewBrick56.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick57.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick58.getId()){
            imageViewBrick58.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick59.getId()){
            imageViewBrick59.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick60.getId()){
            imageViewBrick60.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick61.getId()){
            imageViewBrick61.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick62.getId()){
            imageViewBrick62.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick63.getId()){
            imageViewBrick63.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick64.getId()){
            imageViewBrick64.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick65.getId()){
            imageViewBrick65.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
        if (view.getId() == imageViewBrick66.getId()){
            imageViewBrick66.setImageResource(R.drawable.clutter_brick);
            allBricks(view);
            clutterCard();
        }
    }

    public void corridor(View view){
        if (view.getId() == imageViewBrick1.getId()){
            imageViewBrick1.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick2.getId()){
            imageViewBrick2.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick3.getId()){
            imageViewBrick3.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick4.getId()){
            imageViewBrick4.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick5.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick6.getId()){
            imageViewBrick6.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick7.getId()){
            imageViewBrick7.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick8.getId()){
            imageViewBrick8.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick9.getId()){
            imageViewBrick9.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick10.getId()){
            imageViewBrick10.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick11.getId()){
            imageViewBrick11.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick12.getId()){
            imageViewBrick12.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick13.getId()){
            imageViewBrick13.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick14.getId()){
            imageViewBrick14.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick15.getId()){
            imageViewBrick15.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick16.getId()){
            imageViewBrick16.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick17.getId()){
            imageViewBrick17.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick18.getId()){
            imageViewBrick18.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick19.getId()){
            imageViewBrick19.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick20.getId()){
            imageViewBrick20.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick21.getId()){
            imageViewBrick21.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick22.getId()){
            imageViewBrick22.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick23.getId()){
            imageViewBrick23.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick24.getId()){
            imageViewBrick24.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick25.getId()){
            imageViewBrick25.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick26.getId()){
            imageViewBrick26.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick27.getId()){
            imageViewBrick27.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick28.getId()){
            imageViewBrick28.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick29.getId()){
            imageViewBrick29.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick30.getId()){
            imageViewBrick30.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick31.getId()){
            imageViewBrick31.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick32.getId()){
            imageViewBrick32.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick33.getId()){
            imageViewBrick33.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick34.getId()){
            imageViewBrick34.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick35.getId()){
            imageViewBrick35.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick36.getId()){
            imageViewBrick36.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick37.getId()){
            imageViewBrick37.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick38.getId()){
            imageViewBrick38.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick39.getId()){
            imageViewBrick39.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick40.getId()){
            imageViewBrick40.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick41.getId()){
            imageViewBrick41.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick42.getId()){
            imageViewBrick42.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick43.getId()){
            imageViewBrick43.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick44.getId()){
            imageViewBrick44.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick45.getId()){
            imageViewBrick45.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick46.getId()){
            imageViewBrick46.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick47.getId()){
            imageViewBrick47.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick48.getId()){
            imageViewBrick48.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick49.getId()){
            imageViewBrick49.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick50.getId()){
            imageViewBrick50.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick51.getId()){
            imageViewBrick51.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick52.getId()){
            imageViewBrick52.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick53.getId()){
            imageViewBrick53.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick54.getId()){
            imageViewBrick54.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick55.getId()){
            imageViewBrick55.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick56.getId()){
            imageViewBrick56.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick57.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick58.getId()){
            imageViewBrick58.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick59.getId()){
            imageViewBrick59.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick60.getId()){
            imageViewBrick60.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick61.getId()){
            imageViewBrick61.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick62.getId()){
            imageViewBrick62.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick63.getId()){
            imageViewBrick63.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick64.getId()){
            imageViewBrick64.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick65.getId()){
            imageViewBrick65.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick66.getId()){
            imageViewBrick66.setImageResource(R.drawable.corridor_brick);
            allBricks(view);
        }
    }

    public void trapGrid(View view){
        if (view.getId() == imageViewBrick1.getId()){
            imageViewBrick1.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick2.getId()){
            imageViewBrick2.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick3.getId()){
            imageViewBrick3.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick4.getId()){
            imageViewBrick4.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick5.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick6.getId()){
            imageViewBrick6.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick7.getId()){
            imageViewBrick7.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick8.getId()){
            imageViewBrick8.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick9.getId()){
            imageViewBrick9.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick10.getId()){
            imageViewBrick10.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick11.getId()){
            imageViewBrick11.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick12.getId()){
            imageViewBrick12.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick13.getId()){
            imageViewBrick13.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick14.getId()){
            imageViewBrick14.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick15.getId()){
            imageViewBrick15.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick16.getId()){
            imageViewBrick16.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick17.getId()){
            imageViewBrick17.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick18.getId()){
            imageViewBrick18.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick19.getId()){
            imageViewBrick19.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick20.getId()){
            imageViewBrick20.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick21.getId()){
            imageViewBrick21.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick22.getId()){
            imageViewBrick22.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick23.getId()){
            imageViewBrick23.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick24.getId()){
            imageViewBrick24.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick25.getId()){
            imageViewBrick25.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick26.getId()){
            imageViewBrick26.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick27.getId()){
            imageViewBrick27.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick28.getId()){
            imageViewBrick28.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick29.getId()){
            imageViewBrick29.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick30.getId()){
            imageViewBrick30.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick31.getId()){
            imageViewBrick31.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick32.getId()){
            imageViewBrick32.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick33.getId()){
            imageViewBrick33.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick34.getId()){
            imageViewBrick34.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick35.getId()){
            imageViewBrick35.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick36.getId()){
            imageViewBrick36.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick37.getId()){
            imageViewBrick37.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick38.getId()){
            imageViewBrick38.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick39.getId()){
            imageViewBrick39.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick40.getId()){
            imageViewBrick40.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick41.getId()){
            imageViewBrick41.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick42.getId()){
            imageViewBrick42.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick43.getId()){
            imageViewBrick43.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick44.getId()){
            imageViewBrick44.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick45.getId()){
            imageViewBrick45.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick46.getId()){
            imageViewBrick46.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick47.getId()){
            imageViewBrick47.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick48.getId()){
            imageViewBrick48.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick49.getId()){
            imageViewBrick49.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick50.getId()){
            imageViewBrick50.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick51.getId()){
            imageViewBrick51.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick52.getId()){
            imageViewBrick52.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick53.getId()){
            imageViewBrick53.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick54.getId()){
            imageViewBrick54.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick55.getId()){
            imageViewBrick55.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick56.getId()){
            imageViewBrick56.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick57.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick58.getId()){
            imageViewBrick58.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick59.getId()){
            imageViewBrick59.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick60.getId()){
            imageViewBrick60.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick61.getId()){
            imageViewBrick61.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick62.getId()){
            imageViewBrick62.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick63.getId()){
            imageViewBrick63.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick64.getId()){
            imageViewBrick64.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick65.getId()){
            imageViewBrick65.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick66.getId()){
            imageViewBrick66.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
        }
    }

    public void door(View view){
        if (view.getId() == imageViewBrick1.getId()){
            imageViewBrick1.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick2.getId()){
            imageViewBrick2.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick3.getId()){
            imageViewBrick3.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick4.getId()){
            imageViewBrick4.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick5.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick6.getId()){
            imageViewBrick6.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick7.getId()){
            imageViewBrick7.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick8.getId()){
            imageViewBrick8.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick9.getId()){
            imageViewBrick9.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick10.getId()){
            imageViewBrick10.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick11.getId()){
            imageViewBrick11.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick12.getId()){
            imageViewBrick12.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick13.getId()){
            imageViewBrick13.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick14.getId()){
            imageViewBrick14.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick15.getId()){
            imageViewBrick15.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick16.getId()){
            imageViewBrick16.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick17.getId()){
            imageViewBrick17.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick18.getId()){
            imageViewBrick18.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick19.getId()){
            imageViewBrick19.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick20.getId()){
            imageViewBrick20.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick21.getId()){
            imageViewBrick21.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick22.getId()){
            imageViewBrick22.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick23.getId()){
            imageViewBrick23.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick24.getId()){
            imageViewBrick24.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick25.getId()){
            imageViewBrick25.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick26.getId()){
            imageViewBrick26.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick27.getId()){
            imageViewBrick27.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick28.getId()){
            imageViewBrick28.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick29.getId()){
            imageViewBrick29.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick30.getId()){
            imageViewBrick30.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick31.getId()){
            imageViewBrick31.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick32.getId()){
            imageViewBrick32.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick33.getId()){
            imageViewBrick33.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick34.getId()){
            imageViewBrick34.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick35.getId()){
            imageViewBrick35.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick36.getId()){
            imageViewBrick36.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick37.getId()){
            imageViewBrick37.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick38.getId()){
            imageViewBrick38.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick39.getId()){
            imageViewBrick39.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick40.getId()){
            imageViewBrick40.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick41.getId()){
            imageViewBrick41.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick42.getId()){
            imageViewBrick42.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick43.getId()){
            imageViewBrick43.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick44.getId()){
            imageViewBrick44.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick45.getId()){
            imageViewBrick45.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick46.getId()){
            imageViewBrick46.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick47.getId()){
            imageViewBrick47.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick48.getId()){
            imageViewBrick48.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick49.getId()){
            imageViewBrick49.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick50.getId()){
            imageViewBrick50.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick51.getId()){
            imageViewBrick51.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick52.getId()){
            imageViewBrick52.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick53.getId()){
            imageViewBrick53.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick54.getId()){
            imageViewBrick54.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick55.getId()){
            imageViewBrick55.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick56.getId()){
            imageViewBrick56.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick57.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick58.getId()){
            imageViewBrick58.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick59.getId()){
            imageViewBrick59.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick60.getId()){
            imageViewBrick60.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick61.getId()){
            imageViewBrick61.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick62.getId()){
            imageViewBrick62.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick63.getId()){
            imageViewBrick63.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick64.getId()){
            imageViewBrick64.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick65.getId()){
            imageViewBrick65.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick66.getId()){
            imageViewBrick66.setImageResource(R.drawable.door_brick);
            allBricks(view);
        }
    }

    public void turningRoom(View view){
        if (view.getId() == imageViewBrick1.getId()){
            imageViewBrick1.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick2.getId()){
            imageViewBrick2.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick3.getId()){
            imageViewBrick3.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick4.getId()){
            imageViewBrick4.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick5.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick6.getId()){
            imageViewBrick6.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick7.getId()){
            imageViewBrick7.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick8.getId()){
            imageViewBrick8.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick9.getId()){
            imageViewBrick9.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick10.getId()){
            imageViewBrick10.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick11.getId()){
            imageViewBrick11.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick12.getId()){
            imageViewBrick12.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick13.getId()){
            imageViewBrick13.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick14.getId()){
            imageViewBrick14.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick15.getId()){
            imageViewBrick15.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick16.getId()){
            imageViewBrick16.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick17.getId()){
            imageViewBrick17.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick18.getId()){
            imageViewBrick18.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick19.getId()){
            imageViewBrick19.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick20.getId()){
            imageViewBrick20.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick21.getId()){
            imageViewBrick21.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick22.getId()){
            imageViewBrick22.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick23.getId()){
            imageViewBrick23.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick24.getId()){
            imageViewBrick24.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick25.getId()){
            imageViewBrick25.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick26.getId()){
            imageViewBrick26.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick27.getId()){
            imageViewBrick27.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick28.getId()){
            imageViewBrick28.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick29.getId()){
            imageViewBrick29.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick30.getId()){
            imageViewBrick30.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick31.getId()){
            imageViewBrick31.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick32.getId()){
            imageViewBrick32.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick33.getId()){
            imageViewBrick33.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick34.getId()){
            imageViewBrick34.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick35.getId()){
            imageViewBrick35.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick36.getId()){
            imageViewBrick36.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick37.getId()){
            imageViewBrick37.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick38.getId()){
            imageViewBrick38.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick39.getId()){
            imageViewBrick39.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick40.getId()){
            imageViewBrick40.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick41.getId()){
            imageViewBrick41.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick42.getId()){
            imageViewBrick42.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick43.getId()){
            imageViewBrick43.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick44.getId()){
            imageViewBrick44.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick45.getId()){
            imageViewBrick45.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick46.getId()){
            imageViewBrick46.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick47.getId()){
            imageViewBrick47.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick48.getId()){
            imageViewBrick48.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick49.getId()){
            imageViewBrick49.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick50.getId()){
            imageViewBrick50.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick51.getId()){
            imageViewBrick51.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick52.getId()){
            imageViewBrick52.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick53.getId()){
            imageViewBrick53.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick54.getId()){
            imageViewBrick54.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick55.getId()){
            imageViewBrick55.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick56.getId()){
            imageViewBrick56.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick57.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick58.getId()){
            imageViewBrick58.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick59.getId()){
            imageViewBrick59.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick60.getId()){
            imageViewBrick60.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick61.getId()){
            imageViewBrick61.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick62.getId()){
            imageViewBrick62.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick63.getId()){
            imageViewBrick63.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick64.getId()){
            imageViewBrick64.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick65.getId()){
            imageViewBrick65.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick66.getId()){
            imageViewBrick66.setImageResource(R.drawable.turning_room);
            allBricks(view);
        }
    }

    public void bottomlessWell(View view){
        if (view.getId() == imageViewBrick1.getId()){
            imageViewBrick1.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick2.getId()){
            imageViewBrick2.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick3.getId()){
            imageViewBrick3.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick4.getId()){
            imageViewBrick4.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick5.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick6.getId()){
            imageViewBrick6.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick7.getId()){
            imageViewBrick7.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick8.getId()){
            imageViewBrick8.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick9.getId()){
            imageViewBrick9.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick10.getId()){
            imageViewBrick10.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick11.getId()){
            imageViewBrick11.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick12.getId()){
            imageViewBrick12.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick13.getId()){
            imageViewBrick13.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick14.getId()){
            imageViewBrick14.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick15.getId()){
            imageViewBrick15.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick16.getId()){
            imageViewBrick16.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick17.getId()){
            imageViewBrick17.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick18.getId()){
            imageViewBrick18.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick19.getId()){
            imageViewBrick19.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick20.getId()){
            imageViewBrick20.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick21.getId()){
            imageViewBrick21.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick22.getId()){
            imageViewBrick22.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick23.getId()){
            imageViewBrick23.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick24.getId()){
            imageViewBrick24.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick25.getId()){
            imageViewBrick25.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick26.getId()){
            imageViewBrick26.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick27.getId()){
            imageViewBrick27.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick28.getId()){
            imageViewBrick28.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick29.getId()){
            imageViewBrick29.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick30.getId()){
            imageViewBrick30.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick31.getId()){
            imageViewBrick31.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick32.getId()){
            imageViewBrick32.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick33.getId()){
            imageViewBrick33.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick34.getId()){
            imageViewBrick34.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick35.getId()){
            imageViewBrick35.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick36.getId()){
            imageViewBrick36.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick37.getId()){
            imageViewBrick37.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick38.getId()){
            imageViewBrick38.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick39.getId()){
            imageViewBrick39.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick40.getId()){
            imageViewBrick40.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick41.getId()){
            imageViewBrick41.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick42.getId()){
            imageViewBrick42.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick43.getId()){
            imageViewBrick43.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick44.getId()){
            imageViewBrick44.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick45.getId()){
            imageViewBrick45.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick46.getId()){
            imageViewBrick46.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick47.getId()){
            imageViewBrick47.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick48.getId()){
            imageViewBrick48.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick49.getId()){
            imageViewBrick49.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick50.getId()){
            imageViewBrick50.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick51.getId()){
            imageViewBrick51.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick52.getId()){
            imageViewBrick52.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick53.getId()){
            imageViewBrick53.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick54.getId()){
            imageViewBrick54.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick55.getId()){
            imageViewBrick55.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick56.getId()){
            imageViewBrick56.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick57.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick58.getId()){
            imageViewBrick58.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick59.getId()){
            imageViewBrick59.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick60.getId()){
            imageViewBrick60.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick61.getId()){
            imageViewBrick61.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick62.getId()){
            imageViewBrick62.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick63.getId()){
            imageViewBrick63.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick64.getId()){
            imageViewBrick64.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick65.getId()){
            imageViewBrick65.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick66.getId()){
            imageViewBrick66.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
        }
    }

    public void room(View view){
        if (view.getId() == imageViewBrick1.getId()){
            imageViewBrick1.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick2.getId()){
            imageViewBrick2.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick3.getId()){
            imageViewBrick3.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick4.getId()){
            imageViewBrick4.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick5.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick6.getId()){
            imageViewBrick6.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick7.getId()){
            imageViewBrick7.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick8.getId()){
            imageViewBrick8.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick9.getId()){
            imageViewBrick9.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick10.getId()){
            imageViewBrick10.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick11.getId()){
            imageViewBrick11.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick12.getId()){
            imageViewBrick12.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick13.getId()){
            imageViewBrick13.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick14.getId()){
            imageViewBrick14.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick15.getId()){
            imageViewBrick15.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick16.getId()){
            imageViewBrick16.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick17.getId()){
            imageViewBrick17.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick18.getId()){
            imageViewBrick18.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick19.getId()){
            imageViewBrick19.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick20.getId()){
            imageViewBrick20.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick21.getId()){
            imageViewBrick21.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick22.getId()){
            imageViewBrick22.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick23.getId()){
            imageViewBrick23.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick24.getId()){
            imageViewBrick24.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick25.getId()){
            imageViewBrick25.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick26.getId()){
            imageViewBrick26.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick27.getId()){
            imageViewBrick27.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick28.getId()){
            imageViewBrick28.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick29.getId()){
            imageViewBrick29.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick30.getId()){
            imageViewBrick30.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick31.getId()){
            imageViewBrick31.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick32.getId()){
            imageViewBrick32.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick33.getId()){
            imageViewBrick33.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick34.getId()){
            imageViewBrick34.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick35.getId()){
            imageViewBrick35.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick36.getId()){
            imageViewBrick36.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick37.getId()){
            imageViewBrick37.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick38.getId()){
            imageViewBrick38.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick39.getId()){
            imageViewBrick39.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick40.getId()){
            imageViewBrick40.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick41.getId()){
            imageViewBrick41.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick42.getId()){
            imageViewBrick42.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick43.getId()){
            imageViewBrick43.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick44.getId()){
            imageViewBrick44.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick45.getId()){
            imageViewBrick45.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick46.getId()){
            imageViewBrick46.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick47.getId()){
            imageViewBrick47.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick48.getId()){
            imageViewBrick48.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick49.getId()){
            imageViewBrick49.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick50.getId()){
            imageViewBrick50.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick51.getId()){
            imageViewBrick51.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick52.getId()){
            imageViewBrick52.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick53.getId()){
            imageViewBrick53.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick54.getId()){
            imageViewBrick54.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick55.getId()){
            imageViewBrick55.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick56.getId()){
            imageViewBrick56.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick57.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick58.getId()){
            imageViewBrick58.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick59.getId()){
            imageViewBrick59.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick60.getId()){
            imageViewBrick60.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick61.getId()){
            imageViewBrick61.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick62.getId()){
            imageViewBrick62.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick63.getId()){
            imageViewBrick63.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick64.getId()){
            imageViewBrick64.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick65.getId()){
            imageViewBrick65.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
        if (view.getId() == imageViewBrick66.getId()){
            imageViewBrick66.setImageResource(R.drawable.room_brick);
            allBricks(view);
        }
    }

    public void allBricks(View view){
        if (view.getId() == imageViewBrick1.getId()){
            imageViewBrick1.setClickable(false);
        }
        if (view.getId() == imageViewBrick2.getId()){
            imageViewBrick2.setClickable(false);
        }
        if (view.getId() == imageViewBrick3.getId()){
            imageViewBrick3.setClickable(false);
        }
        if (view.getId() == imageViewBrick4.getId()){
            imageViewBrick4.setClickable(false);
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick5.setClickable(false);
        }
        if (view.getId() == imageViewBrick6.getId()){
            imageViewBrick6.setClickable(false);
        }
        if (view.getId() == imageViewBrick7.getId()){
            imageViewBrick7.setClickable(false);
        }
        if (view.getId() == imageViewBrick8.getId()){
            imageViewBrick8.setClickable(false);
        }
        if (view.getId() == imageViewBrick9.getId()){
            imageViewBrick9.setClickable(false);
        }
        if (view.getId() == imageViewBrick10.getId()){
            imageViewBrick10.setClickable(false);
        }
        if (view.getId() == imageViewBrick11.getId()){
            imageViewBrick11.setClickable(false);
        }
        if (view.getId() == imageViewBrick12.getId()){
            imageViewBrick12.setClickable(false);
        }
        if (view.getId() == imageViewBrick13.getId()){
            imageViewBrick13.setClickable(false);
        }
        if (view.getId() == imageViewBrick1.getId()){
            imageViewBrick14.setClickable(false);
        }
        if (view.getId() == imageViewBrick15.getId()){
            imageViewBrick15.setClickable(false);
        }
        if (view.getId() == imageViewBrick16.getId()){
            imageViewBrick16.setClickable(false);
        }
        if (view.getId() == imageViewBrick17.getId()){
            imageViewBrick17.setClickable(false);
        }
        if (view.getId() == imageViewBrick18.getId()){
            imageViewBrick18.setClickable(false);
        }
        if (view.getId() == imageViewBrick19.getId()){
            imageViewBrick19.setClickable(false);
        }
        if (view.getId() == imageViewBrick20.getId()){
            imageViewBrick20.setClickable(false);
        }
        if (view.getId() == imageViewBrick21.getId()){
            imageViewBrick21.setClickable(false);
        }
        if (view.getId() == imageViewBrick22.getId()){
            imageViewBrick22.setClickable(false);
        }
        if (view.getId() == imageViewBrick23.getId()){
            imageViewBrick23.setClickable(false);
        }
        if (view.getId() == imageViewBrick24.getId()){
            imageViewBrick24.setClickable(false);
        }
        if (view.getId() == imageViewBrick25.getId()){
            imageViewBrick25.setClickable(false);
        }
        if (view.getId() == imageViewBrick26.getId()){
            imageViewBrick26.setClickable(false);
        }
        if (view.getId() == imageViewBrick27.getId()){
            imageViewBrick27.setClickable(false);
        }
        if (view.getId() == imageViewBrick28.getId()){
            imageViewBrick28.setClickable(false);
        }
        if (view.getId() == imageViewBrick29.getId()){
            imageViewBrick29.setClickable(false);
        }
        if (view.getId() == imageViewBrick30.getId()){
            imageViewBrick30.setClickable(false);
        }
        if (view.getId() == imageViewBrick31.getId()){
            imageViewBrick31.setClickable(false);
        }
        if (view.getId() == imageViewBrick32.getId()){
            imageViewBrick32.setClickable(false);
        }
        if (view.getId() == imageViewBrick33.getId()){
            imageViewBrick33.setClickable(false);
        }
        if (view.getId() == imageViewBrick34.getId()){
            imageViewBrick34.setClickable(false);
        }
        if (view.getId() == imageViewBrick35.getId()){
            imageViewBrick35.setClickable(false);
        }
        if (view.getId() == imageViewBrick36.getId()){
            imageViewBrick36.setClickable(false);
        }
        if (view.getId() == imageViewBrick37.getId()){
            imageViewBrick37.setClickable(false);
        }
        if (view.getId() == imageViewBrick38.getId()){
            imageViewBrick38.setClickable(false);
        }
        if (view.getId() == imageViewBrick39.getId()){
            imageViewBrick39.setClickable(false);
        }
        if (view.getId() == imageViewBrick40.getId()){
            imageViewBrick40.setClickable(false);
        }
        if (view.getId() == imageViewBrick41.getId()){
            imageViewBrick41.setClickable(false);
        }
        if (view.getId() == imageViewBrick42.getId()){
            imageViewBrick42.setClickable(false);
        }
        if (view.getId() == imageViewBrick43.getId()){
            imageViewBrick43.setClickable(false);
        }
        if (view.getId() == imageViewBrick44.getId()){
            imageViewBrick44.setClickable(false);
        }
        if (view.getId() == imageViewBrick45.getId()){
            imageViewBrick45.setClickable(false);
        }
        if (view.getId() == imageViewBrick46.getId()){
            imageViewBrick46.setClickable(false);
        }
        if (view.getId() == imageViewBrick47.getId()){
            imageViewBrick47.setClickable(false);
        }
        if (view.getId() == imageViewBrick4.getId()){
            imageViewBrick48.setClickable(false);
        }
        if (view.getId() == imageViewBrick49.getId()){
            imageViewBrick49.setClickable(false);
        }
        if (view.getId() == imageViewBrick50.getId()){
            imageViewBrick50.setClickable(false);
        }
        if (view.getId() == imageViewBrick51.getId()){
            imageViewBrick51.setClickable(false);
        }
        if (view.getId() == imageViewBrick52.getId()){
            imageViewBrick52.setClickable(false);
        }
        if (view.getId() == imageViewBrick53.getId()){
            imageViewBrick53.setClickable(false);
        }
        if (view.getId() == imageViewBrick54.getId()){
            imageViewBrick54.setClickable(false);
        }
        if (view.getId() == imageViewBrick55.getId()){
            imageViewBrick55.setClickable(false);
        }
        if (view.getId() == imageViewBrick56.getId()){
            imageViewBrick56.setClickable(false);
        }
        if (view.getId() == imageViewBrick57.getId()){
            imageViewBrick57.setClickable(false);
        }
        if (view.getId() == imageViewBrick58.getId()){
            imageViewBrick58.setClickable(false);
        }
        if (view.getId() == imageViewBrick59.getId()){
            imageViewBrick59.setClickable(false);
        }
        if (view.getId() == imageViewBrick60.getId()){
            imageViewBrick60.setClickable(false);
        }
        if (view.getId() == imageViewBrick61.getId()){
            imageViewBrick61.setClickable(false);
        }
        if (view.getId() == imageViewBrick62.getId()){
            imageViewBrick62.setClickable(false);
        }
        if (view.getId() == imageViewBrick63.getId()){
            imageViewBrick63.setClickable(false);
        }
        if (view.getId() == imageViewBrick64.getId()){
            imageViewBrick64.setClickable(false);
        }
        if (view.getId() == imageViewBrick65.getId()){
            imageViewBrick65.setClickable(false);
        }
        if (view.getId() == imageViewBrick66.getId()){
            imageViewBrick6.setClickable(false);
        }
    }

    public void trapCard(){
        Random rand = new Random();
        int randTrap = rand.nextInt(5);

        switch (randTrap){
            case 0:
                Intent snake = new Intent(MainActivity.this, PoisonousSnakeTrapCard.class);
                startActivity(snake);
                finish();
                break;
            case 1:
                Intent fog = new Intent(MainActivity.this, ToxicFogTrapCard.class);
                startActivity(fog);
                finish();
                break;
            case 2:
                Intent explossion = new Intent(MainActivity.this, ExplossionTrapCard.class);
                startActivity(explossion);
                finish();
                break;
            case 3:
                Intent roofCollapse = new Intent(MainActivity.this, TheRoofCollapsesTrapCard.class);
                startActivity(roofCollapse);
                finish();
                break;
            case 4:
                Intent arrow = new Intent(MainActivity.this, ArrowsFromWallTrapCard.class);
                startActivity(arrow);
                finish();
                break;
        }
    }

    public void clutterCard() {
        Intent intent = new Intent(MainActivity.this, Clutter.class);
        startActivity(intent);
        finish();
    }

    private void trapGridCard() {
        Intent intent = new Intent(MainActivity.this, TrapGridBrick.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();

        int health = sharedPreferences.getInt("health", 0);
        int days = sharedPreferences.getInt("days", 0);

        days--;

        editor.putInt("days", days);
        editor.commit();


        if (health <= 0 ){
            Intent intent = new Intent(MainActivity.this, DeadActivity.class);
            startActivity(intent);
            finish();
        }



    }
}