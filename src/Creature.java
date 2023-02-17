public class Creature {
    private final int attack;
    private final int defense;
    private int health;
    private boolean alive = true;
    private final String name;

    public Creature(String name, int attack, int defense, int health) {
        if (attack < 1 || attack > 20) {
            throw new IllegalArgumentException("Атака должна быть в диапазоне от 1 до 20");
        }
        if (defense < 1 || defense > 20) {
            throw new IllegalArgumentException("Защита должна быть в диапазоне от 1 до 20");
        }
        if (health < 0) {
            throw new IllegalArgumentException("Здоровье должно быть положительным");
        }
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public int getHealth() {
        return health;
    }
    public String getName() {return name;}
    public boolean isAlive() {
        return alive;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            alive = false;
        }
    }
}
