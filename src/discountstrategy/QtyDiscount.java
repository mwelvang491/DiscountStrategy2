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
class QtyDiscount implements DiscountStrategy {
    double discount;
    int quantity;
    
    public QtyDiscount(double discount, int quantity) {
        setQuantity(quantity);
        setDiscountRate(discount);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    @Override
    public final double getDiscount() {
        return discount;
    }

    @Override
    public final void setDiscountRate(double discount) {
        this.discount = discount;
    }
    
}
