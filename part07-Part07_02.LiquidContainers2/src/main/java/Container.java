public class Container {
    private int total;

    public Container() {
        this.total = 0;
    }

    public int contains() {
        return this.total;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.total += amount;
            if (this.total > 100) {
                this.total = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.total -= amount;
            if (this.total < 0) {
                this.total = 0;
            }
        }
    }

     public void move(Container target, int amount) {
        if (amount > 0) {
            // Move the lesser of amount requested or available liquid
            int amountToMove = Math.min(amount, this.total);

            // Remove the liquid from the source container
            this.remove(amountToMove);

            // Add the liquid to the target container
            target.add(amountToMove);
        }
    }

    @Override
    public String toString() {
        return this.total + "/100";
    }
}
