package command.commands;

import command.Game;

public class UpCommand extends Command {
    public UpCommand(){
        description = "goes up";
    }

    @Override
    public void apply() {
        if (Game.currentRoom.upRoom != null){
            Game.currentRoom = Game.currentRoom.upRoom;
            Game.player.increaseHp(1);
            System.out.println("Moved up.");
        }else{
            System.out.println("Can not move up.");
        }
    }
    
}
