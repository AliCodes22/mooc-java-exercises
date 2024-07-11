import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if(this.getWeight() + suitcase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public int getWeight() {
        int weight = 0;

        for(Suitcase suitcase: this.suitcases) {
            weight += suitcase.totalWeight();
        }

        return weight;
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.getWeight() + "kg)";
    }

    public void printItems() {
        System.out.println("The suitcases in the hold contain the following items:");
        
        for(Suitcase suitcase: this.suitcases) {
            suitcase.printItems();;
        }
    }


}