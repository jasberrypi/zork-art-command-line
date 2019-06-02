package command.commands;

import command.Game;

public class UpCommand extends Command {
    public UpCommand(){
        description = "goes up";
    }

    @Override
    public void apply() {
        if (Game.currentRoom.upRoom != null && Game.currentRoom.existsUpDoor){
            Game.currentRoom = Game.currentRoom.upRoom;
            if (Game.player.hp < 100) Game.player.hp += 1;
            System.out.println("Moved up.");
        }else{
            System.out.println("Can not move up.");
        }
    }
    
}
