package com.model;
// Generated Aug 15, 2018 2:16:27 AM by Hibernate Tools 5.1.8.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

/**
 * Billdetail generated by hbm2java
 */
@Entity
@Table(name="billdetail"
    ,catalog="webshop2"
)
@Proxy(lazy = false)
public class Billdetail  implements java.io.Serializable {


     private String billDetailId;
     private Bill bill;
     private Product product;
     private double price;
     private int quantily;

    public Billdetail() {
    }

    public Billdetail(String billDetailId, Bill bill, Product product, double price, int quantily) {
       this.billDetailId = billDetailId;
       this.bill = bill;
       this.product = product;
       this.price = price;
       this.quantily = quantily;
    }
   
     @Id 

    
    @Column(name="billDetail_id", unique=true, nullable=false, length=45)
    public String getBillDetailId() {
        return this.billDetailId;
    }
    
    public void setBillDetailId(String billDetailId) {
        this.billDetailId = billDetailId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="bill_id", nullable=false)
    public Bill getBill() {
        return this.bill;
    }
    
    public void setBill(Bill bill) {
        this.bill = bill;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="product_id", nullable=false)
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }

    
    @Column(name="price", nullable=false, precision=22, scale=0)
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    
    @Column(name="quantily", nullable=false)
    public int getQuantily() {
        return this.quantily;
    }
    
    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }




}


