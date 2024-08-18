public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Troll(100, "Головолом");
        System.out.println("Появился общий враг и у него " + enemy.getHealth() +
                Logic.aLotOfDamage(enemy.getHealth()) + " здоровья ");
        System.out.println();

        //Hero heroMan = new Hero("Zoiberg");
        //heroMan.attackEnemy(enemy);

        Hero warrior = new Warrior("Sigmund Fred");
        warrior.attackEnemy(enemy);

        Hero mage = new Mage("Alice");
        mage.attackEnemy(enemy);

        Hero archer = new Archer("Albert");
        archer.attackEnemy(enemy);
    }

}
