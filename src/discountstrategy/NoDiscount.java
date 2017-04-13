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
public class NoDiscount implements DiscountStrategy {
     private double discount;
    

    @Override
    public final double getDiscount() {
        return discount;
    }

    @Override
    public final void setDiscountRate(double discount) {
        this.discount = discount;
    }
    
}
