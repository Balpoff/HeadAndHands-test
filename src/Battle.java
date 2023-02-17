import java.util.Random;
public class Battle {
    private static final Random random = new Random();

    public static void fight(Creature attacker, Creature defender) {
        while (attacker.isAlive() && defender.isAlive()) {
            Creature temp = attacker;
            attacker = defender;
            defender = temp;
            int attackModifier = attacker.getAttack() - defender.getDefense() + 1;
            int numberOfDice = Math.max(1, attackModifier); // Всегда бросается хотя бы один кубик
            boolean hitSuccess = false;
            for (int i = 0; i < numberOfDice; i++) {
                int dice = random.nextInt(6) + 1;
                //System.out.println(attacker.getName() + " бросает кубик... Выпадает " + dice + ".");
                if (dice >= 5) {
                    hitSuccess = true;
                    break;
                }
            }
            if (attacker instanceof Player player) player.heal();
            if (hitSuccess) {
                int damage = random.nextInt(6) + 1;
                defender.takeDamage(damage);
                System.out.println(attacker.getName() + " бьет " + defender.getName() + " нанося " + damage + " урона! У " + defender.getName() + " осталось " + defender.getHealth() + " здоровья.");

                if (!defender.isAlive()) {
                    System.out.println(defender.getName() + " умер!");
                }
            }
            //else System.out.println(attacker.getName() + " пропустил атаку!");
        }
    }
}

