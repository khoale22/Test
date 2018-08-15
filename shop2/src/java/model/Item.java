/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Khoale123
 */
public class Item {
    
    private Product product ;
    private int quanlity ;

    public Item() {
    }

    public Item(Product product, int quanlity) {
        this.product = product;
        this.quanlity = quanlity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }
    
    
    
}
