
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

   public Money plus(Money addition) {
    // Calculate total euros and cents
    int totalEuros = this.euros + addition.euros;
    int totalCents = this.cents + addition.cents;

    // Handle overflow of cents
    if (totalCents >= 100) {
        totalEuros += totalCents / 100;
        totalCents = totalCents % 100;
    }

    // Create and return a new Money object with the calculated amounts
    return new Money(totalEuros, totalCents);
}



    public boolean lessThan(Money compared) {
       
        if(this.euros < compared.euros) {
            return true;
        } else if(this.euros == compared.euros){
            return this.cents < compared.cents;
        } else {
            return false;
        }

    }

    public Money minus(Money decreaser) {
    // Calculate difference in euros and cents
    int differenceEuros = this.euros - decreaser.euros;
    int differenceCents = this.cents - decreaser.cents;

    // Adjust for negative cents
    if (differenceCents < 0) {
        differenceEuros -= 1;  // Borrow 1 euro
        differenceCents += 100; // Convert negative cents to positive
    }

    // Ensure non-negative amounts
    if (differenceEuros < 0 || differenceCents < 0) {
        differenceEuros = 0;
        differenceCents = 0;
    }

    // Create and return a new Money object with the calculated amounts
    return new Money(differenceEuros, differenceCents);
}


  

}
