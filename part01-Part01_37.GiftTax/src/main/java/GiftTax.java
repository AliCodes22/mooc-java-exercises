import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double giftValue = Double.parseDouble(scan.nextLine());

        double tax = calculateGiftTax(giftValue);
        
        if (tax == 0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + tax);
        }
    }
    
    public static double calculateGiftTax(double giftValue) {
        if (giftValue <= 5000) {
            return 0;
        } else if (giftValue <= 25000) {
            return 100 + (giftValue - 5000) * 0.08;
        } else if (giftValue <= 55000) {
            return 1700 + (giftValue - 25000) * 0.10;
        } else if (giftValue <= 200000) {
            return 4700 + (giftValue - 55000) * 0.12;
        } else if (giftValue <= 1000000) {
            return 22100 + (giftValue - 200000) * 0.15;
        } else {
            return 142100 + (giftValue - 1000000) * 0.17;
        }
    }
}
