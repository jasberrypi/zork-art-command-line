package command.commands;

import command.Game;

public class LeftCommand extends Command {
    public LeftCommand(){
        description = "goes left";
    }

    @Override
    public void apply() {
        if (Game.currentRoom.leftRoom != null && Game.currentRoom.existsLeftDoor){
            Game.currentRoom = Game.currentRoom.leftRoom;
            if (Game.player.hp < 100) Game.player.hp += 1;
            System.out.println("Moved left.");
        }else{
            System.out.println("Can not move left.");
        }
    }
    
}
