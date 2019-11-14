package player;

public abstract class Player {

    private String name;
    private int healthPoints;

    public Player(String name) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

}
