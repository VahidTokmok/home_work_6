public class Main {
    public static void main(String[] args) {
    Boss boss = new Boss();
    boss.setName("Boss: ");
    boss.setHealth(800);
    boss.setDamage(70);
    boss.weapon.setType(WeaponType.STEEL_ARMS);
    boss.weapon.setTitle("Sword");
        System.out.println(boss.printInfo());

    Skelet level1 = new Skelet();
    level1.setName("Skeleton level 1: ");
    level1.setHealth(200);
    level1.setDamage(10);
    level1.weapon.setType(WeaponType.THROWING);
    level1.weapon.setTitle("Bow");
    level1.setNumberOfArrows(20);
        System.out.println(level1.printInfo() + level1.skeletInfo());

    Skelet level5 = new Skelet();
    level5.setName("Skeleton level 5: ");
    level5.setHealth(500);
    level5.setDamage(25);
    level5.weapon.setType(WeaponType.THROWING);
    level5.weapon.setTitle("Bow");
    level5.setNumberOfArrows(100);
        System.out.println(level5.printInfo() + level5.skeletInfo());

    }

}