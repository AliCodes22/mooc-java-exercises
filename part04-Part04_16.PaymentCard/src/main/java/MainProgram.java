
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard paulsCard = new PaymentCard(20.0);
        PaymentCard mattsCard = new PaymentCard(30.0);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        paulsCard.toString();
        mattsCard.toString();

        paulsCard.addMoney(20.0);
        mattsCard.eatHeartily();

        paulsCard.toString();
        mattsCard.toString();

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();

        mattsCard.addMoney(50.0);

        paulsCard.toString();
        mattsCard.toString();
    }
}
