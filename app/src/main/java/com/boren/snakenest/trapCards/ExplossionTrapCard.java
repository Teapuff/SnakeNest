package com.boren.snakenest.trapCards;

import com.boren.snakenest.heroes.YourStat;

public class ExplossionTrapCard extends TrapsDamage{

    public void explanation(YourStat stats) {
        System.out.println("You encounter an explossion. \n You take 4 damage and have to skipp 1 turs");
        damage(stats, 4);
        skipMoves(); //create---------------------------------------
    }
}
