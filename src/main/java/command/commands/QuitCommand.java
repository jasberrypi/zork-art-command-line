package command.commands;

public class QuitCommand implements Command {

    @Override
    public void apply() {
        System.exit(0);
    }
    
}
