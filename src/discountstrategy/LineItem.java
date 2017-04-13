/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import java.text.NumberFormat;

/**
 *
 * @author Mitch W
 */
public class LineItem {
  
  private Product product; 
  private int qty;
  
   public LineItem(String productId, int qty, DataAccessStrategy dataAccessStrat ) {
       product = findProduct(productId, dataAccessStrat);
       if(product == null){
           product = new Product(productId,"" + "Product Not Found",0.0,new NoDiscount()); 
           this.qty=0;
       }else{
         this.qty = qty; 
        }  
       
       }
       
    
    private Product findProduct(String prodId, DataAccessStrategy dataAccessStrat){
       
        return dataAccessStrat.findProduct(prodId);
    }
  
  
    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        this.qty = qty;
    }
    

   
    public final String getLineItemData(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String data ="";
        data +=  product.getProdId() + "\t";
        data +=  product.getName() + "\t";
        data +=  formatter.format(product.getRetialPrice()) + "\t";
        data +=  qty + "\t";
        data +=  formatter.format(calculateSubtotalForLineItem()) + "\t"; //calculate subtotal.                      
        data +=  formatter.format(calculateDiscountForLineItem())  + "\t"; 
            return data; 
    }
    
    
    public final double calculateDiscountForLineItem(){
     // calculates discount for a line Item. 
      return ( (product.getRetialPrice() * qty ) * product.getDiscountStrategy().getDiscount() );
     }
     
    public final double calculateSubtotalForLineItem(){
         
     return (product.getRetialPrice() * qty );
     }
     
}//end class. 

   
