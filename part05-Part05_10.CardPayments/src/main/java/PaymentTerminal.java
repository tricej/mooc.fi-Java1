
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // Check if payment can cover the 2.50 charge for the meal, modify cash balance to reflect transaction
        if (payment >= 2.5) {
            affordableMeals++;
            this.money += 2.5;
            return payment - 2.5;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        // Check if payment can cover the 4.30 charge for the meal, modify cash balance to reflect transaction
        if (payment >= 4.3) {
            heartyMeals++;
            this.money += 4.3;
            return payment - 4.3;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        // Check if card has enough balance to cover the 2.50 charge for the meal. Modify card balance to reflect charge.
        if (card.balance() >= 2.5) {
            affordableMeals++;
            card.takeMoney(2.5);
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        // Check if card has enough balance to cover the 4.30 charge for the meal. Modify card balance to reflect charge.
        if (card.balance() >= 4.3) {
            heartyMeals++;
            card.takeMoney(4.3); 
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        // Add money to the card balance and add cash to total available to the payment terminal.
        if (sum >= 0) {
            card.addMoney(sum);
            money += sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
