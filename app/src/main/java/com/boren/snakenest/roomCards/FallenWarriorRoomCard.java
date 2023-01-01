package com.boren.snakenest.roomCards;

import com.boren.snakenest.heroes.YourStat;
import com.boren.snakenest.serchingCards.GetFallenWarriorSearchCard;

import java.util.Scanner;

public class FallenWarriorRoomCard implements RoomsExp{
    @Override
    public void explanation(YourStat stats) {
        System.out.println("You have encounter a fallen warrion. DO you want to search its body? (Y/N)");

        Scanner scanner = new Scanner(System.in);
        String serch = scanner.nextLine().toUpperCase();
        boolean searching = false;

        while (!searching) {
            switch (serch){
                case "Y":
                    System.out.println("You are serching the body");
                    searching = true;
                    break;
                case "N":
                    System.out.println("You don't serch the body and moving forwards");
                    GetFallenWarriorSearchCard searchCard = new GetFallenWarriorSearchCard();
                    searchCard.getSearchCard(stats);
                    searching = true;
                    break;
                default:
                    System.out.println("Choose Y or N");
                    break;
            }
        }
    }
}
