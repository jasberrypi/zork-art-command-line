package command.commands;

import command.Game;

public class DownCommand implements Command {

    @Override
    public void apply() {
        if (Game.currentRoom.downRoom != null && Game.currentRoom.existsDownDoor){
            Game.currentRoom = Game.currentRoom.downRoom;
            System.out.println("Moved down.");
        }else{
            System.out.println("Can not move down.");
        }
    }
    
}
