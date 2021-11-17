
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getSquares() {
        return this.squares;
    }

    public int getPrice() {
        return this.princePerSquare * squares;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.getSquares()) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        return Math.abs(compared.getPrice() - (this.squares * this.princePerSquare));
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.princePerSquare * this.squares > compared.getPrice()) {
            return true;
        } else {
            return false;
        }
    }

}
