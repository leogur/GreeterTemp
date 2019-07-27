import java.util.Random;

public enum Greeting {
    HELLO("Hello"),
    WELCOME("Welcome"),
    HELLOTHERE("Hello there"),
    GREETINGS("Greetings");

    private String greeting;

    Greeting(String s) {
        this.greeting = s;
    }

    public String toString() {
        return greeting;
    }

    public static Greeting getRandGreeting() {
        Random rand = new Random();
        return values()[rand.nextInt(values().length)];
    }
}
