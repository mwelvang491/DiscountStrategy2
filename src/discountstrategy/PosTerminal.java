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
public class PosTerminal {
     
    
    void startSaleWithOutCustomerId() {
       
    }

    void startSaleWithCusomterId(String customerId) {
       
    }

    void addLineItemToSale(String productId, int qty) {
      ReceiptDataAccessStrategy accessStrategy = new  InMemoryDataAccess();
      
      LineItem lineItem = new LineItem( accessStrategy.findProduct(productId) , qty);
      
    }

    void endSale() {
     
    }
 
}
