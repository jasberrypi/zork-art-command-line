package command;

import command.objects.Monster;
import command.objects.Room;
import command.objects.Weapon;

public class Level1 {
    public static final String NAME = "Level 1";
    public static final String OBJECTIVE = "pick up a sword weapon";
    public Room startRoom;

    public Level1(){
        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();
        Weapon knife = new Weapon("knife", 5);
        Weapon sword = new Weapon("sword", 10);

        room1.setRightRoom(room2);
        room1.setRightDoor();
        room2.setRightRoom(room3);
        room2.setRightDoor();
        room2.setItem(knife);
        room3.setItem(sword);

        Monster dragon = new Monster("dragon",50,5,0.5);
        room1.setMonster(dragon);

        startRoom = room1;
    }
}
