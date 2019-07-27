/**
 * class that prints a greeting
 *
 * @author Leo Gurrola
 */

public class Greeter {
    private String greeting;

    /**
     * default constructor
     * returns a random greeting from a pool of Greeting ENUMs
     */
    public Greeter() {
        this.greeting = Greeting.getRandGreeting().toString();
    }

    /**
     * custom constructor
     * returns a custom greeting
     * @param customGreet the greeting
     */
    public Greeter(String customGreet) {
        this.greeting = customGreet;
    }

    /**
     * makes the Greeter do its thing
     * @return the greeting
     */
    public String work() {
        return greeting;
    }
}
