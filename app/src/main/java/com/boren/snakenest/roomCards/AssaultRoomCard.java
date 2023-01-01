package com.boren.snakenest.roomCards;

import com.boren.snakenest.heroes.YourStat;

public class AssaultRoomCard implements RoomsExp{
    @Override
    public void explanation(YourStat stats) {
        System.out.println("You have been assaulted");
    }
}
