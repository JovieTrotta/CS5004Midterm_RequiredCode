import java.time.Instant;

/**
 * This is the Oven class.
 */
public class Oven {

    // these are the attributes of the Oven class
    // as you can see, they are assigned data types
    private String color;
    private double price;
    private String brand;
    private int temp;
    private double timer;

    // our static attribute uses a preexisting Java class (Instant)
    // and assigns it the current time
    // static will make sure this value belongs to the entire class
    private static Instant clock = Instant.now();

    // this is the default constructor for the Oven class
    public Oven() {
        this.color = "silver";
        this.price = 1000.0;
        this.brand = "Whirlpool";
        this.temp = 0;
        this.timer = 0.0;
    }

    // this is the parameterized constructor for the Oven class
    // it takes a color (string), a price (double), and a brand (string)
    public Oven(String color, Double price, String brand) {
        this.color = "white";
        this.price = 100.0;
        this.brand = "Bosch";
        this.temp = 0;
        this.timer = 0.0;
    }

    /**
     * Return the color.
     * @return string.
     */
    public String getColor() {
        return color;
    }

    /**
     * Return the price.
     * @return double.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Return the brand.
     * @return string.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Return the temperature.
     * @return int.
     */
    public int getTemp() {
        return temp;
    }

    /**
     * Return the timer.
     * @return double.
     */
    public double getTimer() {
        return timer;
    }

    /**
     * Set the temperature.
     * @param temp int.
     */
    public void setTemp(int temp) {
        if (temp > 500) {
            throw new IllegalArgumentException("The oven can't exceed 500 degrees.");
        } else {this.temp = temp;}
    }

    /**
     * Set the timer.
     * @param timer int.
     */
    public void setTimer(double timer) {
        this.timer = timer;
    }

    /**
     * Return the clock time in Universal Time.
     * @return instant.
     */
    public static Instant getClock() {
        return clock;
    }

    /**
     * Bake something.
     * @param food string.
     * @return string.
     */
    public String bake(String food) {
       return "You baked a " + food + ".";
    }
}
