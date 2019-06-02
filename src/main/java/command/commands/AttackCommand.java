package command.commands;

import command.Game;

public class AttackCommand extends Command {
    public AttackCommand(){
        description = "attacks monster in the current room";
    }

    @Override
    public void apply() {
        if (Game.currentRoom.monster != null){
            Game.player.attack(Game.currentRoom.monster);
        }else{
            System.out.println("No monsters in the room.");
        }
    }
    
}
