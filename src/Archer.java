public class Archer extends Hero{
    private final int classDamage = 13;
    private final int superStrikeClass = 20;

    public Archer(String name) {
        super(name);
    }

    public Archer(String name, int health) {
        super(health, name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int random = Logic.randomizer(classDamage);
        System.out.println(name + " выпускает стрелу и наносит " + random +
                Logic.aLotOfDamage(random) + " урона");
        Logic.LogicAttackHero(enemy, random, superStrikeClass);
    }
}
