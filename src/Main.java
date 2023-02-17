public class Main {
    public static void main(String[] args) {
        Creature player = new Player("Стив",10, 10, 10);
        Creature monster = new Monster("Зомби",10, 10, 10);
        Battle.fight(player, monster);
    }
}


