package command;

public class LightOnCommand implements Command {

    @Override
    public void apply() {
        System.out.println("Light turned on");
    }
    
}
