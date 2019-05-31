package command.commands;

import command.Game;

public class RightCommand implements Command {

    @Override
    public void apply() {
        if (Game.currentRoom.rightRoom != null && Game.currentRoom.existsRightDoor){
            Game.currentRoom = Game.currentRoom.rightRoom;
            Game.player.hp += 1;
            System.out.println("Moved right.");
        }else{
            System.out.println("Can not move right.");
        }
    }
    
}
