/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jtrice
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void eatAffordably() {
        if (this.balance - 2.60 >= 0) {
            this.balance -= 2.60;
        }
    }
    
    public void eatHeartily() {
        if (this.balance - 4.60 >= 0) {
            this.balance -= 4.60;
        }
    }
    
    public void addMoney (double amount) {
        if (amount < 0) {
            amount = 0;
        }
        if (this.balance + amount <= 150.0) { 
        this.balance += amount;
        } else {
            this.balance = 150.0;
        }
    }
    
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
