/**
 * ENUM class that holds a pool of greetings
 * @author Leo Gurrola
 */

import java.util.Random;

public enum Greeting {
    HELLO("Hello"),
    WELCOME("Welcome"),
    HELLOTHERE("Hello there"),
    GREETINGS("Greetings");

    private String greeting;

    /**
     * ENUMs hold their own strings
     * @param s
     */
    Greeting(String s) {
        this.greeting = s;
    }

    public String toString() {
        return greeting;
    }

    /**
     * gets randomized Greeting
     * @return
     */
    public static Greeting getRandGreeting() {
        Random rand = new Random();
        return values()[rand.nextInt(values().length)];
    }
}
