import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

   

    public int totalWeight() {
        int weight = 0;
        for(Item item: this.items) {
            weight += item.getWeight();
        }


        return weight;
    }

    public boolean isFull(Item item) {
        return this.totalWeight() == this.maxWeight;    
    }
    

     public void addItem(Item item) {

        if(isFull(item))
        this.items.add(item);
    }

    public void printItems() {
        for(Item item: this.items) {
            System.out.println(item.getName());
        } 
    }

    public Item heaviestItem() {
        Item heaviest = new Item(null, 0);

        if(this.items.isEmpty()) {
            return null;
        }

        for(Item item: this.items) {
            if(item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }

    @Override
    public String toString() {
        if(this.items.isEmpty()) {
            return "no items (0kg)";
        }

        if(this.items.size() == 1) {
            return this.items.size() + " item " + "(" + this.totalWeight() + "kg)" ;
        }

        return this.items.size() + " items " + "(" + this.totalWeight() + "kg)";
    }

}