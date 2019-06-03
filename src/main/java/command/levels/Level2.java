package command.levels;

import command.Game;
import command.objects.monsters.Monster;
import command.objects.Room;
import command.objects.monsters.MonsterFactory;

public class Level2 extends Level {
    public Room roomWithDragon;

    public Level2(){
        name = "Level 2";
        objective = "kill a dragon";

        MonsterFactory monsterFactory = new MonsterFactory();

        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();
        Room room4 = new Room();
        Room room5 = new Room();
        Room room6 = new Room();
        Room room7 = new Room();
        Room room8 = new Room();

        Monster snake = monsterFactory.makeSnake();
        Monster dragon = monsterFactory.makeDragon();

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
        if (((Level2) Game.currentLevel).roomWithDragon.monster == null){
            return true;
        }
        return false;
    }
}
