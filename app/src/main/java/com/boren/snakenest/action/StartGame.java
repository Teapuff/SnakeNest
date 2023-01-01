package com.boren.snakenest.action;

import com.boren.snakenest.bricks.GetBrick;
import com.boren.snakenest.heroes.YourStat;

import java.util.Scanner;

public class StartGame {

    public void firstMove (YourStat stats) {
        System.out.println("Do you want to go left (L) or upp (U)? ");
        Scanner scan = new Scanner(System.in);
        String way = scan.nextLine().toUpperCase();
        takeABrick(stats);
    }

    public void takeABrick(YourStat stats) {
        GetBrick getBrick = new GetBrick();
        System.out.println("You walked into a ");
        getBrick.brick(stats);
    }
}
