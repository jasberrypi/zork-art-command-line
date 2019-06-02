package command.commands;

import command.Game;

public class HelpCommand extends Command {
    public HelpCommand(){
        description = "prints all commands";
    }

    @Override
    public void apply() {
        System.out.println();
        System.out.println("----------");
        System.out.println("All Commands:");
        for (String command: Game.commands.keySet()){
            System.out.println(command + " - " + Game.getCommand(command).description);
        }
        System.out.println();
        System.out.println("----------");
        System.out.println();
    }
    
}
