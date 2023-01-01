package com.boren.snakenest.trapCards;

import com.boren.snakenest.heroes.YourStat;

public class PoisonousSnakeTrapCard extends TrapsDamage{

    public void explanation(YourStat stats) {
        System.out.println("You encounter poisonous snakes. \n You roll a T12 dice and loses T12-your agility");
        damageBasedOnStat(12, stats, stats.getAgility());
    }



}
