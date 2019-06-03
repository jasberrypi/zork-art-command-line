package command.objects.monsters;

public class MonsterFactory {

    public Monster makeMonster(String name, int hp, int attackPower, double hitProb){
        return new Monster(name, hp, attackPower, hitProb);
    }

    public Snake makeSnake() { return new Snake(); }

    public Dragon makeDragon(){
        return new Dragon();
    }

    public Zork makeZork(){
        return new Zork();
    }

}
