package com.boren.snakenest.serchingCards;

import com.boren.snakenest.heroes.YourStat;

import java.util.Random;

public class SearchingCards {

    public void getGold() {
        Random r = new Random();
        int low = 250;
        int high = 500;
        int randGold = r.nextInt(high-low) + low;

        System.out.println("You find a treasure worth " + randGold);
    }

    public void getRope () {
        System.out.println("You found a rope");
    }
    
    public void crustacean(YourStat stats) {

        int newHealth;

        Random rand = new Random();
        int randDMG = rand.nextInt(6) + 1;

        newHealth = stats.getHelth()-randDMG;

        if (newHealth > 0){
            stats.setHelth(newHealth);
        }
        else if (newHealth <= 0) {
            System.out.println("Your dead");
        }
    }

    public void trap(YourStat stats) {

        int newHealth;
        int damage;
        Random rand = new Random();
        int randDMG = rand.nextInt(12) + 1;

        damage = randDMG- stats.getLuck();
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

    public void bones () {

        Random rand = new Random();
        int randNum = rand.nextInt(12) + 1;

        System.out.println("The number is: " + randNum);
        if (randNum % 2 == 0)
            System.out.println("Nothing happens");
        else {
            System.out.println("O no, you woke up the sekeleton, FIGHT!!!!");
        }
    }

    public void bottle () {

    }
}
