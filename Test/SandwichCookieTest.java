import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is the testing file for the Cookie class.
 */
public class SandwichCookieTest {
    SandwichCookie testSCOne, testSCTwo;

    /**
     * Assigns our test objects their values.
     */
    @Before
    public void setup() {
        // testSCOne setup. This is the default constructor.
        testSCOne = new SandwichCookie();

        // testSCTwo setup. This is the parameterized constructor.
        testSCTwo = new SandwichCookie("oatmeal", "raisin", Shape.HEART, 12, 500, "raspberry jam");
    }

    @Test
    public void testFilling() {
        // testing getFilling and setFilling methods
        assertEquals("vanilla cream", testSCOne.getFilling());
        assertEquals("raspberry jam", testSCTwo.getFilling());
        testSCOne.setFilling("chocolate cream");
        testSCTwo.setFilling("peach jam");
        assertEquals("chocolate cream", testSCOne.getFilling());
        assertEquals("peach jam", testSCTwo.getFilling());
    }

    @Test
    public void testToString() {
        // testing toString method
        assertEquals("This is a vanilla cookie with null mixed in and baked in the shape of a CIRCLE and filled with vanilla cream.", testSCOne.toString());
        assertEquals("This is a oatmeal cookie with raisin mixed in and baked in the shape of a HEART and filled with raspberry jam.", testSCTwo.toString());
    }

}