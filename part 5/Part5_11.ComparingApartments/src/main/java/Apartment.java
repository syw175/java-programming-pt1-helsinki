
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment comparison) {
        if (this.squares > comparison.squares) {
            return true;
        } return false;
    }

    public int getPrice(Apartment apartment) {
        return apartment.squares* apartment.princePerSquare;
    }
    public int priceDifference(Apartment comparison) {
        int difference = getPrice(this) - getPrice(comparison);
        if (difference < 0) {
            return difference * -1;
        } return difference;
    }

    public boolean moreExpensiveThan(Apartment comparison) {
        if (getPrice(this) > getPrice(comparison)) {
            return true;
        } return false;
    }
}
