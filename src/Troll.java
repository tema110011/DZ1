public class Troll extends Enemy{
    private final int classDamage = 30;
    private final int superStrikeClass = 10;

    public Troll(String name) {
        super(name);
    }

    public Troll(int health, String name) {
        super(health, name);
    }

    @Override
    public void attackHero(Hero hero) {
        int random = Logic.randomizer(classDamage);
        System.out.println(name + " ударяет палицей  и наносит " + random +
                Logic.aLotOfDamage(random) + " урона");
        Logic.LogicAttackEnemy(hero, random, superStrikeClass);
    }

}
