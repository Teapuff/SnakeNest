package com.boren.snakenest.bricks;

import com.boren.snakenest.heroes.YourStat;
import com.boren.snakenest.roomCards.BatRoomCard;
import com.boren.snakenest.roomCards.EmptyRoomCard;
import com.boren.snakenest.roomCards.FallenWarriorRoomCard;

import java.util.Random;

public class NormalRoomBrick {

    public void getRoom(YourStat stats) {
        Random rand = new Random();
        int randRoom = rand.nextInt(14) + 1;

        switch (randRoom) {
            case 1:
                System.out.println("Emppty");
                EmptyRoomCard emptyRoomCard = new EmptyRoomCard();
                emptyRoomCard.explanation(stats);
                break;
            case 2:
                System.out.println("Assault"); //göra
                break;
            case 3:
                System.out.println("Monster"); //göra
                break;
            case 4:
                System.out.println("Fallen warrior");
                FallenWarriorRoomCard fallenWarrior = new FallenWarriorRoomCard();
                fallenWarrior.explanation(stats);
                break;
            case 5:
                System.out.println("Bats");
                BatRoomCard batRoomCard = new BatRoomCard();
                batRoomCard.explanation(stats);
                break;
            case 6:
                System.out.println("Giant Spider");
                break;
            case 7:
                System.out.println("The roof colapse");
                break;
            case 8:
                System.out.println("Small bottle");
                break;
            case 9:
                System.out.println("Trapdoor");
                break;
            case 10:
                System.out.println("The torch goes out");
                break;
            case 11:
                System.out.println("Arrows out of the wall");
                break;
            case 12:
                System.out.println("The Sorcerer's Curse");
                break;
            case 13:
                System.out.println("Skatt");
                break;
            case 14:
                System.out.println("Spear trap");
                break;
        }
    }

}
