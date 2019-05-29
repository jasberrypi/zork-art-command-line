package command;

import command.commands.*;
import command.objects.Player;
import command.objects.Room;

import java.util.HashMap;
import java.util.Scanner;

public final class Game {
    public static Room currentRoom;
    public static Player player;

    private static final HashMap<String, Command> commands = new HashMap<String, Command>() {
        {
            put("up", new UpCommand());
            put("down", new DownCommand());
            put("left", new LeftCommand());
            put("right", new RightCommand());
            put("info", new InfoCommand());
            put("take", new TakeCommand());
            put("drop", new DropCommand());
            put("attack", new AttackCommand());
            put("quit", new QuitCommand());
        }
    };

    public static Command getCommand(String name) {
        return commands.get(name);
    }

    public static void main(final String[] arguments) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        player = new Player();

        Level1 level1 = new Level1();
        System.out.println("Welcome to " + level1.NAME);
        System.out.println("Your objective is to " + level1.OBJECTIVE);
        currentRoom = level1.startRoom;

        while (!quit) {
            System.out.print("You: ");
            String commandLine = scanner.nextLine();
            Command command = Game.getCommand(commandLine);
            if (null == command) {
                System.out.println("Unknown command [" + commandLine + "].");
            } else {
                command.apply();
            }
            if (player.item != null && player.item.name.equals("sword")){
                System.out.println("Objective completed");
                quit = true;
            }
        }

    }

}
