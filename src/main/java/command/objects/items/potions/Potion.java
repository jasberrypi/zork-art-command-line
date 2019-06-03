package command.objects.items.potions;

import command.objects.items.Item;

public class Potion extends Item {
    public int addedHP;

    public Potion(String name, int addedHP){
        this.name = name;
        this.addedHP = addedHP;
        this.ability = "+" + addedHP + " to player's hp";
    }
}
