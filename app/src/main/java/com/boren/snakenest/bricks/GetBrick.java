package com.boren.snakenest.bricks;

import com.boren.snakenest.heroes.YourStat;

import java.util.Random;

public class GetBrick {

    public void brick (YourStat stats) {
        // sun == 30
        Random rand = new Random();

        for (int i = 0; i < 31; i++){
            int randBrick = rand.nextInt(9) + 1;

            System.out.println("You'r on day " + i + " of 30");
            System.out.println("Do you want to move forward or search the room?");

            switch (randBrick){
                case 1:
                    System.out.println("Trap");
                    TrapBrick trapBrick = new TrapBrick();
                    trapBrick.trapCard(stats);
                    break;
                case 2:
                    System.out.println("Darkroom");
                    DarkRoomBrick darkRoomBrick = new DarkRoomBrick();
                    darkRoomBrick.getDarkRoom();
                    break;
                case 3:
                    System.out.println("Clutter");
                    SingleBricks singleBricksC = new SingleBricks();
                    singleBricksC.clutter(stats);
                    break;
                case 4:
                    System.out.println("Corridor");
                    System.out.println("Your taking a new brick");
                    break;
                case 5:
                    //göra så man gör om det tills man lyckas
                    System.out.println("Trap grid");
                    SingleBricks singleBricksT = new SingleBricks();
                    singleBricksT.trapGrid(stats);
                    break;
                case 6:
                    System.out.println("Door");
                    DoorBrick doorBrick = new DoorBrick();
                    doorBrick.getDoorCard(stats);
                    break;
                case 7:
                    System.out.println("Turning room");
                    SingleBricks singleBricksTu = new SingleBricks();
                    singleBricksTu.turningRoom();
                    break;
                case 8:
                    System.out.println("Bottomless well");
                    SingleBricks singleBricksB = new SingleBricks();
                    singleBricksB.bottomlessWell(stats);
                    break;
                case 9:
                    System.out.println("Room");
                    NormalRoomBrick normalRoomBrick = new NormalRoomBrick();
                    normalRoomBrick.getRoom(stats);
                    break;
            }
        }
    }
}
