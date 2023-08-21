/**
 * This is the Cookie class.
 */
public class Cookie implements Food {

    // these are the attributes of the Cookie class
    // as you can see, they are assigned data types
    private String dough;
    private String mixIn;
    private Shape cookieShape;

    // these are the new attributes made relevant from the Food interface
    private int servings;
    private int calories;

    // this is the default constructor for the Cookie class
    public Cookie() {
        this.dough = "vanilla";
        this.mixIn = null;
        this.cookieShape = Shape.CIRCLE;
        this.servings = 12;
        this.calories = 800;
    }

    // this is the parameterized constructor for the Cookie class
    // it takes a dough type (string), a mix-in (string), a cookie shape (Shape), serving number (int), and total calories (int)
    public Cookie(String dough, String mixIn, Shape cookieShape, int servings, int calories) {
        this.dough = dough;
        this.mixIn = mixIn;
        this.cookieShape = cookieShape;
        this.servings = servings;
        this.calories = calories;
    }

    /**
     * Return the dough.
     * @return string.
     */
    public String getDough() {
        return dough;
    }

    /**
     * Set the dough.
     * @param dough string.
     */
    public void setDough(String dough) {
        this.dough = dough;
    }

    /**
     * Return the mix-in.
     * @return string.
     */
    public String getMixIn() {
        return mixIn;
    }

    /**
     * Set the mix-in.
     * @param mixIn string.
     */
    public void setMixIn(String mixIn) {
        this.mixIn = mixIn;
    }

    /**
     * Return the shape.
     * @return shape.
     */
    public Shape getCookieShape() {
        return cookieShape;
    }

    /**
     * Set the shape.
     * @param cookieShape shape.
     */
    public void setCookieShape(Shape cookieShape) {
        this.cookieShape = cookieShape;
    }

    /**
     * Return the attributes in a string.
     * @return string.
     */
    @Override
    public String toString() {
        return "This is a " + dough
                + " cookie with " + mixIn
                + " mixed in and baked in the shape of a "
                + cookieShape + ".";
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
     * @return string.
     */
    public int getCalories() {
        return calories;
    }

    /**
     * Set the number of calories.
     * @param calories int.
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
     * Overidden from Food interface.
     *  Returns the calories per serving  for a class that implements food interface.
     *  @return calories int.
     */
    @Override
    public int getServingCalories() {
        int caloriesPerServing = 0;
        try {caloriesPerServing = this.calories / this.servings;}
        catch (ArithmeticException x) {System.out.println("You can't divide by zero!");}
        finally {return (int) caloriesPerServing;}
    }
}
