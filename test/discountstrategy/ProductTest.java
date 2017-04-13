/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mitchell
 */
public class ProductTest {
    private Product product;
    
    public ProductTest() {
    }
    
    @Before
    public void setUp() {
        product = new Product("A101", "MLB Brewer's Hat ", 19.95, new PercentOffDiscount(0.15)  );
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of setRetialPrice method, of class Product.
     * Test: Retail Price Should Not Be Negative. 
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRetialPriceShouldNotBeNegative() {
      product.setRetialPrice(product.getMinRetialPrice()-1);
    }
    
    /**
     * Test of setRetialPrice method, of class Product.
     * Test: Retail price should not exceed max value. 
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRetialPriceShouldNotExceedMaxValue() {
      product.setRetialPrice(product.getMaxRetialPrice()+.0001);
    }



    /**
     * Test of setProdId method, of class Product.
     * Null Product Id Should Throw IAE
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetProdIdShouldThrowIae() {
       product.setName(null);
       
    }

    /**
     * Test of setName method, of class Product.
     * Null Product Name Should Throw IAE
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetNameNullShouldThrowIae() {
        product.setName(null);
    }
    
    /**
     * Test 
     * setRetialPrice Should be between min and max Retail value. 
     */
    @Test
    public void testSetRetialPriceShouldBeBetweenMinAndMaxRetialValue(){
          
        for(double i= product.getMinRetialPrice(); i < product.getMaxRetialPrice() ; i++) {
            try {
               //as of the time I Write this comment this will test values between 0 and 10,000
               product.setRetialPrice(i);

            } catch(IllegalArgumentException iae) {
                fail("Arguments from" + product.getMinRetialPrice() + " to " + product.getMaxRetialPrice() + " inclusive should be legal, "
                        + "but fails with IllegalArgumentException.");
            }
        }
        

    }

    
}
