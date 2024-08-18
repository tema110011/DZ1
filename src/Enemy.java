public abstract class Enemy implements Mortal{
    String name;
    private int health;

    public Enemy(String name) {
        this.name = name;
    }

    public Enemy(int health) {
        this.health = health;
    }

    public Enemy(int health, String name) {
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage){
        health = health - damage;
    }

    @Override
    public boolean isAlive() {
        if (health > 0) return true;
        return false;
    }

    public abstract void attackHero(Hero hero);
    /*{
        int random = Logic.randomizer(classDamage);
        System.out.println(name + " ударяет мечем и наносит " + random +
                Logic.aLotOfDamage(random) + " урона");
        //Logic.LogicAttackHero(hero, random);
        int random = Logic.randomizer(classDamage);
        System.out.println(name + " ударяет мечем и наносит " + random +
                Logic.aLotOfDamage(random) + " урона");
        Logic.LogicAttackHero(enemy, random, superStrikeClass);
    }*/
}
