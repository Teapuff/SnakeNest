package com.boren.snakenest.trapCards;

import com.boren.snakenest.heroes.YourStat;

public class ToxicFogTrapCard extends TrapsDamage{

    public void explanation(YourStat stats) {
        System.out.println("You encounter a toxic fog. \n You roll a T6 dice and loses T6-3 and have to skipp T&-3 turs");
        damageBasedOnStat(6, stats, 3);
        skipMoves(); //create---------------------------------------
    }

}
