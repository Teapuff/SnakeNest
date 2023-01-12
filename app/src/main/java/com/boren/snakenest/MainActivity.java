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

        switch (randBrick){
            case 0:
                trap(view);
                break;
            case 1:
                darkroom(view);
                break;
            case 2:
                clutter(view);//inte kunna gå vidare om man misslyckas
                break;
            case 3:
                corridor(view); //info att man får ta en ny bricka
                break;
            case 4:
                trapGrid(view); //dagarna tas inte bort när man misslyckas öppna.
                break;
            case 5:
                door(view);
                break;
            case 6:
                turningRoom(view); //fixa eftes jag fixat spelplanen
                break;
            case 7:
                bottomlessWell(view);
                break;
            case 8:
                room(view); //eventeullt fixa item stack, just nu är det endast attak för monster
                break;
        }
    }

    public void trap(View view){
        if (view.getId() == imageViewBrick1.getId()){

            if (!sharedPreferences.getBoolean("brickBool1", false))
            {
                int picture = R.drawable.trap_brick;
                imageViewBrick1.setImageResource(picture);
                editor.putInt("brick1", picture);
                editor.putBoolean("brickBool1", true);
                editor.putString("brickType1", "trap");
                editor.commit();

                allBricks(view);
                trapCard();
            }
            else if (sharedPreferences.getBoolean("brickBool1", false)){
                //String brickType1 = sharedPreferences.getString("brickType1", "");
                if (sharedPreferences.getString("brickType1", "").equals("trap")){
                    trapCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick2.getId()){
            if (!sharedPreferences.getBoolean("brickBool2", false))
            {
                int picture = R.drawable.trap_brick;
                imageViewBrick2.setImageResource(picture);
                editor.putInt("brick2", picture);
                editor.putBoolean("brickBool2", true);
                editor.putString("brickType2", "trap");
                editor.commit();

                allBricks(view);
                trapCard();
            }
            else if (sharedPreferences.getBoolean("brickBool2", false)){
                if (sharedPreferences.getString("brickType2", "").equals("trap")){
                    trapCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick3.getId()){
            if (!sharedPreferences.getBoolean("brickBool3", false))
            {
                int picture = R.drawable.trap_brick;
                imageViewBrick3.setImageResource(picture);
                editor.putInt("brick3", picture);
                editor.putBoolean("brickBool3", true);
                editor.putString("brickType3", "trap");
                editor.commit();

                allBricks(view);
                trapCard();
            }
            else if (sharedPreferences.getBoolean("brickBool3", false)){
                if (sharedPreferences.getString("brickType3", "").equals("trap")){
                    trapCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick4.getId()){
            if (!sharedPreferences.getBoolean("brickBool4", false))
            {
                int picture = R.drawable.trap_brick;
                imageViewBrick4.setImageResource(picture);
                editor.putInt("brick4", picture);
                editor.putBoolean("brickBool4", true);
                editor.putString("brickType4", "trap");
                editor.commit();

                allBricks(view);
                trapCard();
            }
            else if (sharedPreferences.getBoolean("brickBool4", false)){
                if (sharedPreferences.getString("brickType4", "").equals("trap")){
                    trapCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick5.getId()){
            if (!sharedPreferences.getBoolean("brickBool5", false))
            {
                int picture = R.drawable.trap_brick;
                imageViewBrick5.setImageResource(picture);
                editor.putInt("brick5", picture);
                editor.putBoolean("brickBool5", true);
                editor.putString("brickType5", "trap");
                editor.commit();

                allBricks(view);
                trapCard();
            }
            else if (sharedPreferences.getBoolean("brickBool5", false)){
                if (sharedPreferences.getString("brickType5", "").equals("trap")){
                    trapCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick6.getId()){
            if (!sharedPreferences.getBoolean("brickBool6", false))
            {
                int picture = R.drawable.trap_brick;
                imageViewBrick6.setImageResource(picture);
                editor.putInt("brick6", picture);
                editor.putBoolean("brickBool6", true);
                editor.putString("brickType6", "trap");
                editor.commit();

                allBricks(view);
                trapCard();
            }
            else if (sharedPreferences.getBoolean("brickBool6", false)){
                if (sharedPreferences.getString("brickType6", "").equals("trap")){
                    trapCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick7.getId()){
            if (!sharedPreferences.getBoolean("brickBool7", false))
            {
                int picture = R.drawable.trap_brick;
                imageViewBrick7.setImageResource(picture);
                editor.putInt("brick7", picture);
                editor.putBoolean("brickBool7", true);
                editor.putString("brickType7", "trap");
                editor.commit();

                allBricks(view);
                trapCard();
            }
            else if (sharedPreferences.getBoolean("brickBool7", false)){
                if (sharedPreferences.getString("brickType7", "").equals("trap")){
                    trapCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick8.getId()){
            if (!sharedPreferences.getBoolean("brickBool8", false))
            {
                int picture = R.drawable.trap_brick;
                imageViewBrick8.setImageResource(picture);
                editor.putInt("brick8", picture);
                editor.putBoolean("brickBool8", true);
                editor.putString("brickType8", "trap");
                editor.commit();

                allBricks(view);
                trapCard();
            }
            else if (sharedPreferences.getBoolean("brickBool8", false)){
                if (sharedPreferences.getString("brickType8", "").equals("trap")){
                    trapCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick9.getId()){
            if (!sharedPreferences.getBoolean("brickBool9", false))
            {
                int picture = R.drawable.trap_brick;
                imageViewBrick9.setImageResource(picture);
                editor.putInt("brick9", picture);
                editor.putBoolean("brickBool9", true);
                editor.putString("brickType9", "trap");
                editor.commit();

                allBricks(view);
                trapCard();
            }
            else if (sharedPreferences.getBoolean("brickBool9", false)){
                if (sharedPreferences.getString("brickType9", "").equals("trap")){
                    trapCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick10.getId()){
            if (!sharedPreferences.getBoolean("brickBool10", false))
            {
                int picture = R.drawable.trap_brick;
                imageViewBrick4.setImageResource(picture);
                editor.putInt("brick10", picture);
                editor.putBoolean("brickBool10", true);
                editor.putString("brickType10", "trap");
                editor.commit();

                allBricks(view);
                trapCard();
            }
            else if (sharedPreferences.getBoolean("brickBool10", false)){
                if (sharedPreferences.getString("brickType10", "").equals("trap")){
                    trapCard();
                    allBricks(view);
                }
            }
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
            if (!sharedPreferences.getBoolean("brickBool1", false))
            {
                int picture = R.drawable.darkroom_brick;
                imageViewBrick1.setImageResource(picture);
                editor.putInt("brick1", picture);
                editor.putBoolean("brickBool1", true);
                editor.putString("brickType1", "dark");
                editor.commit();

                allBricks(view);
                darkRoomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool1", false)){
                if (sharedPreferences.getString("brickType1", "").equals("dark")){
                    allBricks(view);
                    darkRoomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick2.getId()){
            if (!sharedPreferences.getBoolean("brickBool2", false))
            {
                int picture = R.drawable.darkroom_brick;
                imageViewBrick2.setImageResource(picture);
                editor.putInt("brick2", picture);
                editor.putBoolean("brickBool2", true);
                editor.putString("brickType2", "dark");
                editor.commit();

                allBricks(view);
                darkRoomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool2", false)){
                if (sharedPreferences.getString("brickType2", "").equals("dark")){
                    allBricks(view);
                    darkRoomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick3.getId()){
            if (!sharedPreferences.getBoolean("brickBool3", false))
            {
                int picture = R.drawable.darkroom_brick;
                imageViewBrick3.setImageResource(picture);
                editor.putInt("brick3", picture);
                editor.putBoolean("brickBool3", true);
                editor.putString("brickType3", "dark");
                editor.commit();

                allBricks(view);
                darkRoomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool3", false)){
                if (sharedPreferences.getString("brickType3", "").equals("dark")){
                    allBricks(view);
                    darkRoomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick4.getId()){
            if (!sharedPreferences.getBoolean("brickBool4", false))
            {
                int picture = R.drawable.darkroom_brick;
                imageViewBrick4.setImageResource(picture);
                editor.putInt("brick4", picture);
                editor.putBoolean("brickBool4", true);
                editor.putString("brickType4", "dark");
                editor.commit();

                allBricks(view);
                darkRoomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool4", false)){
                if (sharedPreferences.getString("brickType4", "").equals("dark")){
                    allBricks(view);
                    darkRoomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick5.getId()){
            if (!sharedPreferences.getBoolean("brickBool5", false))
            {
                int picture = R.drawable.darkroom_brick;
                imageViewBrick5.setImageResource(picture);
                editor.putInt("brick5", picture);
                editor.putBoolean("brickBool5", true);
                editor.putString("brickType5", "dark");
                editor.commit();

                allBricks(view);
                darkRoomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool5", false)){
                if (sharedPreferences.getString("brickType5", "").equals("dark")){
                    allBricks(view);
                    darkRoomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick6.getId()){
            if (!sharedPreferences.getBoolean("brickBool6", false))
            {
                int picture = R.drawable.darkroom_brick;
                imageViewBrick6.setImageResource(picture);
                editor.putInt("brick6", picture);
                editor.putBoolean("brickBool6", true);
                editor.putString("brickType6", "dark");
                editor.commit();

                allBricks(view);
                darkRoomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool6", false)){
                if (sharedPreferences.getString("brickType6", "").equals("dark")){
                    allBricks(view);
                    darkRoomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick7.getId()){
            if (!sharedPreferences.getBoolean("brickBool7", false))
            {
                int picture = R.drawable.darkroom_brick;
                imageViewBrick7.setImageResource(picture);
                editor.putInt("brick7", picture);
                editor.putBoolean("brickBool7", true);
                editor.putString("brickType7", "dark");
                editor.commit();

                allBricks(view);
                darkRoomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool7", false)){
                if (sharedPreferences.getString("brickType7", "").equals("dark")){
                    allBricks(view);
                    darkRoomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick8.getId()){
            if (!sharedPreferences.getBoolean("brickBool8", false))
            {
                int picture = R.drawable.darkroom_brick;
                imageViewBrick8.setImageResource(picture);
                editor.putInt("brick8", picture);
                editor.putBoolean("brickBool8", true);
                editor.putString("brickType8", "dark");
                editor.commit();

                allBricks(view);
                darkRoomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool8", false)){
                if (sharedPreferences.getString("brickType8", "").equals("dark")){
                    allBricks(view);
                    darkRoomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick9.getId()){
            if (!sharedPreferences.getBoolean("brickBool9", false))
            {
                int picture = R.drawable.darkroom_brick;
                imageViewBrick9.setImageResource(picture);
                editor.putInt("brick9", picture);
                editor.putBoolean("brickBool9", true);
                editor.putString("brickType9", "dark");
                editor.commit();

                allBricks(view);
                darkRoomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool9", false)){
                if (sharedPreferences.getString("brickType9", "").equals("dark")){
                    allBricks(view);
                    darkRoomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick10.getId()){
            if (!sharedPreferences.getBoolean("brickBool10", false))
            {
                int picture = R.drawable.darkroom_brick;
                imageViewBrick10.setImageResource(picture);
                editor.putInt("brick10", picture);
                editor.putBoolean("brickBool10", true);
                editor.putString("brickType10", "dark");
                editor.commit();

                allBricks(view);
                darkRoomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool10", false)){
                if (sharedPreferences.getString("brickType10", "").equals("dark")){
                    allBricks(view);
                    darkRoomCard();
                }
            }
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

            if (!sharedPreferences.getBoolean("brickBool1", false))
            {
                int picture = R.drawable.clutter_brick;
                imageViewBrick1.setImageResource(picture);
                editor.putInt("brick1", picture);
                editor.putBoolean("brickBool1", true);
                editor.putString("brickType1", "clutter");
                editor.commit();

                allBricks(view);
                clutterCard();
            }
            else if (sharedPreferences.getBoolean("brickBool1", false)){
                if (sharedPreferences.getString("brickType1", "").equals("clutter")){
                    clutterCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick2.getId()){
            if (!sharedPreferences.getBoolean("brickBool2", false))
            {
                int picture = R.drawable.clutter_brick;
                imageViewBrick2.setImageResource(picture);
                editor.putInt("brick2", picture);
                editor.putBoolean("brickBool2", true);
                editor.putString("brickType2", "clutter");
                editor.commit();

                allBricks(view);
                clutterCard();
            }
            else if (sharedPreferences.getBoolean("brickBool2", false)){
                if (sharedPreferences.getString("brickType2", "").equals("clutter")){
                    clutterCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick3.getId()){
            if (!sharedPreferences.getBoolean("brickBool3", false))
            {
                int picture = R.drawable.clutter_brick;
                imageViewBrick3.setImageResource(picture);
                editor.putInt("brick3", picture);
                editor.putBoolean("brickBool3", true);
                editor.putString("brickType3", "clutter");
                editor.commit();

                allBricks(view);
                clutterCard();
            }
            else if (sharedPreferences.getBoolean("brickBool3", false)){
                if (sharedPreferences.getString("brickType3", "").equals("clutter")){
                    clutterCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick4.getId()){
            if (!sharedPreferences.getBoolean("brickBool4", false))
            {
                int picture = R.drawable.clutter_brick;
                imageViewBrick4.setImageResource(picture);
                editor.putInt("brick4", picture);
                editor.putBoolean("brickBool4", true);
                editor.putString("brickType4", "clutter");
                editor.commit();

                allBricks(view);
                clutterCard();
            }
            else if (sharedPreferences.getBoolean("brickBool4", false)){
                if (sharedPreferences.getString("brickType4", "").equals("clutter")){
                    clutterCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick5.getId()){
            if (!sharedPreferences.getBoolean("brickBool5", false))
            {
                int picture = R.drawable.clutter_brick;
                imageViewBrick5.setImageResource(picture);
                editor.putInt("brick5", picture);
                editor.putBoolean("brickBool5", true);
                editor.putString("brickType5", "clutter");
                editor.commit();

                allBricks(view);
                clutterCard();
            }
            else if (sharedPreferences.getBoolean("brickBool5", false)){
                if (sharedPreferences.getString("brickType5", "").equals("clutter")){
                    clutterCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick6.getId()){
            if (!sharedPreferences.getBoolean("brickBool6", false))
            {
                int picture = R.drawable.clutter_brick;
                imageViewBrick6.setImageResource(picture);
                editor.putInt("brick6", picture);
                editor.putBoolean("brickBool6", true);
                editor.putString("brickType6", "clutter");
                editor.commit();

                allBricks(view);
                clutterCard();
            }
            else if (sharedPreferences.getBoolean("brickBool6", false)){
                if (sharedPreferences.getString("brickType6", "").equals("clutter")){
                    clutterCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick7.getId()){
            if (!sharedPreferences.getBoolean("brickBool7", false))
            {
                int picture = R.drawable.clutter_brick;
                imageViewBrick7.setImageResource(picture);
                editor.putInt("brick7", picture);
                editor.putBoolean("brickBool7", true);
                editor.putString("brickType7", "clutter");
                editor.commit();

                allBricks(view);
                clutterCard();
            }
            else if (sharedPreferences.getBoolean("brickBool7", false)){
                if (sharedPreferences.getString("brickType7", "").equals("clutter")){
                    clutterCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick8.getId()){
            if (!sharedPreferences.getBoolean("brickBool8", false))
            {
                int picture = R.drawable.clutter_brick;
                imageViewBrick8.setImageResource(picture);
                editor.putInt("brick8", picture);
                editor.putBoolean("brickBool8", true);
                editor.putString("brickType8", "clutter");
                editor.commit();

                allBricks(view);
                clutterCard();
            }
            else if (sharedPreferences.getBoolean("brickBool8", false)){
                if (sharedPreferences.getString("brickType8", "").equals("clutter")){
                    clutterCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick9.getId()){
            if (!sharedPreferences.getBoolean("brickBool9", false))
            {
                int picture = R.drawable.clutter_brick;
                imageViewBrick1.setImageResource(picture);
                editor.putInt("brick9", picture);
                editor.putBoolean("brickBool9", true);
                editor.putString("brickType9", "clutter");
                editor.commit();

                allBricks(view);
                clutterCard();
            }
            else if (sharedPreferences.getBoolean("brickBool9", false)){
                if (sharedPreferences.getString("brickType9", "").equals("clutter")){
                    clutterCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick10.getId()){
            if (!sharedPreferences.getBoolean("brickBool10", false))
            {
                int picture = R.drawable.clutter_brick;
                imageViewBrick10.setImageResource(picture);
                editor.putInt("brick10", picture);
                editor.putBoolean("brickBool10", true);
                editor.putString("brickType10", "clutter");
                editor.commit();

                allBricks(view);
                clutterCard();
            }
            else if (sharedPreferences.getBoolean("brickBool10", false)){
                if (sharedPreferences.getString("brickType10", "").equals("clutter")){
                    clutterCard();
                    allBricks(view);
                }
            }
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

            if (!sharedPreferences.getBoolean("brickBool1", false))
            {
                int picture = R.drawable.corridor_brick;
                imageViewBrick1.setImageResource(picture);
                editor.putInt("brick1", picture);
                editor.putBoolean("brickBool1", true);
                editor.putString("brickType1", "corridor");
                editor.commit();

                allBricks(view);
                corridorBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool1", false)){
                if (sharedPreferences.getString("brickType1", "").equals("corridor")){
                    allBricks(view);
                    corridorBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick2.getId()){
            if (!sharedPreferences.getBoolean("brickBool2", false))
            {
                int picture = R.drawable.corridor_brick;
                imageViewBrick2.setImageResource(picture);
                editor.putInt("brick2", picture);
                editor.putBoolean("brickBool2", true);
                editor.putString("brickType2", "corridor");
                editor.commit();

                allBricks(view);
                corridorBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool2", false)){
                if (sharedPreferences.getString("brickType2", "").equals("corridor")){
                    allBricks(view);
                    corridorBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick3.getId()){
            if (!sharedPreferences.getBoolean("brickBool3", false))
            {
                int picture = R.drawable.corridor_brick;
                imageViewBrick3.setImageResource(picture);
                editor.putInt("brick3", picture);
                editor.putBoolean("brickBool3", true);
                editor.putString("brickType3", "corridor");
                editor.commit();

                allBricks(view);
                corridorBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool3", false)){
                if (sharedPreferences.getString("brickType3", "").equals("corridor")){
                    allBricks(view);
                    corridorBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick4.getId()){
            if (!sharedPreferences.getBoolean("brickBool4", false))
            {
                int picture = R.drawable.corridor_brick;
                imageViewBrick4.setImageResource(picture);
                editor.putInt("brick4", picture);
                editor.putBoolean("brickBool4", true);
                editor.putString("brickType4", "corridor");
                editor.commit();

                allBricks(view);
                corridorBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool4", false)){
                if (sharedPreferences.getString("brickType4", "").equals("corridor")){
                    allBricks(view);
                    corridorBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick5.getId()){
            if (!sharedPreferences.getBoolean("brickBool5", false))
            {
                int picture = R.drawable.corridor_brick;
                imageViewBrick5.setImageResource(picture);
                editor.putInt("brick5", picture);
                editor.putBoolean("brickBool5", true);
                editor.putString("brickType5", "corridor");
                editor.commit();

                allBricks(view);
                corridorBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool5", false)){
                if (sharedPreferences.getString("brickType5", "").equals("corridor")){
                    allBricks(view);
                    corridorBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick6.getId()){
            if (!sharedPreferences.getBoolean("brickBool6", false))
            {
                int picture = R.drawable.corridor_brick;
                imageViewBrick6.setImageResource(picture);
                editor.putInt("brick6", picture);
                editor.putBoolean("brickBool6", true);
                editor.putString("brickType6", "corridor");
                editor.commit();

                allBricks(view);
                corridorBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool6", false)){
                if (sharedPreferences.getString("brickType6", "").equals("corridor")){
                    allBricks(view);
                    corridorBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick7.getId()){
            if (!sharedPreferences.getBoolean("brickBool7", false))
            {
                int picture = R.drawable.corridor_brick;
                imageViewBrick7.setImageResource(picture);
                editor.putInt("brick7", picture);
                editor.putBoolean("brickBool7", true);
                editor.putString("brickType7", "corridor");
                editor.commit();

                allBricks(view);
                corridorBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool7", false)){
                if (sharedPreferences.getString("brickType7", "").equals("corridor")){
                    allBricks(view);
                    corridorBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick8.getId()){
            if (!sharedPreferences.getBoolean("brickBool8", false))
            {
                int picture = R.drawable.corridor_brick;
                imageViewBrick8.setImageResource(picture);
                editor.putInt("brick8", picture);
                editor.putBoolean("brickBool8", true);
                editor.putString("brickType8", "corridor");
                editor.commit();

                allBricks(view);
                corridorBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool8", false)){
                if (sharedPreferences.getString("brickType8", "").equals("corridor")){
                    allBricks(view);
                    corridorBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick9.getId()){
            if (!sharedPreferences.getBoolean("brickBool9", false))
            {
                int picture = R.drawable.corridor_brick;
                imageViewBrick9.setImageResource(picture);
                editor.putInt("brick9", picture);
                editor.putBoolean("brickBool9", true);
                editor.putString("brickType9", "corridor");
                editor.commit();

                allBricks(view);
                corridorBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool9", false)){
                if (sharedPreferences.getString("brickType9", "").equals("corridor")){
                    allBricks(view);
                    corridorBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick10.getId()){
            if (!sharedPreferences.getBoolean("brickBool10", false))
            {
                int picture = R.drawable.corridor_brick;
                imageViewBrick1.setImageResource(picture);
                editor.putInt("brick10", picture);
                editor.putBoolean("brickBool10", true);
                editor.putString("brickType10", "corridor");
                editor.commit();

                allBricks(view);
                corridorBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool1", false)){
                if (sharedPreferences.getString("brickType1", "").equals("corridor")){
                    allBricks(view);
                    corridorBrick();
                }
            }
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

            if (!sharedPreferences.getBoolean("brickBool1", false))
            {
                int picture = R.drawable.trap_grid_brick;
                imageViewBrick1.setImageResource(picture);
                editor.putInt("brick1", picture);
                editor.putBoolean("brickBool1", true);
                editor.putString("brickType1", "trapGrid");
                editor.commit();

                allBricks(view);
                trapGridCard();
            }
            else if (sharedPreferences.getBoolean("brickBool1", false)){
                if (sharedPreferences.getString("brickType1", "").equals("trapGrid")){
                    trapGridCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick2.getId()){
            if (!sharedPreferences.getBoolean("brickBool2", false))
            {
                int picture = R.drawable.trap_grid_brick;
                imageViewBrick2.setImageResource(picture);
                editor.putInt("brick2", picture);
                editor.putBoolean("brickBool2", true);
                editor.putString("brickType2", "trapGrid");
                editor.commit();

                allBricks(view);
                trapGridCard();
            }
            else if (sharedPreferences.getBoolean("brickBool2", false)){
                if (sharedPreferences.getString("brickType2", "").equals("trapGrid")){
                    trapGridCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick3.getId()){
            if (!sharedPreferences.getBoolean("brickBool3", false))
            {
                int picture = R.drawable.trap_grid_brick;
                imageViewBrick3.setImageResource(picture);
                editor.putInt("brick3", picture);
                editor.putBoolean("brickBool3", true);
                editor.putString("brickType3", "trapGrid");
                editor.commit();

                allBricks(view);
                trapGridCard();
            }
            else if (sharedPreferences.getBoolean("brickBool3", false)){
                if (sharedPreferences.getString("brickType3", "").equals("trapGrid")){
                    trapGridCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick4.getId()){
            if (!sharedPreferences.getBoolean("brickBool4", false))
            {
                int picture = R.drawable.trap_grid_brick;
                imageViewBrick4.setImageResource(picture);
                editor.putInt("brick4", picture);
                editor.putBoolean("brickBool4", true);
                editor.putString("brickType4", "trapGrid");
                editor.commit();

                allBricks(view);
                trapGridCard();
            }
            else if (sharedPreferences.getBoolean("brickBool4", false)){
                if (sharedPreferences.getString("brickType4", "").equals("trapGrid")){
                    trapGridCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick5.getId()){
            if (!sharedPreferences.getBoolean("brickBool5", false))
            {
                int picture = R.drawable.trap_grid_brick;
                imageViewBrick5.setImageResource(picture);
                editor.putInt("brick5", picture);
                editor.putBoolean("brickBool5", true);
                editor.putString("brickType5", "trapGrid");
                editor.commit();

                allBricks(view);
                trapGridCard();
            }
            else if (sharedPreferences.getBoolean("brickBool5", false)){
                if (sharedPreferences.getString("brickType5", "").equals("trapGrid")){
                    trapGridCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick6.getId()){
            if (!sharedPreferences.getBoolean("brickBool6", false))
            {
                int picture = R.drawable.trap_grid_brick;
                imageViewBrick6.setImageResource(picture);
                editor.putInt("brick6", picture);
                editor.putBoolean("brickBool6", true);
                editor.putString("brickType6", "trapGrid");
                editor.commit();

                allBricks(view);
                trapGridCard();
            }
            else if (sharedPreferences.getBoolean("brickBool6", false)){
                if (sharedPreferences.getString("brickType6", "").equals("trapGrid")){
                    trapGridCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick7.getId()){
            if (!sharedPreferences.getBoolean("brickBool7", false))
            {
                int picture = R.drawable.trap_grid_brick;
                imageViewBrick7.setImageResource(picture);
                editor.putInt("brick7", picture);
                editor.putBoolean("brickBool7", true);
                editor.putString("brickType7", "trapGrid");
                editor.commit();

                allBricks(view);
                trapGridCard();
            }
            else if (sharedPreferences.getBoolean("brickBool7", false)){
                if (sharedPreferences.getString("brickType7", "").equals("trapGrid")){
                    trapGridCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick8.getId()){
            if (!sharedPreferences.getBoolean("brickBool8", false))
            {
                int picture = R.drawable.trap_grid_brick;
                imageViewBrick8.setImageResource(picture);
                editor.putInt("brick8", picture);
                editor.putBoolean("brickBool8", true);
                editor.putString("brickType8", "trapGrid");
                editor.commit();

                allBricks(view);
                trapGridCard();
            }
            else if (sharedPreferences.getBoolean("brickBool8", false)){
                if (sharedPreferences.getString("brickType8", "").equals("trapGrid")){
                    trapGridCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick9.getId()){
            if (!sharedPreferences.getBoolean("brickBool9", false))
            {
                int picture = R.drawable.trap_grid_brick;
                imageViewBrick9.setImageResource(picture);
                editor.putInt("brick9", picture);
                editor.putBoolean("brickBool9", true);
                editor.putString("brickType9", "trapGrid");
                editor.commit();

                allBricks(view);
                trapGridCard();
            }
            else if (sharedPreferences.getBoolean("brickBool9", false)){
                if (sharedPreferences.getString("brickType9", "").equals("trapGrid")){
                    trapGridCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick10.getId()){
            if (!sharedPreferences.getBoolean("brickBool10", false))
            {
                int picture = R.drawable.trap_grid_brick;
                imageViewBrick10.setImageResource(picture);
                editor.putInt("brick10", picture);
                editor.putBoolean("brickBool10", true);
                editor.putString("brickType10", "trapGrid");
                editor.commit();

                allBricks(view);
                trapGridCard();
            }
            else if (sharedPreferences.getBoolean("brickBool10", false)){
                if (sharedPreferences.getString("brickType10", "").equals("trapGrid")){
                    trapGridCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick11.getId()){
            imageViewBrick11.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick12.getId()){
            imageViewBrick12.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick13.getId()){
            imageViewBrick13.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick14.getId()){
            imageViewBrick14.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick15.getId()){
            imageViewBrick15.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick16.getId()){
            imageViewBrick16.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick17.getId()){
            imageViewBrick17.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick18.getId()){
            imageViewBrick18.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick19.getId()){
            imageViewBrick19.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick20.getId()){
            imageViewBrick20.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick21.getId()){
            imageViewBrick21.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick22.getId()){
            imageViewBrick22.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick23.getId()){
            imageViewBrick23.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick24.getId()){
            imageViewBrick24.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick25.getId()){
            imageViewBrick25.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick26.getId()){
            imageViewBrick26.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick27.getId()){
            imageViewBrick27.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick28.getId()){
            imageViewBrick28.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick29.getId()){
            imageViewBrick29.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick30.getId()){
            imageViewBrick30.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick31.getId()){
            imageViewBrick31.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick32.getId()){
            imageViewBrick32.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick33.getId()){
            imageViewBrick33.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick34.getId()){
            imageViewBrick34.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick35.getId()){
            imageViewBrick35.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick36.getId()){
            imageViewBrick36.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick37.getId()){
            imageViewBrick37.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick38.getId()){
            imageViewBrick38.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick39.getId()){
            imageViewBrick39.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick40.getId()){
            imageViewBrick40.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick41.getId()){
            imageViewBrick41.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick42.getId()){
            imageViewBrick42.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick43.getId()){
            imageViewBrick43.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick44.getId()){
            imageViewBrick44.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick45.getId()){
            imageViewBrick45.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick46.getId()){
            imageViewBrick46.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick47.getId()){
            imageViewBrick47.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick48.getId()){
            imageViewBrick48.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick49.getId()){
            imageViewBrick49.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick50.getId()){
            imageViewBrick50.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick51.getId()){
            imageViewBrick51.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick52.getId()){
            imageViewBrick52.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick53.getId()){
            imageViewBrick53.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick54.getId()){
            imageViewBrick54.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick55.getId()){
            imageViewBrick55.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick56.getId()){
            imageViewBrick56.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick57.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick58.getId()){
            imageViewBrick58.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick59.getId()){
            imageViewBrick59.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick60.getId()){
            imageViewBrick60.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick61.getId()){
            imageViewBrick61.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick62.getId()){
            imageViewBrick62.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick63.getId()){
            imageViewBrick63.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick64.getId()){
            imageViewBrick64.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick65.getId()){
            imageViewBrick65.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
        if (view.getId() == imageViewBrick66.getId()){
            imageViewBrick66.setImageResource(R.drawable.trap_grid_brick);
            allBricks(view);
            trapGridCard();
        }
    }

    public void door(View view){
        if (view.getId() == imageViewBrick1.getId()){

            if (!sharedPreferences.getBoolean("brickBool1", false))
            {
                int picture = R.drawable.door_brick;
                imageViewBrick1.setImageResource(picture);
                editor.putInt("brick1", picture);
                editor.putBoolean("brickBool1", true);
                editor.putString("brickType1", "trapGrid");
                editor.commit();

                allBricks(view);
                doorCards();
            }
            else if (sharedPreferences.getBoolean("brickBool1", false)){
                if (sharedPreferences.getString("brickType1", "").equals("trapGrid")){
                    doorCards();
                    allBricks(view);

                }
            }
        }
        if (view.getId() == imageViewBrick2.getId()){
            if (!sharedPreferences.getBoolean("brickBool2", false))
            {
                int picture = R.drawable.door_brick;
                imageViewBrick2.setImageResource(picture);
                editor.putInt("brick2", picture);
                editor.putBoolean("brickBool2", true);
                editor.putString("brickType2", "trapGrid");
                editor.commit();

                allBricks(view);
                doorCards();
            }
            else if (sharedPreferences.getBoolean("brickBool2", false)){
                if (sharedPreferences.getString("brickType2", "").equals("trapGrid")){
                    doorCards();
                    allBricks(view);

                }
            }
        }
        if (view.getId() == imageViewBrick3.getId()){
            if (!sharedPreferences.getBoolean("brickBool3", false))
            {
                int picture = R.drawable.door_brick;
                imageViewBrick3.setImageResource(picture);
                editor.putInt("brick3", picture);
                editor.putBoolean("brickBool3", true);
                editor.putString("brickType3", "trapGrid");
                editor.commit();

                allBricks(view);
                doorCards();
            }
            else if (sharedPreferences.getBoolean("brickBool3", false)){
                if (sharedPreferences.getString("brickType3", "").equals("trapGrid")){
                    doorCards();
                    allBricks(view);

                }
            }
        }
        if (view.getId() == imageViewBrick4.getId()){
            if (!sharedPreferences.getBoolean("brickBool4", false))
            {
                int picture = R.drawable.door_brick;
                imageViewBrick4.setImageResource(picture);
                editor.putInt("brick4", picture);
                editor.putBoolean("brickBool4", true);
                editor.putString("brickType4", "trapGrid");
                editor.commit();

                allBricks(view);
                doorCards();
            }
            else if (sharedPreferences.getBoolean("brickBool4", false)){
                if (sharedPreferences.getString("brickType4", "").equals("trapGrid")){
                    doorCards();
                    allBricks(view);

                }
            }
        }
        if (view.getId() == imageViewBrick5.getId()){
            if (!sharedPreferences.getBoolean("brickBool5", false))
            {
                int picture = R.drawable.door_brick;
                imageViewBrick5.setImageResource(picture);
                editor.putInt("brick5", picture);
                editor.putBoolean("brickBool5", true);
                editor.putString("brickType5", "trapGrid");
                editor.commit();

                allBricks(view);
                doorCards();
            }
            else if (sharedPreferences.getBoolean("brickBool5", false)){
                if (sharedPreferences.getString("brickType5", "").equals("trapGrid")){
                    doorCards();
                    allBricks(view);

                }
            }
        }
        if (view.getId() == imageViewBrick6.getId()){
            if (!sharedPreferences.getBoolean("brickBool6", false))
            {
                int picture = R.drawable.door_brick;
                imageViewBrick6.setImageResource(picture);
                editor.putInt("brick6", picture);
                editor.putBoolean("brickBool6", true);
                editor.putString("brickType6", "trapGrid");
                editor.commit();

                allBricks(view);
                doorCards();
            }
            else if (sharedPreferences.getBoolean("brickBool6", false)){
                if (sharedPreferences.getString("brickType6", "").equals("trapGrid")){
                    doorCards();
                    allBricks(view);

                }
            }
        }
        if (view.getId() == imageViewBrick7.getId()){
            if (!sharedPreferences.getBoolean("brickBool7", false))
            {
                int picture = R.drawable.door_brick;
                imageViewBrick7.setImageResource(picture);
                editor.putInt("brick7", picture);
                editor.putBoolean("brickBool7", true);
                editor.putString("brickType7", "trapGrid");
                editor.commit();

                allBricks(view);
                doorCards();
            }
            else if (sharedPreferences.getBoolean("brickBool7", false)){
                if (sharedPreferences.getString("brickType7", "").equals("trapGrid")){
                    doorCards();
                    allBricks(view);

                }
            }
        }
        if (view.getId() == imageViewBrick8.getId()){
            if (!sharedPreferences.getBoolean("brickBool8", false))
            {
                int picture = R.drawable.door_brick;
                imageViewBrick8.setImageResource(picture);
                editor.putInt("brick8", picture);
                editor.putBoolean("brickBool8", true);
                editor.putString("brickType8", "trapGrid");
                editor.commit();

                allBricks(view);
                doorCards();
            }
            else if (sharedPreferences.getBoolean("brickBool8", false)){
                if (sharedPreferences.getString("brickType8", "").equals("trapGrid")){
                    doorCards();
                    allBricks(view);

                }
            }
        }
        if (view.getId() == imageViewBrick9.getId()){
            if (!sharedPreferences.getBoolean("brickBool9", false))
            {
                int picture = R.drawable.door_brick;
                imageViewBrick9.setImageResource(picture);
                editor.putInt("brick9", picture);
                editor.putBoolean("brickBool9", true);
                editor.putString("brickType9", "trapGrid");
                editor.commit();

                allBricks(view);
                doorCards();
            }
            else if (sharedPreferences.getBoolean("brickBool9", false)){
                if (sharedPreferences.getString("brickType9", "").equals("trapGrid")){
                    doorCards();
                    allBricks(view);

                }
            }
        }
        if (view.getId() == imageViewBrick10.getId()){
            if (!sharedPreferences.getBoolean("brickBool10", false))
            {
                int picture = R.drawable.door_brick;
                imageViewBrick10.setImageResource(picture);
                editor.putInt("brick10", picture);
                editor.putBoolean("brickBool10", true);
                editor.putString("brickType10", "trapGrid");
                editor.commit();

                allBricks(view);
                doorCards();
            }
            else if (sharedPreferences.getBoolean("brickBool10", false)){
                if (sharedPreferences.getString("brickType10", "").equals("trapGrid")){
                    doorCards();
                    allBricks(view);

                }
            }
        }
        if (view.getId() == imageViewBrick11.getId()){
            imageViewBrick11.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick12.getId()){
            imageViewBrick12.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick13.getId()){
            imageViewBrick13.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick14.getId()){
            imageViewBrick14.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick15.getId()){
            imageViewBrick15.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick16.getId()){
            imageViewBrick16.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick17.getId()){
            imageViewBrick17.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick18.getId()){
            imageViewBrick18.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick19.getId()){
            imageViewBrick19.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick20.getId()){
            imageViewBrick20.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick21.getId()){
            imageViewBrick21.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick22.getId()){
            imageViewBrick22.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick23.getId()){
            imageViewBrick23.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick24.getId()){
            imageViewBrick24.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick25.getId()){
            imageViewBrick25.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick26.getId()){
            imageViewBrick26.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick27.getId()){
            imageViewBrick27.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick28.getId()){
            imageViewBrick28.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick29.getId()){
            imageViewBrick29.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick30.getId()){
            imageViewBrick30.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick31.getId()){
            imageViewBrick31.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick32.getId()){
            imageViewBrick32.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick33.getId()){
            imageViewBrick33.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick34.getId()){
            imageViewBrick34.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick35.getId()){
            imageViewBrick35.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick36.getId()){
            imageViewBrick36.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick37.getId()){
            imageViewBrick37.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick38.getId()){
            imageViewBrick38.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick39.getId()){
            imageViewBrick39.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick40.getId()){
            imageViewBrick40.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick41.getId()){
            imageViewBrick41.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick42.getId()){
            imageViewBrick42.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick43.getId()){
            imageViewBrick43.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick44.getId()){
            imageViewBrick44.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick45.getId()){
            imageViewBrick45.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick46.getId()){
            imageViewBrick46.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick47.getId()){
            imageViewBrick47.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick48.getId()){
            imageViewBrick48.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick49.getId()){
            imageViewBrick49.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick50.getId()){
            imageViewBrick50.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick51.getId()){
            imageViewBrick51.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick52.getId()){
            imageViewBrick52.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick53.getId()){
            imageViewBrick53.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick54.getId()){
            imageViewBrick54.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick55.getId()){
            imageViewBrick55.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick56.getId()){
            imageViewBrick56.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick57.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick58.getId()){
            imageViewBrick58.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick59.getId()){
            imageViewBrick59.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick60.getId()){
            imageViewBrick60.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick61.getId()){
            imageViewBrick61.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick62.getId()){
            imageViewBrick62.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick63.getId()){
            imageViewBrick63.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick64.getId()){
            imageViewBrick64.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick65.getId()){
            imageViewBrick65.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
        if (view.getId() == imageViewBrick66.getId()){
            imageViewBrick66.setImageResource(R.drawable.door_brick);
            allBricks(view);
            doorCards();
        }
    }

    public void turningRoom(View view){
        if (view.getId() == imageViewBrick1.getId()){

            if (!sharedPreferences.getBoolean("brickBool1", false))
            {
                int picture = R.drawable.turning_room;
                imageViewBrick1.setImageResource(picture);
                editor.putInt("brick1", picture);
                editor.putBoolean("brickBool1", true);
                editor.putString("brickType1", "turningRoom");
                editor.commit();

                allBricks(view);
                turningRoomBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool1", false)){
                if (sharedPreferences.getString("brickType1", "").equals("turningRoom")){
                    allBricks(view);
                    turningRoomBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick2.getId()){
            if (!sharedPreferences.getBoolean("brickBool2", false))
            {
                int picture = R.drawable.turning_room;
                imageViewBrick2.setImageResource(picture);
                editor.putInt("brick2", picture);
                editor.putBoolean("brickBool2", true);
                editor.putString("brickType2", "turningRoom");
                editor.commit();

                allBricks(view);
                turningRoomBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool2", false)){
                if (sharedPreferences.getString("brickType2", "").equals("turningRoom")){
                    allBricks(view);
                    turningRoomBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick3.getId()){
            if (!sharedPreferences.getBoolean("brickBool3", false))
            {
                int picture = R.drawable.turning_room;
                imageViewBrick3.setImageResource(picture);
                editor.putInt("brick3", picture);
                editor.putBoolean("brickBool3", true);
                editor.putString("brickType3", "turningRoom");
                editor.commit();

                allBricks(view);
                turningRoomBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool3", false)){
                if (sharedPreferences.getString("brickType3", "").equals("turningRoom")){
                    allBricks(view);
                    turningRoomBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick4.getId()){
            if (!sharedPreferences.getBoolean("brickBool4", false))
            {
                int picture = R.drawable.turning_room;
                imageViewBrick4.setImageResource(picture);
                editor.putInt("brick4", picture);
                editor.putBoolean("brickBool4", true);
                editor.putString("brickType4", "turningRoom");
                editor.commit();

                allBricks(view);
                turningRoomBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool4", false)){
                if (sharedPreferences.getString("brickType4", "").equals("turningRoom")){
                    allBricks(view);
                    turningRoomBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick5.getId()){
            if (!sharedPreferences.getBoolean("brickBool5", false))
            {
                int picture = R.drawable.turning_room;
                imageViewBrick5.setImageResource(picture);
                editor.putInt("brick5", picture);
                editor.putBoolean("brickBool5", true);
                editor.putString("brickType5", "turningRoom");
                editor.commit();

                allBricks(view);
                turningRoomBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool5", false)){
                if (sharedPreferences.getString("brickType15", "").equals("turningRoom")){
                    allBricks(view);
                    turningRoomBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick6.getId()){
            if (!sharedPreferences.getBoolean("brickBool6", false))
            {
                int picture = R.drawable.turning_room;
                imageViewBrick6.setImageResource(picture);
                editor.putInt("brick6", picture);
                editor.putBoolean("brickBool6", true);
                editor.putString("brickType6", "turningRoom");
                editor.commit();

                allBricks(view);
                turningRoomBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool6", false)){
                if (sharedPreferences.getString("brickType6", "").equals("turningRoom")){
                    allBricks(view);
                    turningRoomBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick7.getId()){
            if (!sharedPreferences.getBoolean("brickBool7", false))
            {
                int picture = R.drawable.turning_room;
                imageViewBrick7.setImageResource(picture);
                editor.putInt("brick7", picture);
                editor.putBoolean("brickBool7", true);
                editor.putString("brickType7", "turningRoom");
                editor.commit();

                allBricks(view);
                turningRoomBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool7", false)){
                if (sharedPreferences.getString("brickType7", "").equals("turningRoom")){
                    allBricks(view);
                    turningRoomBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick8.getId()){
            if (!sharedPreferences.getBoolean("brickBool8", false))
            {
                int picture = R.drawable.turning_room;
                imageViewBrick8.setImageResource(picture);
                editor.putInt("brick8", picture);
                editor.putBoolean("brickBool8", true);
                editor.putString("brickType8", "turningRoom");
                editor.commit();

                allBricks(view);
                turningRoomBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool8", false)){
                if (sharedPreferences.getString("brickType8", "").equals("turningRoom")){
                    allBricks(view);
                    turningRoomBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick9.getId()){
            if (!sharedPreferences.getBoolean("brickBool9", false))
            {
                int picture = R.drawable.turning_room;
                imageViewBrick9.setImageResource(picture);
                editor.putInt("brick9", picture);
                editor.putBoolean("brickBool9", true);
                editor.putString("brickType9", "turningRoom");
                editor.commit();

                allBricks(view);
                turningRoomBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool9", false)){
                if (sharedPreferences.getString("brickType9", "").equals("turningRoom")){
                    allBricks(view);
                    turningRoomBrick();
                }
            }
        }
        if (view.getId() == imageViewBrick10.getId()){
            if (!sharedPreferences.getBoolean("brickBool10", false))
            {
                int picture = R.drawable.turning_room;
                imageViewBrick10.setImageResource(picture);
                editor.putInt("brick10", picture);
                editor.putBoolean("brickBool10", true);
                editor.putString("brickType10", "turningRoom");
                editor.commit();

                allBricks(view);
                turningRoomBrick();
            }
            else if (sharedPreferences.getBoolean("brickBool10", false)){
                if (sharedPreferences.getString("brickType10", "").equals("turningRoom")){
                    allBricks(view);
                    turningRoomBrick();
                }
            }
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

            if (!sharedPreferences.getBoolean("brickBool1", false))
            {
                int picture = R.drawable.botomlesswell_brick;
                imageViewBrick1.setImageResource(picture);
                editor.putInt("brick1", picture);
                editor.putBoolean("brickBool1", true);
                editor.putString("brickType1", "well");
                editor.commit();

                allBricks(view);
                bottomlessWellCard();
            }
            else if (sharedPreferences.getBoolean("brickBool1", false)){
                if (sharedPreferences.getString("brickType1", "").equals("well")){

                    bottomlessWellCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick2.getId()){
            if (!sharedPreferences.getBoolean("brickBool2", false))
            {
                int picture = R.drawable.botomlesswell_brick;
                imageViewBrick2.setImageResource(picture);
                editor.putInt("brick2", picture);
                editor.putBoolean("brickBool2", true);
                editor.putString("brickType2", "well");
                editor.commit();

                allBricks(view);
                bottomlessWellCard();
            }
            else if (sharedPreferences.getBoolean("brickBool2", false)){
                if (sharedPreferences.getString("brickType2", "").equals("well")){

                    bottomlessWellCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick3.getId()){
            if (!sharedPreferences.getBoolean("brickBool3", false))
            {
                int picture = R.drawable.botomlesswell_brick;
                imageViewBrick3.setImageResource(picture);
                editor.putInt("brick3", picture);
                editor.putBoolean("brickBool3", true);
                editor.putString("brickType3", "well");
                editor.commit();

                allBricks(view);
                bottomlessWellCard();
            }
            else if (sharedPreferences.getBoolean("brickBool3", false)){
                if (sharedPreferences.getString("brickType3", "").equals("well")){

                    bottomlessWellCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick4.getId()){
            if (!sharedPreferences.getBoolean("brickBool4", false))
            {
                int picture = R.drawable.botomlesswell_brick;
                imageViewBrick4.setImageResource(picture);
                editor.putInt("brick4", picture);
                editor.putBoolean("brickBool4", true);
                editor.putString("brickType4", "well");
                editor.commit();

                allBricks(view);
                bottomlessWellCard();
            }
            else if (sharedPreferences.getBoolean("brickBool4", false)){
                if (sharedPreferences.getString("brickType4", "").equals("well")){

                    bottomlessWellCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick5.getId()){
            if (!sharedPreferences.getBoolean("brickBool5", false))
            {
                int picture = R.drawable.botomlesswell_brick;
                imageViewBrick5.setImageResource(picture);
                editor.putInt("brick5", picture);
                editor.putBoolean("brickBool5", true);
                editor.putString("brickType5", "well");
                editor.commit();

                allBricks(view);
                bottomlessWellCard();
            }
            else if (sharedPreferences.getBoolean("brickBool5", false)){
                if (sharedPreferences.getString("brickType5", "").equals("well")){

                    bottomlessWellCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick6.getId()){
            if (!sharedPreferences.getBoolean("brickBool6", false))
            {
                int picture = R.drawable.botomlesswell_brick;
                imageViewBrick6.setImageResource(picture);
                editor.putInt("brick6", picture);
                editor.putBoolean("brickBool6", true);
                editor.putString("brickType6", "well");
                editor.commit();

                allBricks(view);
                bottomlessWellCard();
            }
            else if (sharedPreferences.getBoolean("brickBool6", false)){
                if (sharedPreferences.getString("brickType6", "").equals("well")){

                    bottomlessWellCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick7.getId()){
            if (!sharedPreferences.getBoolean("brickBool7", false))
            {
                int picture = R.drawable.botomlesswell_brick;
                imageViewBrick7.setImageResource(picture);
                editor.putInt("brick7", picture);
                editor.putBoolean("brickBool7", true);
                editor.putString("brickType7", "well");
                editor.commit();

                allBricks(view);
                bottomlessWellCard();
            }
            else if (sharedPreferences.getBoolean("brickBool7", false)){
                if (sharedPreferences.getString("brickType7", "").equals("well")){

                    bottomlessWellCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick8.getId()){
            if (!sharedPreferences.getBoolean("brickBool8", false))
            {
                int picture = R.drawable.botomlesswell_brick;
                imageViewBrick8.setImageResource(picture);
                editor.putInt("brick8", picture);
                editor.putBoolean("brickBool8", true);
                editor.putString("brickType8", "well");
                editor.commit();

                allBricks(view);
                bottomlessWellCard();
            }
            else if (sharedPreferences.getBoolean("brickBool8", false)){
                if (sharedPreferences.getString("brickType8", "").equals("well")){

                    bottomlessWellCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick9.getId()){
            if (!sharedPreferences.getBoolean("brickBool9", false))
            {
                int picture = R.drawable.botomlesswell_brick;
                imageViewBrick9.setImageResource(picture);
                editor.putInt("brick9", picture);
                editor.putBoolean("brickBool9", true);
                editor.putString("brickType9", "well");
                editor.commit();

                allBricks(view);
                bottomlessWellCard();
            }
            else if (sharedPreferences.getBoolean("brickBool9", false)){
                if (sharedPreferences.getString("brickType9", "").equals("well")){

                    bottomlessWellCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick10.getId()){
            if (!sharedPreferences.getBoolean("brickBool10", false))
            {
                int picture = R.drawable.botomlesswell_brick;
                imageViewBrick10.setImageResource(picture);
                editor.putInt("brick10", picture);
                editor.putBoolean("brickBool10", true);
                editor.putString("brickType10", "well");
                editor.commit();

                allBricks(view);
                bottomlessWellCard();
            }
            else if (sharedPreferences.getBoolean("brickBool10", false)){
                if (sharedPreferences.getString("brickType10", "").equals("well")){

                    bottomlessWellCard();
                    allBricks(view);
                }
            }
        }
        if (view.getId() == imageViewBrick11.getId()){
            imageViewBrick11.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick12.getId()){
            imageViewBrick12.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick13.getId()){
            imageViewBrick13.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick14.getId()){
            imageViewBrick14.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick15.getId()){
            imageViewBrick15.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick16.getId()){
            imageViewBrick16.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick17.getId()){
            imageViewBrick17.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick18.getId()){
            imageViewBrick18.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick19.getId()){
            imageViewBrick19.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick20.getId()){
            imageViewBrick20.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick21.getId()){
            imageViewBrick21.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick22.getId()){
            imageViewBrick22.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick23.getId()){
            imageViewBrick23.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick24.getId()){
            imageViewBrick24.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick25.getId()){
            imageViewBrick25.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick26.getId()){
            imageViewBrick26.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick27.getId()){
            imageViewBrick27.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick28.getId()){
            imageViewBrick28.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick29.getId()){
            imageViewBrick29.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick30.getId()){
            imageViewBrick30.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick31.getId()){
            imageViewBrick31.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick32.getId()){
            imageViewBrick32.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick33.getId()){
            imageViewBrick33.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick34.getId()){
            imageViewBrick34.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick35.getId()){
            imageViewBrick35.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick36.getId()){
            imageViewBrick36.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick37.getId()){
            imageViewBrick37.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick38.getId()){
            imageViewBrick38.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick39.getId()){
            imageViewBrick39.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick40.getId()){
            imageViewBrick40.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick41.getId()){
            imageViewBrick41.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick42.getId()){
            imageViewBrick42.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick43.getId()){
            imageViewBrick43.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick44.getId()){
            imageViewBrick44.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick45.getId()){
            imageViewBrick45.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick46.getId()){
            imageViewBrick46.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick47.getId()){
            imageViewBrick47.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick48.getId()){
            imageViewBrick48.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick49.getId()){
            imageViewBrick49.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick50.getId()){
            imageViewBrick50.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick51.getId()){
            imageViewBrick51.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick52.getId()){
            imageViewBrick52.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick53.getId()){
            imageViewBrick53.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick54.getId()){
            imageViewBrick54.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick55.getId()){
            imageViewBrick55.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick56.getId()){
            imageViewBrick56.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick57.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick58.getId()){
            imageViewBrick58.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick59.getId()){
            imageViewBrick59.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick60.getId()){
            imageViewBrick60.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick61.getId()){
            imageViewBrick61.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick62.getId()){
            imageViewBrick62.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick63.getId()){
            imageViewBrick63.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick64.getId()){
            imageViewBrick64.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick65.getId()){
            imageViewBrick65.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
        if (view.getId() == imageViewBrick66.getId()){
            imageViewBrick66.setImageResource(R.drawable.botomlesswell_brick);
            allBricks(view);
            bottomlessWellCard();
        }
    }

    public void room(View view){
        if (view.getId() == imageViewBrick1.getId()){

            if (!sharedPreferences.getBoolean("brickBool1", false))
            {
                int picture = R.drawable.room_brick;
                imageViewBrick1.setImageResource(picture);
                editor.putInt("brick1", picture);
                editor.putBoolean("brickBool1", true);
                editor.putString("brickType1", "room");
                editor.commit();

                allBricks(view);
                roomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool1", false)){
                if (sharedPreferences.getString("brickType1", "").equals("room")){
                    allBricks(view);
                    roomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick2.getId()){
            if (!sharedPreferences.getBoolean("brickBool2", false))
            {
                int picture = R.drawable.room_brick;
                imageViewBrick2.setImageResource(picture);
                editor.putInt("brick2", picture);
                editor.putBoolean("brickBool2", true);
                editor.putString("brickType2", "room");
                editor.commit();

                allBricks(view);
                roomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool2", false)){
                if (sharedPreferences.getString("brickType2", "").equals("room")){
                    allBricks(view);
                    roomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick3.getId()){
            if (!sharedPreferences.getBoolean("brickBool3", false))
            {
                int picture = R.drawable.room_brick;
                imageViewBrick3.setImageResource(picture);
                editor.putInt("brick3", picture);
                editor.putBoolean("brickBool3", true);
                editor.putString("brickType3", "room");
                editor.commit();

                allBricks(view);
                roomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool3", false)){
                if (sharedPreferences.getString("brickType3", "").equals("room")){
                    allBricks(view);
                    roomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick4.getId()){
            if (!sharedPreferences.getBoolean("brickBool4", false))
            {
                int picture = R.drawable.room_brick;
                imageViewBrick4.setImageResource(picture);
                editor.putInt("brick4", picture);
                editor.putBoolean("brickBool4", true);
                editor.putString("brickType4", "room");
                editor.commit();

                allBricks(view);
                roomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool4", false)){
                if (sharedPreferences.getString("brickType4", "").equals("room")){
                    allBricks(view);
                    roomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick5.getId()){
            if (!sharedPreferences.getBoolean("brickBool5", false))
            {
                int picture = R.drawable.room_brick;
                imageViewBrick5.setImageResource(picture);
                editor.putInt("brick5", picture);
                editor.putBoolean("brickBool5", true);
                editor.putString("brickType5", "room");
                editor.commit();

                allBricks(view);
                roomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool5", false)){
                if (sharedPreferences.getString("brickType5", "").equals("room")){
                    allBricks(view);
                    roomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick6.getId()){
            if (!sharedPreferences.getBoolean("brickBool6", false))
            {
                int picture = R.drawable.room_brick;
                imageViewBrick6.setImageResource(picture);
                editor.putInt("brick6", picture);
                editor.putBoolean("brickBool6", true);
                editor.putString("brickType6", "room");
                editor.commit();

                allBricks(view);
                roomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool6", false)){
                if (sharedPreferences.getString("brickType6", "").equals("room")){
                    allBricks(view);
                    roomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick7.getId()){
            if (!sharedPreferences.getBoolean("brickBool7", false))
            {
                int picture = R.drawable.room_brick;
                imageViewBrick7.setImageResource(picture);
                editor.putInt("brick7", picture);
                editor.putBoolean("brickBool7", true);
                editor.putString("brickType7", "room");
                editor.commit();

                allBricks(view);
                roomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool7", false)){
                if (sharedPreferences.getString("brickType7", "").equals("room")){
                    allBricks(view);
                    roomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick8.getId()){
            if (!sharedPreferences.getBoolean("brickBool8", false))
            {
                int picture = R.drawable.room_brick;
                imageViewBrick8.setImageResource(picture);
                editor.putInt("brick8", picture);
                editor.putBoolean("brickBool8", true);
                editor.putString("brickType8", "room");
                editor.commit();

                allBricks(view);
                roomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool8", false)){
                if (sharedPreferences.getString("brickType18", "").equals("room")){
                    allBricks(view);
                    roomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick9.getId()){
            if (!sharedPreferences.getBoolean("brickBool9", false))
            {
                int picture = R.drawable.room_brick;
                imageViewBrick9.setImageResource(picture);
                editor.putInt("brick9", picture);
                editor.putBoolean("brickBool9", true);
                editor.putString("brickType9", "room");
                editor.commit();

                allBricks(view);
                roomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool9", false)){
                if (sharedPreferences.getString("brickType9", "").equals("room")){
                    allBricks(view);
                    roomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick10.getId()){
            if (!sharedPreferences.getBoolean("brickBool10", false))
            {
                int picture = R.drawable.room_brick;
                imageViewBrick10.setImageResource(picture);
                editor.putInt("brick10", picture);
                editor.putBoolean("brickBool10", true);
                editor.putString("brickType10", "room");
                editor.commit();

                allBricks(view);
                roomCard();
            }
            else if (sharedPreferences.getBoolean("brickBool10", false)){
                if (sharedPreferences.getString("brickType10", "").equals("room")){
                    allBricks(view);
                    roomCard();
                }
            }
        }
        if (view.getId() == imageViewBrick11.getId()){
            imageViewBrick11.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick12.getId()){
            imageViewBrick12.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick13.getId()){
            imageViewBrick13.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick14.getId()){
            imageViewBrick14.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick15.getId()){
            imageViewBrick15.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick16.getId()){
            imageViewBrick16.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick17.getId()){
            imageViewBrick17.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick18.getId()){
            imageViewBrick18.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick19.getId()){
            imageViewBrick19.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick20.getId()){
            imageViewBrick20.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick21.getId()){
            imageViewBrick21.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick22.getId()){
            imageViewBrick22.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick23.getId()){
            imageViewBrick23.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick24.getId()){
            imageViewBrick24.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick25.getId()){
            imageViewBrick25.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick26.getId()){
            imageViewBrick26.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick27.getId()){
            imageViewBrick27.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick28.getId()){
            imageViewBrick28.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick29.getId()){
            imageViewBrick29.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick30.getId()){
            imageViewBrick30.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick31.getId()){
            imageViewBrick31.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick32.getId()){
            imageViewBrick32.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick33.getId()){
            imageViewBrick33.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick34.getId()){
            imageViewBrick34.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick35.getId()){
            imageViewBrick35.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick36.getId()){
            imageViewBrick36.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick37.getId()){
            imageViewBrick37.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick38.getId()){
            imageViewBrick38.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick39.getId()){
            imageViewBrick39.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick40.getId()){
            imageViewBrick40.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick41.getId()){
            imageViewBrick41.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick42.getId()){
            imageViewBrick42.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick43.getId()){
            imageViewBrick43.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick44.getId()){
            imageViewBrick44.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick45.getId()){
            imageViewBrick45.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick46.getId()){
            imageViewBrick46.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick47.getId()){
            imageViewBrick47.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick48.getId()){
            imageViewBrick48.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick49.getId()){
            imageViewBrick49.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick50.getId()){
            imageViewBrick50.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick51.getId()){
            imageViewBrick51.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick52.getId()){
            imageViewBrick52.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick53.getId()){
            imageViewBrick53.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick54.getId()){
            imageViewBrick54.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick55.getId()){
            imageViewBrick55.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick56.getId()){
            imageViewBrick56.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick5.getId()){
            imageViewBrick57.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick58.getId()){
            imageViewBrick58.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick59.getId()){
            imageViewBrick59.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick60.getId()){
            imageViewBrick60.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick61.getId()){
            imageViewBrick61.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick62.getId()){
            imageViewBrick62.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick63.getId()){
            imageViewBrick63.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick64.getId()){
            imageViewBrick64.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick65.getId()){
            imageViewBrick65.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
        }
        if (view.getId() == imageViewBrick66.getId()){
            imageViewBrick66.setImageResource(R.drawable.room_brick);
            allBricks(view);
            roomCard();
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
        Intent intent = new Intent(MainActivity.this, TrapGridCard.class);
        startActivity(intent);
        finish();
    }

    public void doorCards() {
        Intent intent = new Intent(MainActivity.this, DoorBrick.class);
        startActivity(intent);
        finish();
    }

    public void bottomlessWellCard() {
        Intent intent = new Intent(MainActivity.this, BottomlessWellBrick.class);
        startActivity(intent);
        finish();
    }

    public void roomCard(){
        Random rand = new Random();
        int randTrap = rand.nextInt(3);

        switch (12){
            case 0:
                Intent empty = new Intent(MainActivity.this, EmptyRoomCard.class);
                startActivity(empty);
                finish();
                break;
            case 1:
                Intent assault = new Intent(MainActivity.this, AssultCard.class);
                startActivity(assault);
                finish();
                break;
            case 2:
                Intent monster = new Intent(MainActivity.this, Monster.class);
                startActivity(monster);
                finish();
                break;
            case 3:
                Intent fallenWarrior = new Intent(MainActivity.this, FallenWarrior.class);
                startActivity(fallenWarrior);
                finish();
                break;
            case 4:
                Intent bats = new Intent(MainActivity.this, Bats.class);
                startActivity(bats);
                finish();
                break;
            case 5:
                System.out.println("Giant Spider");
                break;
            case 6:
                System.out.println("The roof colapse");
                break;
            case 7:
                System.out.println("Small bottle");
                break;
            case 8:
                System.out.println("Trapdoor");
                break;
            case 9:
                System.out.println("The torch goes out");
                break;
            case 10:
                System.out.println("Arrows out of the wall");
                break;
            case 11:
                System.out.println("The Sorcerer's Curse");
                break;
            case 12:
                Intent treasure = new Intent(MainActivity.this, Treasure.class);
                startActivity(treasure);
                finish();
                break;
            case 13:
                System.out.println("Spear trap");
                break;

        }
    }

    public void darkRoomCard() {
        Intent intent = new Intent(MainActivity.this, DarkRoomBrick.class);
        startActivity(intent);
        finish();
    }

    public void corridorBrick (){
        Intent intent = new Intent(MainActivity.this, CorridorBrick.class);
        startActivity(intent);
        finish();
    }

    public void turningRoomBrick() {
        Intent intent = new Intent(MainActivity.this, TurningRoomBrick.class);
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

        if (sharedPreferences.getBoolean("brickBool1", false)){

            int picture1 = sharedPreferences.getInt("brick1", 0);
            imageViewBrick1.setImageResource(picture1);
        }
        if (sharedPreferences.getBoolean("brickBool2", false)){

            int picture2 = sharedPreferences.getInt("2", 0);
            imageViewBrick2.setImageResource(picture2);
        }
        if (sharedPreferences.getBoolean("brickBool3", false)){

            int picture3 = sharedPreferences.getInt("brick3", 0);
            imageViewBrick3.setImageResource(picture3);
        }
        if (sharedPreferences.getBoolean("brickBool4", false)){

            int picture4 = sharedPreferences.getInt("brick4", 0);
            imageViewBrick4.setImageResource(picture4);
        }
        if (sharedPreferences.getBoolean("brickBool5", false)){

            int picture5 = sharedPreferences.getInt("brick5", 0);
            imageViewBrick5.setImageResource(picture5);
        }
        if (sharedPreferences.getBoolean("brickBool6", false)){

            int picture6 = sharedPreferences.getInt("brick6", 0);
            imageViewBrick6.setImageResource(picture6);
        }
        if (sharedPreferences.getBoolean("brickBool7", false)){

            int picture7 = sharedPreferences.getInt("brick7", 0);
            imageViewBrick7.setImageResource(picture7);
        }
        if (sharedPreferences.getBoolean("brickBool8", false)){

            int picture8 = sharedPreferences.getInt("brick8", 0);
            imageViewBrick8.setImageResource(picture8);
        }
        if (sharedPreferences.getBoolean("brickBool9", false)){

            int picture9 = sharedPreferences.getInt("brick9", 0);
            imageViewBrick9.setImageResource(picture9);
        }
        if (sharedPreferences.getBoolean("brickBool10", false)){

            int picture10 = sharedPreferences.getInt("brick10", 0);
            imageViewBrick10.setImageResource(picture10);
        }

        if (health <= 0 || days == 0){

            int picture = R.drawable.brick;
            editor.putInt("brick1", picture);
            editor.putInt("brick2", picture);
            editor.putInt("brick3", picture);
            editor.putInt("brick4", picture);
            editor.putInt("brick5", picture);
            editor.putInt("brick6", picture);
            editor.putInt("brick7", picture);
            editor.putInt("brick8", picture);
            editor.putInt("brick9", picture);
            editor.putInt("brick10", picture);
            editor.putBoolean("brickBool1", false);
            editor.putBoolean("brickBool2", false);
            editor.putBoolean("brickBool3", false);
            editor.putBoolean("brickBool4", false);
            editor.putBoolean("brickBool5", false);
            editor.putBoolean("brickBool6", false);
            editor.putBoolean("brickBool7", false);
            editor.putBoolean("brickBool8", false);
            editor.putBoolean("brickBool9", false);
            editor.putBoolean("brickBool10", false);
            editor.commit();
            Intent intent = new Intent(MainActivity.this, DeadActivity.class);
            startActivity(intent);
            finish();
        }
    }
}