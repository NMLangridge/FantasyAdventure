package player;

import behaviours.IWeapon;
import enemy.Enemy;
import weapon.Weapon;

public abstract class Fighter extends Player implements IWeapon {

    private Weapon weapon;

    public Fighter(String name) {
        super(name);
        this.weapon = null;
    }

    public void addWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(this.weapon.getDamage());
    }

}
