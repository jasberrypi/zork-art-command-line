package command.objects;

public class Room {
    public Room upRoom;
    public Room downRoom;
    public Room leftRoom;
    public Room rightRoom;

    public boolean existsUpDoor;
    public boolean existsDownDoor;
    public boolean existsLeftDoor;
    public boolean existsRightDoor;

    public Weapon weapon;
    public Monster monster;

    public Room (){
        upRoom = null;
        downRoom = null;
        leftRoom = null;
        rightRoom = null;

        existsUpDoor = false;
        existsDownDoor = false;
        existsLeftDoor = false;
        existsRightDoor = false;

        this.weapon = null;
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

    public void setUpDoor(){
        this.existsUpDoor = true;
        this.upRoom.existsDownDoor = true;
    }

    public void setDownDoor(){
        this.existsDownDoor = true;
        this.downRoom.existsUpDoor = true;
    }

    public void setLeftDoor(){
        this.existsLeftDoor = true;
        this.leftRoom.existsRightDoor = true;
    }

    public void setRightDoor(){
        this.existsRightDoor = true;
        this.rightRoom.existsLeftDoor = true;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }
}
