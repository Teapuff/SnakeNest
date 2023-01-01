package com.boren.snakenest.roomCards;

import com.boren.snakenest.heroes.YourStat;

public class EmptyRoomCard implements RoomsExp{

    @Override
    public void explanation(YourStat stats) {
        System.out.println("The room is empty");
    }
}
