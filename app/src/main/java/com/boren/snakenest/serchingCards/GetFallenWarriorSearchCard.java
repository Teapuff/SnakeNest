package com.boren.snakenest.serchingCards;

import com.boren.snakenest.heroes.YourStat;

import java.util.Random;

public class GetFallenWarriorSearchCard {

    public void getSearchCard(YourStat stats) {
        SearchingCards searchingCards = new SearchingCards();
        Random rand = new Random();
        int randSearch = rand.nextInt(4) + 1;

        switch (randSearch) {
            case 1:
                System.out.println("Treasure");
                searchingCards.getGold();
                break;
            case 2:
                //make a item list
                System.out.println("Rope");
                searchingCards.getRope();
                break;
            case 3:
                System.out.println("Crustacean");
                searchingCards.crustacean(stats);
                break;
            case 4:
                System.out.println("You find nothing");
                break;
        }
    }
}
