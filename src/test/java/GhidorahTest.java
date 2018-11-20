import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GhidorahTest {

    Ghidorah ghidorah;

    @Before
    public void setUp() throws Exception {
        ghidorah = new Ghidorah("Wee Ghidorah", "waaaaaaaaooow", 80, 150);
    }

    @Test
    public void canGetName() {
        assertEquals("Wee Ghidorah", ghidorah.getName());
    }

    @Test
    public void canGetRoar() {
        assertEquals("waaaaaaaaooow", ghidorah.getRoar());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(80, ghidorah.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(150, ghidorah.getAttackValue());
    }

    @Test
    public void canAttack() {
        Army army = new Army("Terrestrial", 50, 30);
        ghidorah.attack(army);
        assertEquals(150, ghidorah.getAttackValue());
    }
}
