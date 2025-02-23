package command.objects;

import command.objects.items.Item;
import command.objects.monsters.Monster;

public class Room {
    public Room upRoom;
    public Room downRoom;
    public Room leftRoom;
    public Room rightRoom;

    public Item item;
    public Monster monster;

    public Room (){
        upRoom = null;
        downRoom = null;
        leftRoom = null;
        rightRoom = null;

        this.item = null;
        this.monster = null;
    }

    public void setUpRoom(Room upRoom) {
        this.upRoom = upRoom;
        upRoom.downRoom = this;
    }

    public void setDownRoom(Room downRoom) {
        this.downRoom = downRoom;
        downRoom.upRoom = this;
    }

    public void setLeftRoom(Room leftRoom) {
        this.leftRoom = leftRoom;
        leftRoom.rightRoom = this;
    }

    public void setRightRoom(Room rightRoom) {
        this.rightRoom = rightRoom;
        rightRoom.leftRoom = this;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }
}
