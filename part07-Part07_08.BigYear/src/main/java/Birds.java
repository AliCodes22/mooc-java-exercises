import java.util.ArrayList;
import java.util.Scanner;

public class Birds{
    private ArrayList<Bird> birds;
    private Scanner scanner;


    public Birds(Scanner scanner) {
        this.birds = new ArrayList<>();
        this.scanner = scanner;
    }

    public void addBird(String name, String latinName) {
        Bird newBird = new Bird(name, latinName);

        this.birds.add(newBird);
    }

    public void addObservation(String name) {
       boolean found = false;

       for(Bird bird: this.birds) {
        if(bird.getName().equals(name)) {
            bird.addObservation();
            found = true;
        }
    }

    if(!found) {
        System.out.println("Not a bird!");
    }
 
    }

    public void printAllBirds() {
        for(Bird bird: this.birds) {
            System.out.println(bird.getName() + "(" + bird.getLatinName() + "): " + bird.getObservations() + " observations");
        }
    }

    public void printOneBird() {
        System.out.println("Bird?");
        String birdName = scanner.nextLine();

        for(Bird bird: this.birds) {

            if(bird.getName().equals(birdName)) {
                System.out.println(bird.getName() + "(" + bird.getLatinName() + "): " + bird.getObservations() + " observations");
                break;
            }
        }
    }

}