package com.boren.snakenest.trapCards;

import com.boren.snakenest.heroes.YourStat;

public class ArrowsFromWallTrapCard extends TrapsDamage{

    public void explanation(YourStat stats) {
        System.out.println("Arrows is getting shoot at you from the wall \n You roll a T12 dice and loses T12-your agility ");
        damageBasedOnStat(12, stats, stats.getAgility());
    }
}
