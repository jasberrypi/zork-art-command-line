package command;

import command.objects.Monster;
import command.objects.Room;
import command.objects.Weapon;

public class Level1 {
    public static final String NAME = "Level 1";
    public static final String OBJECTIVE = "kill a monster";
    public Room startRoom;

    public Level1(){
        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();
        Weapon weapon = new Weapon();
        Monster monster = new Monster();

        room1.setRightRoom(room2);
        room1.setRightDoor();
        room2.setRightRoom(room3);
        room2.setRightDoor();
        room2.setWeapon(weapon);
        room3.setMonster(monster);

        startRoom = room1;
    }
}
