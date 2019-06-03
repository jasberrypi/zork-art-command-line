package command.objects.items;

import command.objects.items.potions.Elixir;
import command.objects.items.potions.Water;
import command.objects.items.weapons.Knife;
import command.objects.items.weapons.Lightsaber;
import command.objects.items.weapons.Sword;
import command.objects.items.weapons.Weapon;
import command.objects.items.potions.Potion;

public class ItemFactory {

    public Weapon makeWeapon(String name, int addedAttackPower){
        return new Weapon(name, addedAttackPower);
    }

    public Knife makeKnife(){
        return new Knife();
    }

    public Sword makeSword(){
        return new Sword();
    }

    public Lightsaber makeLightsaber(){
        return new Lightsaber();
    }

    public Potion makePotion(String name, int addedHP){
        return new Potion(name, addedHP);
    }

    public Water makeWater(){
        return new Water();
    }

    public Elixir makeElixir(){
        return new Elixir();
    }

}
