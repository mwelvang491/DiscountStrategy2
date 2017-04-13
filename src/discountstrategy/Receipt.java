/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

//import java.util.Calendar;

import java.text.NumberFormat;

//import java.util.Date;

/**
 *
 * @author Mitch W
 */
public class Receipt {
    private Customer customer;
    private String receipt="";
    private OutputStrategy output = new ConsoleOutputStrategy();
    private NumberFormat formatter = NumberFormat.getCurrencyInstance();
    private String storeGreeting = "Thank You For Shopping at Kohls";
    private String receiptHeader = "ProdId | Product Name | Retial Price | Quantity | SubTotal | Discount ";
    private int receiptNumber=0;
    private DataAccessStrategy dataAccessStrat;
    private LineItem[] lineItems = new LineItem[0];
    
    public Receipt(String customerId, DataAccessStrategy dataAccessStrat, int receiptNumber) {
        this.dataAccessStrat = dataAccessStrat;
        customer = findCustomer(customerId);  
        if(customer == null) customer = new Customer( "" , "");
        this.receiptNumber = receiptNumber;
    }

    private final Customer findCustomer(String customerId){
   //needs valiadation
    return dataAccessStrat.findCustomer(customerId);
    }
    
    public final void addLineItemToReceipt(String prodId, int qty) {
        // needs validation
        LineItem item = new LineItem(prodId, qty, dataAccessStrat);
        addToArray(item);
    }

   public final void prepareReceiptForOutput(){
   
      double netTotal=0; 
      double discountTotal=0;

         receipt +=  storeGreeting + "\n";
        // return_value = (true-false condition) ? (if true expression) : (if false expression);
        
         receipt += "Sold To: " + customer.getName() + "\n";
         receipt += "Date Of Sale: " + "\n";
         receipt += "Receipt Number: " + getReceiptNumber();
         receipt += "\n";
         receipt += (receiptHeader) + "\n";
         receipt += writeLineUsingCustomNumberOfHypens(68) + "\n";
       
        for(LineItem item : lineItems){
            receipt += item.getLineItemData() + "\n";
            netTotal += item.calculateSubtotalForLineItem();
            discountTotal += item.calculateDiscountForLineItem();
        }
          receipt += (writeLineUsingCustomNumberOfHypens(20)) + "\n";
          receipt +=("Net Total: " + formatter.format(netTotal) + "\n");
          receipt +=("Discount Total: -" + formatter.format(discountTotal) + "\n");
          receipt +=("Total Due: " + formatter.format(netTotal - discountTotal) + "\n");
           
        }
   
   private final void addToArray(final LineItem item) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
        tempItems = null;
    }

    public final int getReceiptNumber() {
        return receiptNumber;
    }

    public final void setReceiptNumber(int receiptNumber) {
        //needs valiadation
        this.receiptNumber = receiptNumber;
    }

    public final String getReceiptHeader() {
        return receiptHeader;
    }

    public final void setReceiptHeader(String receiptHeader) {
          //needs valiadation
        this.receiptHeader = receiptHeader;
    }

    public final String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
          //needs valiadation
        this.receipt = receipt;
    }
   
    public final String writeLineUsingCustomNumberOfHypens(int numOfHypens){
          //needs valiadation
        String data="";
        for(int i = 0; i <= numOfHypens; i++){
            data+="-";   
        }
      return data;
    }
    
}//end receipt class. 

