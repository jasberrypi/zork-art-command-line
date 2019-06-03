package command.levels;

import command.Game;
import command.objects.items.ItemFactory;
import command.objects.monsters.Monster;
import command.objects.items.potions.Potion;
import command.objects.Room;
import command.objects.items.weapons.Weapon;
import command.objects.monsters.MonsterFactory;

import java.util.HashSet;
import java.util.Set;

public class Level3 extends Level {
    public Set<Room> roomsWithMonsters = new HashSet<Room>();

    public Level3(){
        name = "Level 3";
        objective = "kill every monster";

        ItemFactory itemFactory = new ItemFactory();
        MonsterFactory monsterFactory = new MonsterFactory();

        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();
        Room room4 = new Room();
        Room room5 = new Room();
        Room room6 = new Room();
        Room room7 = new Room();
        Room room8 = new Room();
        Room room9 = new Room();

        Weapon lightsaber = itemFactory.makeLightsaber();
        Potion water = itemFactory.makeWater();
        Potion elixir = itemFactory.makeElixir();

        Monster snake1 = monsterFactory.makeSnake();
        Monster snake2 = monsterFactory.makeSnake();
        Monster dragon1 = monsterFactory.makeDragon();
        Monster dragon2 = monsterFactory.makeDragon();
        Monster zork = monsterFactory.makeZork();

        room1.setRightRoom(room2);
        room2.setRightRoom(room3);

        room4.setRightRoom(room5);
        room5.setRightRoom(room6);

        room7.setRightRoom(room8);
        room8.setRightRoom(room9);

        room1.setDownRoom(room4);
        room4.setDownRoom(room7);

        room2.setDownRoom(room5);
        room5.setDownRoom(room8);

        room3.setDownRoom(room6);
        room6.setDownRoom(room9);

        room8.setItem(lightsaber);
        room3.setItem(water);
        room6.setItem(elixir);

        room2.setMonster(snake1);
        roomsWithMonsters.add(room2);
        room7.setMonster(dragon1);
        roomsWithMonsters.add(room7);
        room4.setMonster(snake2);
        roomsWithMonsters.add(room4);
        room5.setMonster(dragon2);
        roomsWithMonsters.add(room5);
        room9.setMonster(zork);
        roomsWithMonsters.add(room9);

        startRoom = room1;
    }

    @Override
    public boolean objectiveCompleted() {
        for (Room room : ((Level3) Game.currentLevel).roomsWithMonsters){
            if (room.monster != null){
                return false;
            }
        }
        return true;
    }
}
