public class Boss extends GameEntity{
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return getName() + "Health: " + getHealth() +
                "; Damage: " + getDamage() +
                "; Weapon Type: " + weapon.getType() +
                "; Weapon Title: " + weapon.getTitle();
    }
}
