package command.commands;

import command.Game;

public class UpCommand implements Command {

    @Override
    public void apply() {
        if (Game.currentRoom.upRoom != null && Game.currentRoom.existsUpDoor){
            Game.currentRoom = Game.currentRoom.upRoom;
            Game.player.hp += 1;
            System.out.println("Moved up.");
        }else{
            System.out.println("Can not move up.");
        }
    }
    
}
