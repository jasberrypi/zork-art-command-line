package command.commands;

public class QuitCommand extends Command {
    public QuitCommand(){
        description = "quits command";
    }

    @Override
    public void apply() {
        System.exit(0);
    }
    
}
