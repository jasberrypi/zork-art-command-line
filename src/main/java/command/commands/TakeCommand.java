package command.commands;

import command.Game;

public class TakeCommand implements Command {

    @Override
    public void apply() {
        if (Game.currentRoom.item != null && Game.player.item == null) {
            Game.player.item = Game.currentRoom.item;
            Game.currentRoom.item = null;
            System.out.println("Picked up " + Game.player.item.name);
        } else if (Game.player.item != null) {
            System.out.println("You must drop current item first.");
        } else {
            System.out.println("No items in the room.");
        }
    }
}
