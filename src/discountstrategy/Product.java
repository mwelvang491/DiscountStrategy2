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
class Product {
 private double maxRetialPrice=10000;
 private double minRetialPrice=0;
 
 private double retialPrice;
 private String prodId;
 private String name;
 private final DiscountStrategy discount;

    public Product(String prodId, String name, double retialPrice, DiscountStrategy discount) {
        setRetialPrice(retialPrice);
        setProdId(prodId);
        setName(name);
        this.discount = discount;
    }

    public final double getRetialPrice() {
        return retialPrice;
    }
    
    public final  void setRetialPrice(double retialPrice) throws IllegalArgumentException {
        if(retialPrice < minRetialPrice || retialPrice >= maxRetialPrice){
        throw new IllegalArgumentException("prodId Is Null Or Empty");
        }
        this.retialPrice = retialPrice;
    }

    public final  String getProdId() {
        return prodId;
    }

    public final void setProdId(String prodId) throws IllegalArgumentException {
        if(prodId == null || prodId.isEmpty() ){
        throw new IllegalArgumentException("prodId Is Null Or Empty");
        }
        this.prodId = prodId;
    }
    
    public final String getName() {
        return name;
    }

    public final void setName(String name)  throws IllegalArgumentException {
         if(name == null || name.length() == 0) {
            throw new IllegalArgumentException("The Product name is a required field");
        }
        this.name = name;
    }
    
    public DiscountStrategy getDiscount() {
        return discount;
    }

    public double getMinRetialPrice() {
        return minRetialPrice;
    }

    public void setMinRetialPrice(double minRetialPrice) {
        this.minRetialPrice = minRetialPrice;
    }

    public double getMaxRetialPrice() {
        return maxRetialPrice;
    }

    public void setMaxRetialPrice(double maxRetialPrice) {
        this.maxRetialPrice = maxRetialPrice;
    }
    
    


}
