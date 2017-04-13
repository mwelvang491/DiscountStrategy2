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
    
    private Receipt receipt;
    private int receiptNumber=0;
    private OutputStrategy outputToConsole = new ConsoleOutputStrategy();
    
    public final void startSale(String customerId, DataAccessStrategy dataAccessStrat) {
        // needs validation
        receipt = new Receipt(customerId, dataAccessStrat, receiptNumber);
    }

    public final void addItemToSale(String productId, int qty) {
        // needs validation
        receipt.addLineItemToReceipt(productId, qty);
    }

    public final void endSale() {
        //Temporary. Needs Work. 
        //Create A New Inteface With SubClasses To Output. 
        incrementReceiptNumber();
        receipt.setReceiptNumber( receiptNumber );
        receipt.prepareReceiptForOutput();
        outputToConsole.handleOutput(receipt.getReceipt());
        
    }
    
       public final void incrementReceiptNumber(){
       receiptNumber++;
       }
 
}
