public class Logic {
    public static String aLotOfDamage(int damage){
        int buffer = damage % 10;
        if (buffer == 1) return " единицу ";
        if (buffer > 1 && buffer < 5) return " единицы ";
        return " единиц ";
    }

    public static int randomizer(int damage){
        return (int) (Math.random() * damage);
    }
    public static void LogicAttackHero(Enemy enemy, int random, int superStrikeClass){
        enemy.takeDamage(random);
        System.out.println("У врага осталось " + enemy.getHealth() + Logic.aLotOfDamage(enemy.getHealth()) +
                " здоровья");
        System.out.println();
        superStrikeHero(enemy,superStrikeClass);
    }
    public static void superStrikeHero(Enemy enemy, int superStrikeClass){
        int superStrike = (int) (Math.random() * 4);
        if (superStrike == 2){
            enemy.takeDamage(superStrikeClass);
            System.out.println("герой наносит супер удар и дополнительно наносит " +
                    superStrikeClass + Logic.aLotOfDamage(superStrikeClass) + " урона");
            System.out.println("У врага осталось " + enemy.getHealth() + Logic.aLotOfDamage(enemy.getHealth()) +
                    " здоровья");
            System.out.println();
        }
    }
    public static void LogicAttackEnemy(Hero hero, int random, int superStrikeClass){
        hero.takeDamage(random);
        System.out.println("У союзника  осталось " + hero.getHealth() + Logic.aLotOfDamage(hero.getHealth()) +
                " здоровья");
        System.out.println();
        superStrikeEnemy(hero,superStrikeClass);
    }
    public static void superStrikeEnemy(Hero hero, int superStrikeClass){
        int superStrike = (int) (Math.random() * 4);
        if (superStrike == 2){
            hero.takeDamage(superStrikeClass);
            System.out.println("Враг наносит супер удар и дополнительно наносит " +
                    superStrikeClass + Logic.aLotOfDamage(superStrikeClass) + " урона");
            System.out.println("У союзника  осталось " + hero.getHealth() + Logic.aLotOfDamage(hero.getHealth()) +
                    " здоровья");
            System.out.println();
        }
    }
}
