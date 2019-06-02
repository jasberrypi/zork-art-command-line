package command.commands;

import command.Game;

public class DownCommand extends Command {
    public DownCommand(){
        description = "goes down";
    }

    @Override
    public void apply() {
        if (Game.currentRoom.downRoom != null && Game.currentRoom.existsDownDoor){
            Game.currentRoom = Game.currentRoom.downRoom;
            Game.player.hp += 1;
            System.out.println("Moved down.");
        }else{
            System.out.println("Can not move down.");
        }
    }
    
}
