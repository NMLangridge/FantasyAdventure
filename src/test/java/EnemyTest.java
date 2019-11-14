import enemy.Orc;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;
import player.Barbarian;
import player.Player;
import weapon.Sword;
import weapon.Weapon;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Troll troll;
    Orc orc;
    Player player;
    Weapon weapon;

    @Before
    public void before() {
        troll = new Troll();
        orc = new Orc();
        player = new Barbarian("Niall");
        weapon = new Sword(10);
    }

    @Test
    public void trollCanTakeDamage() {
        troll.takeDamage(10);
        assertEquals(40, troll.getHealthPoints());
    }

    @Test
    public void orcCanTakeDamage() {
        orc.takeDamage(5);
        assertEquals(20, orc.getHealthPoints());
    }

    @Test
    public void trollCanAttack() {
        troll.setWeapon(weapon);
        troll.attackHero(player);
        assertEquals(90, player.getHealthPoints());
    }

}
