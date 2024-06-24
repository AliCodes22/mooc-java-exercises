
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here

        PaymentTerminal cafeTerminal = new PaymentTerminal();

        double change = cafeTerminal.eatAffordably(10);
        System.out.println("remaining change " + change);

        change = cafeTerminal.eatAffordably(5);
        System.out.println("remaining change " +  change);

        change = cafeTerminal.eatHeartily(4.3);
        System.out.println("remaining change " + change );

        System.out.println(cafeTerminal);
    }
}

