import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmyTest {

    Army army;
    Godzilla godzilla;

    @Before
    public void setUp() throws Exception {
        army = new Army("Terrestrial", 50, 30);
    }

    @Test
    public void canGetAType() {
        assertEquals("Terrestrial", army.getType());
    }

    @Test
    public void canGetAnAttackValue() {
        assertEquals(30, army.getAttackValue());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(50, army.getHealthValue());
    }

    @Test
    public void canSetHealthValue() {
        army.setHealthValue(70);
        assertEquals(70, army.getHealthValue());
    }

//    @Test
//    public void canTakeDamage() {
//        army.setHealthValue(army.takeDamage(10));
//        assertEquals(40, army.getHealthValue());
//    }

    @Test
    public void canAttack() {
        Godzilla godzilla = new Godzilla("Wee Godzilla", "Roooooaaar", 100, 200);
        army.attack(godzilla);
        assertEquals(30, army.getAttackValue());
    }
}
