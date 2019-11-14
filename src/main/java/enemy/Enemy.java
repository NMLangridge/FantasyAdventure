package enemy;

import player.Player;
import weapon.Weapon;

public abstract class Enemy {

    private int healthPoints;
    private Weapon weapon;

    public Enemy(int healthPoints) {
        this.healthPoints = healthPoints;
        this.weapon = null;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void takeDamage(int damage) {
        this.healthPoints -= damage;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attackHero(Player player) {
        player.takeDamage(this.weapon.getDamage());
    }

}
