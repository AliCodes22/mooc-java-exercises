public class PaymentCard {
    private double initialBalance;

    public PaymentCard(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.initialBalance + " euros";
    }

    public void eatAffordably() {
        if(this.initialBalance < 0.0) {
            this.initialBalance = 0.0;
        }

        this.initialBalance -= 2.60;
    }

    public void eatHeartily() {
        if(this.initialBalance < 0.0) {
            this.initialBalance = 0.0;
        }

        this.initialBalance -= 4.60;
    }

    public void addMoney(double amount) {
        if(amount < 0.0) {
            this.initialBalance += 0.0;
        }

        this.initialBalance += amount;
    }

}