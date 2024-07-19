public class Container {
    private int totalLiquid;

    public Container() {
        this.totalLiquid = 0;
    }

    public int contains() {
        return this.totalLiquid;
    }

    public void add(int amount) {
        if(amount < 0) {
            this.totalLiquid = this.totalLiquid;
        }

        if(this.totalLiquid + amount <= 100) {
            this.totalLiquid += amount;
        } 
    }

    public void remove(int amount) {
        if(amount < 0) {
            this.totalLiquid = this.totalLiquid;
        }

        if(this.totalLiquid - amount < 0) {
            this.totalLiquid = 0;
        }
    }
}