package command.objects;

import command.Game;

public class Player {
    public boolean alive;
    public int hp;
    public static final int MAX_HP = 100;
    public int attackPower;
    public Item item;

    public Player(){
        alive = true;
        hp = MAX_HP;
        attackPower = 10;
        item = null;
    }

    public void increaseHp(int fixedAmount){
        if (this.hp + fixedAmount > MAX_HP){
            this.hp = MAX_HP;
        } else{
            this.hp += fixedAmount;
        }
    }

    public void decreaseHp(int amount){
        this.hp -= amount;
        if (this.hp <= 0){
            this.alive = false;
        }
    }

    public void increaseAttackPower(int amount){
        this.attackPower += amount;
    }

    public void attack(Monster monster){
        if (this.item instanceof Weapon){
            int totalAttackPower = this.attackPower + ((Weapon) this.item).addedAttackPower;
            monster.decreaseHp(totalAttackPower);
            System.out.println("Player attacks: monster -" + totalAttackPower);
        } else {
            monster.decreaseHp(this.attackPower);
            System.out.println("Player attacks: monster -" + this.attackPower);
        }

        if(monster.alive){
            monster.attack(this);
            if(!this.alive){
                System.out.println("GAME OVER");
                System.exit(0);
            }
        } else{
            Game.currentRoom.monster = null;
            this.attackPower += 1;
            System.out.println("Defeated monster");
            System.out.println("Updated attack power: " + this.attackPower);
        }

    }
}
