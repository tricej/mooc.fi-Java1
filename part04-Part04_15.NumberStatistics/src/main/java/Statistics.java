/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jtrice
 */
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics () {
        this.count = 0;
    }
    
    public void addNumber(int number) {
        this.sum += number;
        count += 1;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public int sum() {
        return sum;
    }
    
    public double average() {
        if (this.count == 0) {
            return 0.0;
        }
        return 1.0 * this.sum / this.count;
    }
    
}
