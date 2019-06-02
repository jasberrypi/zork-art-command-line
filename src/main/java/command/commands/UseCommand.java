package command.commands;

import command.Game;
import command.objects.Potion;

public class UseCommand extends Command {
    public UseCommand(){
        description = "uses item that the player currently carries";
    }

    @Override
    public void apply() {
        if (Game.player.item != null && Game.player.item instanceof Potion) {
            Game.player.increaseHp(((Potion) Game.player.item).addedHP);
            System.out.println("Drank " + Game.player.item.name);
            Game.player.item = null;
        } else if (Game.player.item != null) {
            System.out.println("Item isn't usable.");
        } else {
            System.out.println("No items to use.");
        }
    }
    
}
