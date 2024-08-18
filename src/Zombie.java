public class Zombie extends Enemy{
    private final int classDamage = 10;
    private final int superStrikeClass = 5;

    public Zombie(String name) {
        super(name);
    }

    public Zombie(int health, String name) {
        super(health, name);
    }

    @Override
    public void attackHero(Hero hero) {
        int random = Logic.randomizer(classDamage);
        System.out.println(name + " кусает и наносит " + random +
                Logic.aLotOfDamage(random) + " урона");
        Logic.LogicAttackEnemy(hero, random, superStrikeClass);
    }


}
