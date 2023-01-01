package com.boren.snakenest.bricks;

import com.boren.snakenest.heroes.YourStat;

import java.util.Random;

public class SingleBricks {

    public void clutter(YourStat stat) {
        Random rand = new Random();
        int randNum = rand.nextInt(12) + 1;

        if (randNum > stat.getAgility()){
            System.out.println("Fail");
        }
        else if (randNum <= stat.getAgility()) {
            System.out.println("Success");
        }
    }

    public void trapGrid(YourStat stat) {
        Random rand = new Random();
        int randNum = rand.nextInt(12) + 1;

        if (randNum > stat.getStrength()){
            System.out.println("Fail");
        }
        else if (randNum <= stat.getStrength()) {
            System.out.println("Success");
        }
    }

    public void turningRoom () {
        System.out.println("The room turns 180");
    }

    public void bottomlessWell (YourStat stat) {
        Random rand = new Random();
        int randNum = rand.nextInt(12) + 1;

        if (randNum > stat.getAgility()){
            System.out.println("Fail, your dead");
        }
        else if (randNum <= stat.getAgility()) {
            System.out.println("Success");
        }
    }
}
