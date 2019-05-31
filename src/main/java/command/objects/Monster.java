package command.objects;

public class Monster {
    public boolean alive;
    public String name;
    public int hp;
    public int attackPower;
    public double hitProb;

    public Monster(String name, int hp, int attackPower, double hitProb){
        alive = true;
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.hitProb = hitProb;
    }

    public void decreaseHp(int amount){
        this.hp -= amount;
        if (this.hp <= 0){
            this.alive = false;
        }
    }

    public void attack(Player player){
        double randomNum = Math.random();
        if (randomNum < this.hitProb) {
            player.decreaseHp(this.attackPower);
            System.out.println("Monster attacks: Player -" + this.attackPower + " HP");
        } else{
            System.out.println("Monster misses.");
        }
    }
}
