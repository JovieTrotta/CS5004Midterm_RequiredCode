import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is the testing file for the Oven class.
 */
public class OvenTest {
    Oven testOvenOne, testOvenTwo;

    /**
     * Assigns our test objects their values.
     */
    @Before
    public void setup() {
        // testOvenOne setup. This is the default constructor.
        testOvenOne = new Oven();

        // testOvenTwo setup. This is the parameterized constructor.
        testOvenTwo = new Oven("white", 100.0, "Bosch");
    }

    @Test
    public void testGetColor() {
        // testing getColor method
        assertEquals("silver", testOvenOne.getColor());
        assertEquals("white", testOvenTwo.getColor());
    }

    @Test
    public void testGetPrice() {
        // testing getPrice method
        // when comparing floats, you need to include a delta value due to the way computers store floats
        assertEquals(1000.0, testOvenOne.getPrice(),0.0);
        assertEquals(100.0, testOvenTwo.getPrice(),0.0);
    }

    @Test
    public void testGetBrand() {
        // testing getBrand method
        assertEquals("Whirlpool", testOvenOne.getBrand());
        assertEquals("Bosch", testOvenTwo.getBrand());
    }

    @Test
    public void testTemp() {
        // testing getTemp and setTemp method
        assertEquals(0, testOvenOne.getTemp());
        assertEquals(0, testOvenTwo.getTemp());
        testOvenOne.setTemp(300);
        testOvenTwo.setTemp(450);
        assertEquals(300, testOvenOne.getTemp());
        assertEquals(450, testOvenTwo.getTemp());
    }

    @Test
    public void testTimer() {
        // testing getTimer and setTimer method
        // when comparing floats, you need to include a delta value due to the way computers store floats
        assertEquals(0, testOvenOne.getTimer(), 0.0);
        assertEquals(0, testOvenTwo.getTimer(), 0.0);
        testOvenOne.setTimer(30.0);
        testOvenTwo.setTimer(15.0);
        assertEquals(30.0, testOvenOne.getTimer(), 0.0);
        assertEquals(15.0, testOvenTwo.getTimer(), 0.0);
    }

    @Test
    public void testGetClock() {
        // testing getClock method
        assertEquals(Oven.getClock(), testOvenOne.getClock());
        assertEquals(Oven.getClock(), testOvenTwo.getClock());
        assertEquals(testOvenOne.getClock(), testOvenTwo.getClock());
    }

    @Test
    public void testBake() {
        // testing bake method
        assertEquals("You baked a cupcake.", testOvenOne.bake("cupcake"));
        assertEquals("You baked a pie.", testOvenTwo.bake("pie"));
    }

}
