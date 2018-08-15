/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Khoale123
 */
@Entity(name ="billdetail")
public class BillDetail {
    @Id
    private long billdetailID;
    
    @ManyToOne
     @JoinColumn(name = "billID")
    private Bill  bill;
    private long productID;
    private double price;
    private int quantity;

    public BillDetail() {
    }

    public BillDetail(long billdetailID, Bill bill, long productID, double price, int quantity) {
        this.billdetailID = billdetailID;
        this.bill = bill;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    public long getBilldetailID() {
        return billdetailID;
    }

    public void setBilldetailID(long billdetailID) {
        this.billdetailID = billdetailID;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   
}
