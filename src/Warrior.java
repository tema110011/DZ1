public class Warrior extends Hero{
    private final int classDamage = 10;
    private final int superStrikeClass = 15;

    public Warrior(String name) {
        super(name);
    }

    public Warrior(String name, int health) {
        super(health, name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int random = Logic.randomizer(classDamage);
        System.out.println(name + " ударяет мечем и наносит " + random +
                Logic.aLotOfDamage(random) + " урона");
        Logic.LogicAttackHero(enemy, random, superStrikeClass);
    }
}
