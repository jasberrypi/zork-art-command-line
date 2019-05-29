package command;

public class ExitCommand implements Command {

    @Override
    public void apply() {
        System.exit(0);
    }
    
}
