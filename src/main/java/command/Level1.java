package command;

import command.objects.Room;
import command.objects.Weapon;

public class Level1 {
    public static final String NAME = "Level 1";
    public static final String OBJECTIVE = "pick up a weapon";
    public Room startRoom;

    public Level1(){
        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();
        Weapon sword = new Weapon("sword", 10);

        room1.setRightRoom(room2);
        room1.setRightDoor();
        room2.setRightRoom(room3);
        room2.setRightDoor();
        room3.setItem(sword);

        startRoom = room1;
    }
}
