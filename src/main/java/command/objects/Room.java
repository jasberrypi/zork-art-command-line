package command.objects;

import java.util.List;

public class Room {
    public Room upRoom;
    public Room downRoom;
    public Room leftRoom;
    public Room rightRoom;

    public boolean existsUpDoor;
    public boolean existsDownDoor;
    public boolean existsLeftDoor;
    public boolean existsRightDoor;

    public Weapon weapon;
    public Monster monster;

    public Room (List<Room> adjacentRooms, List<Boolean> doorExistence, Weapon weapon, Monster monster){
        upRoom = adjacentRooms.get(0);
        downRoom = adjacentRooms.get(1);
        leftRoom = adjacentRooms.get(2);
        rightRoom = adjacentRooms.get(3);

        existsUpDoor = doorExistence.get(0);
        existsDownDoor = doorExistence.get(1);
        existsLeftDoor = doorExistence.get(2);
        existsRightDoor = doorExistence.get(3);

        this.weapon = weapon;
        this.monster = monster;
    }
}
