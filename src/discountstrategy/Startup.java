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
public class Startup {
    public static void main(String[] args) {
        String storeGreeting = "Thank You For Shopping at Kohls";
        PosTerminal posTerminal = new PosTerminal();
        DataAccessStrategy dataAccessStrat = new InMemoryDataAccess();
         
        posTerminal.startSale("200", dataAccessStrat );
        posTerminal.addItemToSale("C222", 4);
        posTerminal.addItemToSale("B205", 6);
        posTerminal.endSale();
        
        
        posTerminal.startSale(null, dataAccessStrat );
        posTerminal.addItemToSale("C222", 4);
        posTerminal.addItemToSale("B5", 6);
        posTerminal.endSale();
             
    }
   
}
