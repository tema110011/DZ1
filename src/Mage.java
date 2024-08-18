public class Mage extends Hero{
    private final int classDamage = 15;
    private final int superStrikeClass = 30;

    public Mage(String name) {
        super(name);
    }

    public Mage(String name, int health) {
        super(health, name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int random = Logic.randomizer(classDamage);
        System.out.println(name + " произносит заклинание и наносит " + random +
                Logic.aLotOfDamage(random) + " урона");
        Logic.LogicAttackHero(enemy, random, superStrikeClass);
    }
}
