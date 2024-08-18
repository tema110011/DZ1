public class Vampire extends Enemy{
    private final int classDamage = 15;
    private final int superStrikeClass = 4;

    public Vampire(String name) {
        super(name);
    }

    public Vampire(int health, String name) {
        super(health, name);
    }

    @Override
    public void attackHero(Hero hero) {
        int random = Logic.randomizer(classDamage);
        System.out.println(name + " вводит в ступор гипнозом и наносит " + random +
                Logic.aLotOfDamage(random) + " урона");
        Logic.LogicAttackEnemy(hero, random, superStrikeClass);
    }
}
