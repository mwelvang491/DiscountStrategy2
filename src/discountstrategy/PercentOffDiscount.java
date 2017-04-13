/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Mitch W
 */
public class PercentOffDiscount implements DiscountStrategy {
    private double discountRate;
     
    public PercentOffDiscount(double discountRate) {
      setDiscountRate(discountRate);  
    }

    @Override
    public final double getDiscount(int qty, double price) {
        return price * qty * discountRate;
    }

    @Override
    public final void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
 
    
}
