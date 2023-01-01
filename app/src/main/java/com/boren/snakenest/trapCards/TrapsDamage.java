package com.boren.snakenest.trapCards;

import com.boren.snakenest.heroes.YourStat;

import java.util.Random;
import java.util.Scanner;

public class TrapsDamage {
    public void explanation(YourStat stats) {
    }

    public YourStat damageBasedOnStat(int dice, YourStat stats, int minusNumber) {

        int newHealth;
        int damage;
        Random rand = new Random();
        int randDMG = rand.nextInt(dice) + 1;

        damage = randDMG-minusNumber;
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

        return stats;
    }

    public void skipMoves () {

    }

    public YourStat damage (YourStat stats, int damage) {
        int newHealth;
        newHealth = stats.getHelth()-damage;

        if (newHealth <= 0) {
            System.out.println("Your dead");
        }
        else if (newHealth > 0) {
            stats.setHelth(newHealth);
        }
        return stats;
    }

    public void rollToSurvive (int dice, YourStat stats) {
        Scanner scan = new Scanner(System.in);
        boolean correctNum = false;
        Random rand = new Random();
        int randNum = rand.nextInt(dice) + 1;
        System.out.println("Pick a number between 1 and 12");

        while (correctNum == false){

            int pickedNum = scan.nextInt();
            if (pickedNum <= 12 && 1 <= pickedNum ) {

                if (randNum == pickedNum) {
                    System.out.println("Your dead");
                }
                else if (randNum != pickedNum) {
                    damageBasedOnStat(6, stats, 2);
                }
                correctNum = true;
            }
            else if (pickedNum > 12 || 1 > pickedNum){
                System.out.println("Pick a number between 1 and 12");
            }
        }
    }

    public void rollToSuccess (int dice, YourStat stats, int affectedNum, int failedDMG) {
        Random rand = new Random();
        int randNum = rand.nextInt(dice) + 1;


        if(dice >= affectedNum) {
            damage(stats, failedDMG);
        }
    }
}
