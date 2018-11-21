import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarineTest {

    Marine marine;

    @Before
    public void setUp() throws Exception {
        marine = new Marine("Aquatic", 70, 40);
    }

    @Test
    public void canGetAType() {
        assertEquals("Aquatic", marine.getType());
    }

    @Test
    public void canGetAnAttackValue() {
        assertEquals(40, marine.getAttackValue());
    }

    @Test
    public void canGetAHealthValue() {
        assertEquals(70, marine.getHealthValue());
    }

    @Test
    public void canSetHealthValue() {
        marine.setHealthValue(100);
        assertEquals(100, marine.getHealthValue());
    }

//    @Test
//    public void canTakeDamage() {
//        marine.setHealthValue(marine.takeDamage(10));
//        assertEquals(60,  marine.getHealthValue());
//    }

    @Test
    public void canAttack() {
        Godzilla godzilla = new Godzilla("Wee Godzilla", "Roooooaaar", 100, 200);
        marine.attack(godzilla);
        assertEquals(40, marine.getAttackValue());
    }
}
