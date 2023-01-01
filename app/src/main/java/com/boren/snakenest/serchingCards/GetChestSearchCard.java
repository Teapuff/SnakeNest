package com.boren.snakenest.serchingCards;

import com.boren.snakenest.heroes.YourStat;

import java.util.Random;

public class GetChestSearchCard {

    public void getSearchCard(YourStat stats) {
        SearchingCards searchingCards = new SearchingCards();
        Random rand = new Random();
        int randSearch = rand.nextInt(5) + 1;

        switch (randSearch) {
            case 1:
                System.out.println("You find nothing");
                break;
            case 2:
                System.out.println("Its a trap!");
                searchingCards.trap(stats);
                break;
            case 3:
                System.out.println("BONES!!!");
                searchingCards.bones();
                break;
            case 4:
                System.out.println("Treasure");
                searchingCards.getGold();
                break;
            case 5:
                System.out.println("Small bottle");
                break;
            case 6:
                System.out.println("Amulett");
                break;
            case 31:
                System.out.println("Rope");
                break;

        }
    }
}
