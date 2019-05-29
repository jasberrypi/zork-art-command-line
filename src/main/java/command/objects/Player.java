package command.objects;

public class Player {
    public int hp;
    public static final int MAX_HP = 10;
    public int attackPower;
    public Item item;

    public Player(){
        hp = MAX_HP;
        attackPower = 0;
        item = null;
    }

    public void increaseHp(int fixedAmount){
        if (this.hp + fixedAmount > MAX_HP){
            this.hp = MAX_HP;
        } else{
            this.hp += fixedAmount;
        }
    }

    public void increaseAttackPower(int amount){
        this.attackPower += amount;
    }
}
