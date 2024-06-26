
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getArea() {
        return this.squares;
    }

    public int getPrice() {
        return this.pricePerSquare * this.squares;
    }

    public boolean largerThan(Apartment compared) {
        if(this.getArea() > compared.getArea()) {
            return true;

        } else {
            return false;
        }

    }

    public int priceDifference(Apartment compared) {
        return Math.abs(
            this.getPrice() - compared.getPrice()
            );
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if(this.getPrice() > compared. getPrice()) {
            return true;
        } else {
            return false;
        }
    }



}
