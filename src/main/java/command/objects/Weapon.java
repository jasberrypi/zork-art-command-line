package command.objects;

public class Weapon extends Item{
    public int addedAttackPower;

    public Weapon(String name, int addedAttackPower){
        this.name = name;
        this.addedAttackPower = addedAttackPower;
        this.ability = "+" + addedAttackPower + " to player's attack power";
    }
}
