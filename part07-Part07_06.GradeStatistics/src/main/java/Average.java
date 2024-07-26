import java.util.Scanner;
import java.util.ArrayList;

public class Average {
    private double average;
    private double passingAverage;
    private double sum;
    private double passingGradeSum;
    private int passingGradeItems;
    private int numOfItems;
    private ArrayList<Integer> grades;
    private Scanner scanner;

    public Average() {
        this.average = 0.0;
        this.passingAverage = 0.0;
        this.sum = 0.0;
        this.passingGradeSum = 0.0;
        this.passingGradeItems = 0;
        this.numOfItems = 0;
        this.grades = new ArrayList<>(); // Initialize grades here
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
            int input = Integer.parseInt(scanner.nextLine());

            if (input >= 0 && input <= 100) {
                sum += input;
                numOfItems++;
                this.grades.add(input);

                if (input >= 50) { // Handle passing grades
                    passingGradeSum += input;
                    passingGradeItems++;
                }
            }

            if (input == -1) {
                break; // Do not add -1 to grades list
            }
        }

        if (numOfItems > 0) {
            this.average = calculateAverage();
        }

        if (passingGradeItems > 0) {
            this.passingAverage = calculatePassingAverage();
        }
    }

    public void printGradeDistribution() {
        int fiveStars = 0;
        int fourStars = 0;
        int threeStars = 0;
        int twoStars = 0;
        int oneStar = 0;
        int zeroStar = 0;

        for (int grade : this.grades) {
            if (grade < 50) {
                zeroStar++;
            } else if (grade >= 50 && grade < 60) {
                oneStar++;
            } else if (grade >= 60 && grade < 70) {
                twoStars++;
            } else if (grade >= 70 && grade < 80) {
                threeStars++;
            } else if (grade >= 80 && grade < 90) {
                fourStars++;
            } else if (grade >= 90 && grade <= 100) {
                fiveStars++;
            }
        }

        for (int i = 5; i >= 0; i--) {
            String stars = "";
            switch (i) {
                case 5: stars = "*".repeat(fiveStars); break;
                case 4: stars = "*".repeat(fourStars); break;
                case 3: stars = "*".repeat(threeStars); break;
                case 2: stars = "*".repeat(twoStars); break;
                case 1: stars = "*".repeat(oneStar); break;
                case 0: stars = "*".repeat(zeroStar); break;
            }
            System.out.println(i + ": " + stars);
        }
    }

    public void printResults() {
        System.out.println("Point average (all): " + this.average);
        System.out.println("Point average (passing): " + this.passingAverage);
        System.out.println("Pass percentage: " + 100 * (double) this.passingGradeItems / (double) this.numOfItems);
        System.out.println("Grade distribution:");
        printGradeDistribution(); // Just call the method here
    }
}

