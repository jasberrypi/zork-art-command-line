package command.levels;

import command.objects.Room;

public abstract class Level {
    public String name;
    public String objective;
    public Room startRoom;
    public abstract boolean objectiveCompleted();
}
