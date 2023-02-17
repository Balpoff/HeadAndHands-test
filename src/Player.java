public class Player extends Creature {
    private int healCount = 3;
    private final int maxHealth;

    public Player(String name, int attack, int defense, int health) {
        super(name, attack, defense, health);
        maxHealth = health;
    }

    public void heal() {
        if (healCount > 0 && getHealth() <= maxHealth / 2 && isAlive()) {
            int healedAmount = maxHealth / 2;
            setHealth(getHealth() + healedAmount);
            if (getHealth() > maxHealth) {
                setHealth(maxHealth);
            }
            healCount--;
            System.out.println(getName() + " исцелил себя на " + healedAmount + " единиц здоровья.");
        }
    }
}