package com.boren.snakenest.bricks;

import com.boren.snakenest.heroes.YourStat;

import java.util.Random;

public class DoorBrick {

    public void getDoorCard (YourStat stat) {
        Random rand = new Random();
        int randDoor = rand.nextInt(3) + 1;

        switch (randDoor) {
            case 1:
                open();
                break;
            case 2:
                closed();
                break;
            case 3:
                trap(stat);
                break;
        }
    }

    public void open() {
        System.out.println("Door opens");
    }

    public void closed() {
        System.out.println("The door remains closed");
    }

    public void trap (YourStat stat) {
        Random rand = new Random();
        int randNum = rand.nextInt(12) + 1;
        int damage;
        int newHealth;
        damage = randNum-stat.getLuck();

        if (damage <= 0){
            stat.setHelth(stat.getHelth());
        }
        else if ( damage > 0) {
            if (damage < stat.getHelth()){
                stat.setHelth(damage);
            }
            else if (damage > stat.getHelth()) {
                System.out.println("Your dead");
            }
        }
    }
}
