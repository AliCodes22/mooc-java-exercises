import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        this.suitcases.add(suitcase);
    }

    public String toString() {
        return "";
    }

    public void printItems() {
        System.out.println("The suitcases in the hold contain the following items:");
        for(Suitcase suitcase: this.suitcases) {
            System.out.println(suitcase.toString());
        }
    }


}