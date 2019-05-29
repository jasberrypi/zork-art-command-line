package command;

import java.util.List;

public class Room {
    Room aboveRoom;
    Room belowRoom;
    Room leftRoom;
    Room rightRoom;

    boolean existsAboveDoor;
    boolean existsBelowDoor;
    boolean existsLeftDoor;
    boolean existsRightDoor;

    Weapon weapon;
    Monster monster;

    public Room (List<Room> adjacentRooms, List<Boolean> doorExistence, Weapon weapon, Monster monster){
        aboveRoom = adjacentRooms.get(0);
        belowRoom = adjacentRooms.get(1);
        leftRoom = adjacentRooms.get(2);
        rightRoom = adjacentRooms.get(3);

        existsAboveDoor = doorExistence.get(0);
        existsBelowDoor = doorExistence.get(1);
        existsLeftDoor = doorExistence.get(2);
        existsRightDoor = doorExistence.get(3);

        this.weapon = weapon;
        this.monster = monster;
    }
}
