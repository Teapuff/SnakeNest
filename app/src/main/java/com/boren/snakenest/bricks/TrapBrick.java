package com.boren.snakenest.bricks;

import com.boren.snakenest.heroes.YourStat;
import com.boren.snakenest.trapCards.ArrowsFromWallTrapCard;
import com.boren.snakenest.trapCards.ExplossionTrapCard;
import com.boren.snakenest.trapCards.PoisonousSnakeTrapCard;
import com.boren.snakenest.trapCards.TheRoofCollapsesTrapCard;
import com.boren.snakenest.trapCards.ToxicFogTrapCard;
import com.boren.snakenest.trapCards.TrapDoorTrapCard;

import java.util.Random;

public class TrapBrick {
    public void trapCard (YourStat stats) {

        Random rand = new Random();
        int randTrap = rand.nextInt(5) + 1;

        switch (randTrap){
            case 1:
                PoisonousSnakeTrapCard poisonousSnakeTrapCard = new PoisonousSnakeTrapCard();
                poisonousSnakeTrapCard.explanation(stats);
                break;
            case 2:
                ToxicFogTrapCard toxicFogTrapCard = new ToxicFogTrapCard();
                toxicFogTrapCard.explanation(stats);
                break;
            case 3:
                ExplossionTrapCard explossionTrapCard = new ExplossionTrapCard();
                explossionTrapCard.explanation(stats);
                break;
            case 4:
                TheRoofCollapsesTrapCard roofCollapses = new TheRoofCollapsesTrapCard();
                roofCollapses.explanation(stats);
                break;
            case 5:
                //göra så man gör om det tills man lyckas
                TrapDoorTrapCard trapdoor = new TrapDoorTrapCard();
                trapdoor.explanation(stats);
                break;
            case 6:
                ArrowsFromWallTrapCard arrowsFromWallTrapCard = new ArrowsFromWallTrapCard();
                arrowsFromWallTrapCard.explanation(stats);
                break;
        }
    }
}
