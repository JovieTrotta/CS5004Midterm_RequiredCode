import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is the testing file for the Cookie class.
 */
public class CookieTest {
    Cookie testCookieOne, testCookieTwo;

    /**
     * Assigns our test objects their values.
     */
    @Before
    public void setup() {
        // testCookieOne setup. This is the default constructor.
        testCookieOne = new Cookie();

        // testCookieTwo setup. This is the parameterized constructor.
        testCookieTwo = new Cookie("oatmeal", "raisin", Shape.HEART, 10, 500);
    }

    @Test
    public void testDough() {
        // testing getDough and setDough methods
        assertEquals("vanilla", testCookieOne.getDough());
        assertEquals("oatmeal", testCookieTwo.getDough());
        testCookieOne.setDough("chocolate");
        testCookieTwo.setDough("sugar");
        assertEquals("chocolate", testCookieOne.getDough());
        assertEquals("sugar", testCookieTwo.getDough());
    }

    @Test
    public void testMixIn() {
        // testing getMixIn and setMixIn methods
        assertEquals(null, testCookieOne.getMixIn());
        assertEquals("raisin", testCookieTwo.getMixIn());
        testCookieOne.setMixIn("chocolate chips");
        testCookieTwo.setMixIn("cranberries");
        assertEquals("chocolate chips", testCookieOne.getMixIn());
        assertEquals("cranberries", testCookieTwo.getMixIn());
    }

    @Test
    public void testCookieShape() {
        // testing getCookieShape and setCookieShape methods
        assertEquals(Shape.CIRCLE, testCookieOne.getCookieShape());
        assertEquals(Shape.HEART, testCookieTwo.getCookieShape());
        testCookieOne.setCookieShape(Shape.HEART);
        testCookieTwo.setCookieShape(Shape.FLOWER);
        assertEquals(Shape.HEART, testCookieOne.getCookieShape());
        assertEquals(Shape.FLOWER, testCookieTwo.getCookieShape());
    }

    @Test
    public void testToString() {
        // testing toString method
        assertEquals("This is a vanilla cookie with null mixed in and baked in the shape of a CIRCLE.", testCookieOne.toString());
        assertEquals("This is a oatmeal cookie with raisin mixed in and baked in the shape of a HEART.", testCookieTwo.toString());
    }

    @Test
    public void testServings() {
        // testing getServings and setServings methods
        assertEquals(12, testCookieOne.getServings());
        assertEquals(10, testCookieTwo.getServings());
        testCookieOne.setServings(40);
        testCookieTwo.setServings(30);
        assertEquals(40, testCookieOne.getServings());
        assertEquals(30, testCookieTwo.getServings());
    }

    @Test
    public void testCalories() {
        // testing getCalories and setCalories methods
        assertEquals(800, testCookieOne.getCalories());
        assertEquals(500, testCookieTwo.getCalories());
        testCookieOne.setCalories(600);
        testCookieTwo.setCalories(1000);
        assertEquals(600, testCookieOne.getCalories());
        assertEquals(1000, testCookieTwo.getCalories());
    }

    @Test
    public void testGetServingCalories() {
        // testing getServingCalories method
        testCookieOne.setServings(24);
        testCookieTwo.setServings(16);
        testCookieOne.setCalories(2000);
        testCookieTwo.setCalories(4000);
        assertEquals(83, testCookieOne.getServingCalories());
        assertEquals(250, testCookieTwo.getServingCalories());
    }

}
