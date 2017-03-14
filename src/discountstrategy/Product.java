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
 private double retialPrice;
 private String prodId;
 private String name;
 private final DiscountStrategy discount;

    public Product(String prodId, String name, double retialPrice, DiscountStrategy discount) {
        this.retialPrice = retialPrice;
        this.prodId = prodId;
        this.name = name;
        this.discount = discount;
    }

    public final double getRetialPrice() {
        return retialPrice;
    }

    public final  void setRetialPrice(double retialPrice) {
        this.retialPrice = retialPrice;
    }

    public final  String getProdId() {
        return prodId;
    }

    public final void setProdId(String prodId) {
        this.prodId = prodId;
    }


    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }
 

 
}
