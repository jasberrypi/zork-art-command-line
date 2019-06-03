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

        Monster snake = monsterFactory.makeSnake();
        Monster dragon = monsterFactory.makeDragon();

        room1.setRightRoom(room2);

        room2.setUpRoom(room3);
        room3.setRightRoom(room4);

        room2.setDownRoom(room5);
        room5.setRightRoom(room6);

        room4.setMonster(snake);
        room6.setMonster(dragon);
        roomWithDragon = room6;

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
