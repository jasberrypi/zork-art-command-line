package command;

import command.commands.*;
import command.objects.Player;
import command.objects.Room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public final class Game { //Singleton class
    public static List<Level> listOfLevels = new ArrayList<Level>();
    public static Player player;
    public static Level currentLevel;
    public static Room currentRoom;

    public static final HashMap<String, Command> commands = new HashMap<String, Command>() {
        {
            put("up", new UpCommand());
            put("down", new DownCommand());
            put("left", new LeftCommand());
            put("right", new RightCommand());
            put("info", new InfoCommand());
            put("help", new HelpCommand());
            put("take", new TakeCommand());
            put("drop", new DropCommand());
            put("attack", new AttackCommand());
            put("use", new UseCommand());
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
        listOfLevels.add(level1);
        Level2 level2 = new Level2();
        listOfLevels.add(level2);
        Level3 level3 = new Level3();
        listOfLevels.add(level3);

        for (Level level: listOfLevels){
            currentLevel = level;
            System.out.println("Welcome to " + level.name);
            System.out.println("Your objective is to " + level.objective);
            currentRoom = level.startRoom;

            while (!quit) {
                System.out.print("You: ");
                String commandLine = scanner.nextLine();
                Command command = Game.getCommand(commandLine);
                if (null == command) {
                    System.out.println("Unknown command [" + commandLine + "].");
                } else {
                    command.apply();
                }

                if (level.objectiveCompleted()){
                    System.out.println("Objective completed");
                    System.out.println("----------");
                    System.out.println();
                    quit = true;
                }
            }
            quit = false;
        }
        System.out.println("All levels cleared.");
        System.out.println("Game completed.");

    }

}
