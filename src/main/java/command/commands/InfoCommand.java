package command.commands;

import command.Game;

public class InfoCommand extends Command {
    public InfoCommand(){
        description = "prints out Player Stats and Room Info";
    }

    @Override
    public void apply() {
        System.out.println();
        System.out.println("----------");
        System.out.println("Player Stats");
        System.out.println("HP: " + Game.player.hp + "/" + Game.player.MAX_HP);
        System.out.println("Attack Power: " + Game.player.attackPower);
        if (Game.player.item != null) {
            System.out.println("Carrying " + Game.player.item.name + " (" + Game.player.item.ability + ")");
        }
        System.out.println();

        System.out.println("Room Info");
        if (Game.currentRoom.item != null){
            System.out.println("Contains " + Game.currentRoom.item.name + " (" + Game.currentRoom.item.ability + ")");
        }
        if (Game.currentRoom.monster != null){
            System.out.println("Contains " + Game.currentRoom.monster.name + " (HP: " + Game.currentRoom.monster.hp + ")");
        }
        System.out.print("Has door(s): ");
        if (Game.currentRoom.upRoom != null){
            System.out.print("up ");
        }
        if (Game.currentRoom.downRoom != null){
            System.out.print("down ");
        }
        if (Game.currentRoom.leftRoom != null){
            System.out.print("left ");
        }
        if (Game.currentRoom.rightRoom != null){
            System.out.print("right ");
        }
        System.out.println();
        System.out.println("----------");
        System.out.println();
    }
    
}
