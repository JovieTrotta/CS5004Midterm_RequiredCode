/**
 * This is the Ice Cream Sandwich class.
 */
public class IceCreamSandwich implements Food {

    // these are the new attributes made relevant from the Food interface
    private int servings;
    private int calories;
    private String iceCream;

    // this is the attribute that instantiates the cookie object
    private Cookie cookie;

    // this is the default constructor for the Ice Cream Sandwich class
    public IceCreamSandwich() {
        this.servings = 12;
        this.calories = 800;
        this.iceCream = "vanilla";
        this.cookie = new Cookie();
    }

    // this is the parameterized constructor for the Ice Cream Sandwich class
    // it takes a serving number (int), total calories (int), and iceCream (string)
    // it also takes a number of parameters to create a cookie object that belongs to the Ice Cream Sandwich
    // servings will be the same, but cookieCalories are another (int)
    public IceCreamSandwich(int servings, int calories, String iceCream, String dough, String mixIn, int cookieCalories) {
        this.servings = servings;
        this.calories = calories;
        this.iceCream = iceCream;
        this.cookie = new Cookie(dough, mixIn, Shape.CIRCLE, servings, cookieCalories);
    }

    /**
     * Return the number of servings.
     * @return int.
     */
    public int getServings() {
        return servings;
    }

    /**
     * Set the number of servings.
     * @param servings int.
     */
    public void setServings(int servings) {
        this.servings = servings;
    }

    /**
     * Return the number of calories.
     * Adds the calories from the cookie to the Ice Cream Sandwich.
     * @return string.
     */
    public int getCalories() {
        return this.calories + cookie.getCalories();
    }

    /**
     * Set the number of calories.
     * @param calories int.
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
     * Return the attributes in a string.
     * @return string.
     */
    @Override
    public String toString() {
        return  cookie
                + " There is also a " + iceCream + " ice cream filling.";
    }

    /**
     * Overidden from Food interface.
     * Returns the calories per serving for a class that implements food interface.
     * @return calories int.
     */
    @Override
    public int getServingCalories() {
        int caloriesPerServing = 0;
        try {caloriesPerServing = this.getCalories() / this.servings;}
        catch (ArithmeticException x) {System.out.println("You can't divide by zero!");}
        finally {return (int) caloriesPerServing;}
    }
}
