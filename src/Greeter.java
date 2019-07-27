public class Greeter {
    private String greeting;

    public Greeter() {
        this.greeting = Greeting.getRandGreeting().toString();
    }
    public Greeter(String customGreet) {
        this.greeting = customGreet;
    }

    public String work() {
        return greeting;
    }
}
