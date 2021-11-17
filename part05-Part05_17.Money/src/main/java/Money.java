
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

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money comparison) {
        if (this == comparison) {
            return false;
        }

        if (this.euros > comparison.euros) {
            return false;
        }

        if (this.euros == comparison.euros &&
            this.cents > comparison.cents) {
                return false;
        } 
        return true;
    }

    public Money minus(Money decreaser) {
        if (this.lessThan(decreaser)) {
            Money result = new Money(0,0);
            return result;
        }

        if (this.cents < decreaser.cents) {
            int newCents = 100 + this.cents - decreaser.cents;
            int newEuros = this.euros - decreaser.euros - 1;
            Money newMoney = new Money(newEuros, newCents);
            return newMoney;
        }

        int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;        
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;


    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }



}
