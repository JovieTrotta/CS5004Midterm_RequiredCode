/**
 * This is the Sandwich Cookie class.
 * It extends the cookie class, and indirectly implements the Food interface.
 */
public class SandwichCookie extends Cookie {
    // these are the attributes of the Cookie class
    // as you can see, they are assigned data types
    private String dough;
    private String mixIn;
    private Shape cookieShape;

    // these are the new attributes made relevant from the Food interface
    private int servings;
    private int calories;

    // this is the new attribute specifically for the SandwichCookie class
    private String filling;

    // this is the default constructor for the SandwichCookie class
    public SandwichCookie() {
        this.dough = "vanilla";
        this.mixIn = null;
        this.cookieShape = Shape.CIRCLE;
        this.servings = 12;
        this.calories = 800;
        this.filling = "vanilla cream";
    }

    // this is the parameterized constructor for the SandwichCookie class
    // it takes a dough type (string), a mix-in (string), a cookie shape (Shape), serving number (int), total calories (int), and filling (string)
    public SandwichCookie(String dough, String mixIn, Shape cookieShape, int servings, int calories, String filling) {
        this.dough = dough;
        this.mixIn = mixIn;
        this.cookieShape = cookieShape;
        this.servings = servings;
        this.calories = calories;
        this.filling = filling;
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
                + cookieShape
                + " and filled with " + filling + ".";
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
     * @return int.
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
     * Return the filling.
     * @return string.
     */
    public String getFilling() {
        return filling;
    }

    /**
     * Set the filling.
     * @param filling string.
     */
    public void setFilling(String filling) {
        this.filling = filling;
    }

    /**
     * Overidden from Food interface and from parent class Cookie.
     * Returns the calories per serving  for a class that implements food interface.
     * @return calories int.
     */
    @Override
    public int getServingCalories() {
        int caloriesPerServing = 0;
        try {caloriesPerServing = ((this.calories / this.servings) * 2);} //fillings have more calories!
        catch (ArithmeticException x) {System.out.println("You can't divide by zero!");}
        finally {return (int) caloriesPerServing;}
    }
}
