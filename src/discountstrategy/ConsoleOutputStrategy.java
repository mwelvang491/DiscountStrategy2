/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author mitchell
 */
public class ConsoleOutputStrategy implements OutputStrategy{
    
     @Override
     public final void handleOutput(String msg){
     System.out.println(msg);
    }
    
 
}

