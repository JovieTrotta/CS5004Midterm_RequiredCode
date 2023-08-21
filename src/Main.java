/**
 * This is the main (driver) class.
 */
public class Main {
    public static void main(String []args) {

        // this variable is called cookieNumber and represents an integer data type
        int cookieNumber = 12;

        // this variable is called cookieType and represents a string data type
        String cookieType = "Gingerbread";

        // this variable is called isBaked and represents a boolean data type
        Boolean isBaked = true;

        // this variable is called cookieShape and represents the enum data type: shape
        Shape cookieShape = Shape.FLOWER;

        System.out.println("Here are some example strings using my variables: ");

        if (isBaked == true) {
            System.out.println("I'm making " + cookieNumber + " " + cookieType + " " + "cookies.");
            System.out.println("They are shaped like a " + cookieShape + ".");
            System.out.println("They're ready!");
        } else {
            System.out.println("I'm making " + cookieNumber + " " + cookieType + " " + "cookies.");
            System.out.println("They are shaped like a " + cookieShape + ".");
            System.out.println("Unfortunately, they're not ready yet.");
        }

        // creates a cookie using the default constructor
        Cookie cookieOne = new Cookie();

        // creates a cookie using the parameterized constructor
        Cookie cookieTwo = new Cookie("chocolate", "peanut butter morsels", Shape.HEART, 0, 800);

        // let's set the attributes for cookieOne
        cookieOne.setDough("oatmeal");
        cookieOne.setMixIn("raisin");
        cookieOne.setCookieShape(Shape.CIRCLE);

        // whitespace
        System.out.println();

        // let's get the attributes for cookieOne
        System.out.println("Here are the printed return values for the getter methods:");
        System.out.println(cookieOne.getDough());
        System.out.println(cookieOne.getMixIn());
        System.out.println(cookieOne.getCookieShape());

        // whitespace
        System.out.println();

        // attempts to print the cookies without a toString method
        System.out.println("Here are the printed cookie objects with a toString method:");
        System.out.println(cookieOne);
        System.out.println(cookieTwo);

        // whitespace
        System.out.println();

        // creates an oven object using the default constructor
        Oven ovenOne = new Oven();

        // sets and gets the oven temperature
        ovenOne.setTemp(450);
        System.out.println("The oven's temperature is: " + ovenOne.getTemp());

        // sets and gets a timer for the oven
        ovenOne.setTimer(15.0);
        System.out.println("The oven's timer is set for: " + ovenOne.getTimer());

        // bakes something in the oven
        System.out.println(ovenOne.bake("pizza"));

        // create a second oven object
        Oven ovenTwo = new Oven();

        // whitespace
        System.out.println();

        // compares the clock on both ovens
        // since this belongs to the class and not the individual objects
        // they will display basically the same time
        System.out.println("Oven time one: " + ovenOne.getClock());
        System.out.println("Oven time two: " + ovenTwo.getClock());

        // whitespace
        System.out.println();

        // attempting to calculate calories per serving when the serving number is 0
        // show the uncalculated calories per serving (0)
        System.out.println("Here's the invalid calories per serving: " + cookieTwo.getServingCalories());

        // whitespace
        System.out.println();

        // create a new SandwichCookie and print it with its calories per serving
        SandwichCookie sandwichCookieOne = new SandwichCookie("shortbread", null, Shape.HEART, 12, 1200, "peach jam");
        System.out.println(sandwichCookieOne.toString());
        System.out.println("Calories per serving: " + sandwichCookieOne.getServingCalories());

        // whitespace
        System.out.println();

        // create a new IceCreamSandwich and print it with its calories per serving
        IceCreamSandwich iceCreamSandwichOne = new IceCreamSandwich(24, 1700, "strawberry", "vanilla", null, 1600);
        System.out.println(iceCreamSandwichOne.toString());
        System.out.println("Calories per serving: " + iceCreamSandwichOne.getServingCalories());

    }
}
