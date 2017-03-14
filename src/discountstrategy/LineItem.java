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
public class LineItem {
  private Product product; 
  private int qty;

    public LineItem(Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        this.qty = qty;
    }
   
   
   
}