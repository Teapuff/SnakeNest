package com.boren.snakenest.bricks;

import java.util.Random;

public class DarkRoomBrick {

    public void getDarkRoom() {
        Random rand = new Random();
        int randRoom = rand.nextInt(2) + 1;

        switch (randRoom) {
            case 1:
                twoExit();
                break;
            case 2:
                threeExit();
                break;
        }
    }

    public void twoExit() {
        System.out.println("Dark room with two exits");
    }

    public void threeExit () {
        System.out.println("Dark room with three exits");
    }
}
