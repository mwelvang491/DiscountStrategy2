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
public class Customer {
    private String custId;
    private String name;
    
    Customer(String custId, String name) {
     setCustId(custId);
     setName(name); 
    }

    public final String getCustId() {
        return custId;
    }

    public final void setCustId(String custId) {
        if(name == null || name.length() < 0 || name.length() > 500){
       //throws exception.
        }  else{
         this.custId = custId;
        }
     
        
    }
    
    public final String getName() {
        return name;
    }

    public final void setName(String name) {
     if(name == null || name.length() < 0 || name.length() > 500){
       //throws exception.
     }else{
         this.name = name;
     }
     
    }
    
    
    
}
