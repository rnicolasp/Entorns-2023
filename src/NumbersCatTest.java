import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NumbersCatTest {

    @Test
    public void donar_0_retorna_Zero() {
        assertEquals("Zero", NumbersCat.say(0l));
    }

    @Test
    public void donar_1_retorna_Un() {
        assertEquals("Un", NumbersCat.say(1l));
    }

    @Test
    public void donar_9_retorna_Nou() {
        assertEquals("Nou", NumbersCat.say(9l));
    }

    @Test
    public void donar_Menys3_retorna_Tres() {
        assertEquals("Menys tres", NumbersCat.say(-3l));
    }

    @Test
    public void donar_30_retorna_Trenta() {
        assertEquals("Trenta", NumbersCat.say(30l));
    }

    @Test
    public void donat_39() {
        assertEquals(("Trenta-nou"), NumbersCat.say(39));
    }

    @Test
    public void donat41() {
        assertEquals(("Quaranta-un"), NumbersCat.say(41l));
    }

    @Test
    public void donat40() {
        assertEquals(("Quaranta"), NumbersCat.say(40l));
    }

    @Test
    public void donat21() {
        assertEquals(("Vint-i-un"), NumbersCat.say(21l));
    }

    @Test
    public void donat100() {
        assertEquals(("Cent"), NumbersCat.say(100l));
    }

    @Test
    public void donat200() {
        assertEquals(("Dos-cents"), NumbersCat.say(200l));
    }

    @Test
    public void donat427() {
        assertEquals(("Quatre-cents vint-i-set"), NumbersCat.say(427l));
    }

    @Test
    public void donat999() {
        assertEquals(("Nou-cents noranta-nou"), NumbersCat.say(999l));
    }
}

