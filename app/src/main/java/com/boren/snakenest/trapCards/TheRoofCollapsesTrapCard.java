package com.boren.snakenest.trapCards;

import com.boren.snakenest.heroes.YourStat;

public class TheRoofCollapsesTrapCard extends TrapsDamage{

    public void explanation(YourStat stats) {
        System.out.println("The roos is collapsing. \n Pick a number, roll a T12 dice. If that numer is rolled you'r dead. If you survive" +
                "roll a T6 and get T6-2 damage");
        rollToSurvive(12, stats);
    }
}
