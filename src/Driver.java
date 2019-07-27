public class Driver {
    public static void main (String[] args) {
        /*
        for(Greeting greet : Greeting.values()) {
            System.out.println(greet.name() + " : " + greet.toString());
        }
         */

        Greeter guy = new Greeter();
        Greeter gal = new Greeter("Howdy");

        System.out.println(guy.work());
        System.out.println(gal.work());
    }
}
