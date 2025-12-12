package application.model;

public class MonsterModel {
    private int level;
    private int hp;
    private int damage;




    public MonsterModel(int level, int hp, int damage) {
        this.level = level;
        this.hp = hp;
        this.damage = damage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(this.hp <= 0) this.hp = 0;
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamageFromMonster(Object o) {
        return -9;
    }
}
