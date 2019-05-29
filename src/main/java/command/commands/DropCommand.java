package command.commands;

import command.Game;

public class DropCommand implements Command {

    @Override
    public void apply() {
        if (Game.currentRoom.item == null && Game.player.item != null) {
             Game.currentRoom.item = Game.player.item;
            Game.player.item = null;
            System.out.println("Dropped " + Game.currentRoom.item.name);
        } else if (Game.player.item == null) {
            System.out.println("Nothing to drop.");
        } else {
            System.out.println("Can not drop item in room that already has item or monster.");
        }
    }
}
