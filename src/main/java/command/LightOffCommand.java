package command;

public class LightOffCommand implements Command {

    @Override
    public void apply() {
        System.out.println("Light turned off");
    }
    
}
