package com.boren.snakenest.roomCards;

import com.boren.snakenest.heroes.YourStat;

import java.util.Random;

public class BatRoomCard implements RoomsExp {

    @Override
    public void explanation(YourStat stats) {
        int newHealth;
        int damage;
        Random rand = new Random();
        int randDMG = rand.nextInt(6) + 1;

        damage = randDMG-2;
        newHealth = stats.getHelth()-damage;

        System.out.println("random dMG: " + randDMG);
        System.out.println("damage: " + damage);
        System.out.println("Health: " + stats.getHelth());
        System.out.println("New Health: " + newHealth);

        if(damage <= 0) {
            stats.setHelth(stats.getHelth());
        }
        else if(damage > 0){
            if (damage < stats.getHelth()){
                stats.setHelth(newHealth);
            }
            else if (damage > stats.getHelth()) {
                System.out.println("Your dead");
            }

        }
    }
}
