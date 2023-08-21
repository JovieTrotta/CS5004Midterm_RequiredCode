import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is the testing file for the Cookie class.
 */
public class IceCreamSandwichTest {
    IceCreamSandwich testICSCOne, testICSCTwo;

    /**
     * Assigns our test objects their values.
     */
    @Before
    public void setup() {
        // testICSCOne setup. This is the default constructor.
        testICSCOne = new IceCreamSandwich();

        // testICSCTwo setup. This is the parameterized constructor.
        testICSCTwo = new IceCreamSandwich(24, 1700, "strawberry", "vanilla", null, 1600);
    }

    @Test
    public void testServings() {
        // testing getServings and setServings methods
        assertEquals(12, testICSCOne.getServings());
        assertEquals(24, testICSCTwo.getServings());
        testICSCOne.setServings(40);
        testICSCTwo.setServings(30);
        assertEquals(40, testICSCOne.getServings());
        assertEquals(30, testICSCTwo.getServings());
    }

    @Test
    public void testCalories() {
        // testing getCalories and setCalories methods
        assertEquals(1600, testICSCOne.getCalories());
        assertEquals(3300, testICSCTwo.getCalories());
        testICSCOne.setCalories(600);
        testICSCTwo.setCalories(1000);
        assertEquals(1400, testICSCOne.getCalories());
        assertEquals(2600, testICSCTwo.getCalories());
    }

    @Test
    public void testGetServingCalories() {
        // testing getServingCalories method
        // since we've done an awful lot of dividing by odd numbers, I'm typecasting the expected value as int
        // getServingCalories returns an int, so we want them to be the same
        assertEquals(133, testICSCOne.getServingCalories());
        assertEquals(137, testICSCTwo.getServingCalories());
    }

    @Test
    public void testToString() {
        // testing toString method
        assertEquals("This is a vanilla cookie with null mixed in and baked in the shape of a CIRCLE. There is also a vanilla ice cream filling.", testICSCOne.toString());
        assertEquals("This is a vanilla cookie with null mixed in and baked in the shape of a CIRCLE. There is also a strawberry ice cream filling.", testICSCTwo.toString());
    }

}