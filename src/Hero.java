public abstract class Hero {
    private int health;
    String name;

    public Hero(String name) {
        this.name = name;
    }

    public Hero(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public boolean isAlive() {
        if (health > 0) return true;
        return false;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);
    //{

        //enemy.takeDamage(classDamage);
        //System.out.println(name + " атакует врага");
        //System.out.println("У врага осталось " + enemy.getHealth() + aLotOfDamage(classDamage) + " здоровья");
        //System.out.println();
    //}
        public void takeDamage(int damage){
            health = health - damage;
        }
}
