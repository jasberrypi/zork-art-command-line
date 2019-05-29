package command.commands;

import command.Game;

public class LeftCommand implements Command {

    @Override
    public void apply() {
        if (Game.currentRoom.leftRoom != null && Game.currentRoom.existsLeftDoor){
            Game.currentRoom = Game.currentRoom.leftRoom;
        }else{
            System.out.println("Can not move left.");
        }
    }
    
}
