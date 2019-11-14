import enemy.Orc;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Troll troll;
    Orc orc;

    @Before
    public void before() {
        troll = new Troll();
        orc = new Orc();
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
        troll.attack();
    }

}
