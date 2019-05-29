package command.objects;

public class Weapon extends Item{
    public int addedAttackPower;

    public Weapon(String name, int addedAttackPower){
        this.name = name;
        this.addedAttackPower = addedAttackPower;
    }
}
