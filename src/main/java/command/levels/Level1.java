package command.levels;

import command.Game;
import command.objects.Room;
import command.objects.items.ItemFactory;
import command.objects.items.weapons.Weapon;

public class Level1 extends Level {

    public Level1(){
        name = "Level 1";
        objective = "pick up a sword weapon";

        ItemFactory itemFactory = new ItemFactory();

        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();

        Weapon knife = itemFactory.makeKnife();
        Weapon sword = itemFactory.makeSword();

        room1.setRightRoom(room2);
        room2.setRightRoom(room3);

        room2.setItem(knife);
        room3.setItem(sword);

        startRoom = room1;
    }

    @Override
    public boolean objectiveCompleted() {
        if (Game.player.item != null && Game.player.item.name.equals("sword")){
            return true;
        }
        return false;
    }
}
