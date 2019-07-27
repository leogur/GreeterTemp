/**
 * test driver for a greeting program
 *
 * @author Leo Gurrola
 */

public class Driver {
    public static void main (String[] args) {
        /*
        for(Greeting greet : Greeting.values()) {
            System.out.println(greet.name() + " : " + greet.toString());
        }
         */

        Greeter guy = new Greeter(); // guy does a randomized greeting
        Greeter gal = new Greeter("Howdy");

        System.out.println("Guy says: " + guy.work() + "\nGal says: " + gal.work());
    }
}
