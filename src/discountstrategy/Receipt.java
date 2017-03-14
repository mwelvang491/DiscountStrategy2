/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Mitch W
 */
public abstract class Receipt {
//private Customer customer;
    
private LineItem[] lineItems;

private final Date currentDate = Calendar.getInstance().getTime();

public abstract double getOrCalculateGrandTotal();  
 
private void addNewLineItemToReceipt(final LineItem item) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
        tempItems = null;
    }

private void outputReceipt(){
     //violates single responsibilty. 
    //need to move to a new class. For Example: ReceiptOutputStrategy. 
    for(LineItem item : lineItems){
     
    }
            
}
    
}//end receipt class. 
