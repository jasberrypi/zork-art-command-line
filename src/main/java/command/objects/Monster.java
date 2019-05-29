package command.objects;

public class Monster {
    public boolean alive;
    public int hp;
    public int attackPower;
    public double hitProbability;

    public Monster(int hp, int attackPower, double hitProbability){
        alive = true;
        this.hp = hp;
        this.attackPower = attackPower;
        this.hitProbability = hitProbability;
    }

    public void decreaseHp(int amount){
        this.hp -= amount;
        if (this.hp <= 0){
            this.alive = false;
        }
    }

    public void attack(Player player){
        double randomNum = Math.random();
        if (randomNum < this.hitProbability) {
            player.decreaseHp(this.attackPower);
            System.out.println("Monster attacks: player -" + this.attackPower);
        } else{
            System.out.println("Monster misses");
        }
    }
}
