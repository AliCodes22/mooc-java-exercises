import java.util.Scanner;

public class Average {
    private double average;
    private double passingAverage;
    private double sum;
    private double passingGradeSum;
    private int passingGradeItems;
    private int numOfItems;
    private Scanner scanner;

    public Average() {
        this.average = 0.0;
        this.passingAverage = 0.0;
        this.sum = 0.0;
        this.passingGradeSum = 0.0;
        this.passingGradeItems = 0;
        this.numOfItems = 0;
        this.scanner = new Scanner(System.in);
    }

    public double calculateAverage() {
        return this.sum / this.numOfItems;
    }

    public double calculatePassingAverage() {
        return this.passingGradeSum / this.passingGradeItems;
    }

    public void start() {
        System.out.println("Enter points totals, -1 stops:");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input >= 0 && input <= 100) {
                sum += input;
                numOfItems++;
            }

            if (input >= 50 && input <= 100) {
                passingGradeSum += input;
                passingGradeItems++;
            }

            if (input == -1) {
                break;
            }
        }

        if (numOfItems > 0) {
            this.average = calculateAverage();
        }

        if (passingGradeItems > 0) {
            this.passingAverage = calculatePassingAverage();
        }
    }

    public void printResults() {
        System.out.println("Point average (all): " + this.average);
        System.out.println("Point average (passing): " + this.passingAverage);
        System.out.println("Pass percentage: " + 100 * (double) this.passingGradeItems / (double) this.numOfItems);
    }

   
}
