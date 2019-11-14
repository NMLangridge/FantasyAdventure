package enemy;

public abstract class Enemy {

    private int healthPoints;

    public Enemy(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void takeDamage(int damage) {
        this.healthPoints -= damage;
    }

}
