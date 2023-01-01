package com.boren.snakenest.roomCards;

import com.boren.snakenest.heroes.YourStat;

import java.util.Scanner;

public class ChestRoomCard implements RoomsExp{

    @Override
    public void explanation(YourStat stats) {

        System.out.println("YOu have encounter a chest. DO you want to search it? (Y/N)");

        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine().toUpperCase();
        boolean searching = false;

        while (!searching) {
            switch (search){
                case "Y":
                    System.out.println("You are searching the chest");
                    searching = true;
                    break;
                case "N":
                    System.out.println("You dont search it and moving forwards");
                    searching = true;
                    break;
                default:
                    System.out.println("Choose Y or N");
                    break;
            }
        }
    }
}
