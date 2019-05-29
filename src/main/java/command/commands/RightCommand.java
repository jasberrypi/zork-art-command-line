package command.commands;

import command.Game;

public class RightCommand implements Command {

    @Override
    public void apply() {
        if (Game.currentRoom.rightRoom != null && Game.currentRoom.existsRightDoor){
            Game.currentRoom = Game.currentRoom.rightRoom;
        }else{
            System.out.println("Can not move right.");
        }
    }
    
}
