package command;

import command.commands.*;
import command.objects.Room;

import java.util.HashMap;
import java.util.Scanner;

public final class Game {
    public static Room currentRoom;

    private static final HashMap<String, Command> commands = new HashMap<String, Command>() {
        {
            put("up", new UpCommand());
            put("down", new DownCommand());
            put("left", new LeftCommand());
            put("right", new RightCommand());
            put("quit", new QuitCommand());
        }
    };

    public static Command getCommand(String name) {
        return commands.get(name);
    }

    public static void main(final String[] arguments) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        System.out.println("Game: Level 1 objective is to kill every monster.");
        while (!quit) {
            System.out.print("You: ");
            String commandLine = scanner.nextLine();
            Command command = Game.getCommand(commandLine);
            if (null == command) {
                System.out.println("Unknown command [" + commandLine + "]. Available commands: Light on, Light off and quit.");
            } else {
                command.apply();
            }
        }

    }

}
