import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public int totalWeight() {
        int weight = 0;
        for(Item item: this.items) {
            weight += item.getWeight();
        }


        return weight;
    }

    @Override
    public String toString() {
        if(this.items.isEmpty()) {
            return "no items (0kg)";
        }

        if(this.items.size() == 1) {
            return this.items.size() + " item " + "(" + this.totalWeight() + ")";
        }

        return this.items.size() + " items" + "(" + this.totalWeight() + " kg)";
    }

}