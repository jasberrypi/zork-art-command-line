package command;

import command.objects.Monster;
import command.objects.Room;

public class Level2 extends Level{
    public Room roomWithDragon;

    public Level2(){
        name = "Level 2";
        objective = "kill a dragon";

        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();
        Room room4 = new Room();
        Room room5 = new Room();
        Room room6 = new Room();
        Room room7 = new Room();
        Room room8 = new Room();

        Monster snake = new Monster("snake",20,2,0.8);
        Monster dragon = new Monster("dragon",50,5,0.5);

        room1.setRightRoom(room2);
        room1.setRightDoor();
        room2.setRightRoom(room3);
        room2.setRightDoor();

        room1.setDownRoom(room4);
        room1.setDownDoor();
        room3.setDownRoom(room5);
        room3.setDownDoor();

        room4.setDownRoom(room6);
        room4.setDownDoor();
        room6.setRightRoom(room7);
        room6.setRightDoor();
        room7.setRightRoom(room8);
        room7.setRightDoor();
        room5.setDownRoom(room8);
        room5.setDownDoor();

        room2.setMonster(snake);
        room7.setMonster(dragon);
        roomWithDragon = room7;

        startRoom = room1;
    }

    @Override
    public boolean objectiveCompleted() {
        if (((Level2)Game.currentLevel).roomWithDragon.monster == null){
            return true;
        }
        return false;
    }
}
