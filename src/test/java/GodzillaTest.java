import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GodzillaTest {

    Godzilla godzilla;

    @Before
    public void setUp() throws Exception {
        godzilla = new Godzilla("Wee Godzilla", "Roooooaaar", 100, 200);
    }

    @Test
    public void canGetName() {
        assertEquals("Wee Godzilla", godzilla.getName());
    }

    @Test
    public void canGetRoar() {
        assertEquals("Roooooaaar", godzilla.getRoar());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(100, godzilla.getHealthValue());
    }

    @Test
    public void canSetHealthValue(){
        godzilla.setHealthValue(150);
        assertEquals(150, godzilla.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(200, godzilla.getAttackValue());
    }

    @Test
    public void canSetAttackValue() {
        godzilla.setAttackValue(180);
        assertEquals(180, godzilla.getAttackValue());
    }

//    @Test
//    public void canTakeDamage() {
//        godzilla.setHealthValue(godzilla.takeDamage(30));
//        assertEquals(70, godzilla.getHealthValue());
//    }

    @Test
    public void canAttack() {
        Army army = new Army("Terrestrial", 50, 30);
        godzilla.attack(army);
        assertEquals(200, godzilla.getAttackValue());
    }

    @Test
    public void canWalk() {
        assertEquals("I can walk!", godzilla.locomotion());
    }
}
