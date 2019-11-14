package heal;

public abstract class Heal {

    private int health;

    public Heal(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
