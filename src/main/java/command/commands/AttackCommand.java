package command.commands;

import command.Game;

public class AttackCommand implements Command {

    @Override
    public void apply() {
        if (Game.currentRoom.monster != null){
            Game.player.attack(Game.currentRoom.monster);
        }else{
            System.out.println("No monsters in the room.");
        }
    }
    
}
