import java.util.Scanner;

public class BattleGround {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя героя");
        String nameHero = scanner.nextLine();

        System.out.println("Введите имя врага");
        String nameEnemy = scanner.nextLine();

        System.out.println("Введите уровень единиц здоровья для обеих сторон");
        int theAmountOfHealth = scanner.nextInt();

        Hero hero;


        int friend = Logic.randomizer(3);
        if (friend == 0) {
            hero = new Warrior(nameHero,theAmountOfHealth);
            System.out.println("Ваш герой воин с именем " + nameHero + " и количеством единиц здоровья " +
                    theAmountOfHealth);
        } else if (friend == 1) {
            hero = new Mage(nameHero,theAmountOfHealth);
            System.out.println("Ваш герой маг с именем " + nameHero + " и количеством единиц здоровья " +
                    theAmountOfHealth);
        } else {
            hero = new Archer(nameHero,theAmountOfHealth);
            System.out.println("Ваш герой воин с именем " + nameHero + " и количеством единиц здоровья " +
                    theAmountOfHealth);
        }

        Enemy enemy;

        int notFriend = Logic.randomizer(3);
        if (notFriend == 0) {
            enemy = new Troll(theAmountOfHealth, nameEnemy);
            System.out.println("Наш враг тролль с именем " + nameEnemy + " и количеством единиц здоровья " +
                    theAmountOfHealth);
        } else if (notFriend == 1) {
            enemy = new Vampire(theAmountOfHealth, nameEnemy);
            System.out.println("Наш враг вампир с именем " + nameEnemy + " и количеством единиц здоровья " +
                    theAmountOfHealth);
        } else {
            enemy = new Zombie(theAmountOfHealth, nameEnemy);
            System.out.println("Наш враг зомби с именем " + nameEnemy + " и количеством единиц здоровья " +
                    theAmountOfHealth);
        }

        do {
            enemy.attackHero(hero);
            hero.attackEnemy(enemy);
        } while (enemy.isAlive() && hero.isAlive());
        System.out.println(hero.getHealth()>enemy.getHealth() ? "Ура победа за нами" : "Увы мы проиграли");

    }
}
