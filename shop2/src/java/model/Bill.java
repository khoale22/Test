/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Khoale123
 */
@Entity(name = "bill")
public class Bill {
    @Id
    private long billID;
    private long userID;
    private double total;
    private String payment;
    private String address;
    private Timestamp date;
    @OneToMany
     @JoinColumn(name = "billID")
    private List<BillDetail> listBillDetail;

    public List<BillDetail> getListBillDetail() {
        return listBillDetail;
    }

    public void setListBillDetail(List<BillDetail> listBillDetail) {
        this.listBillDetail = listBillDetail;
    }

    public Bill() {
    }

    public Bill(long billID, long userID, double total, String payment, String address, Timestamp date) {
        this.billID = billID;
        this.userID = userID;
        this.total = total;
        this.payment = payment;
        this.address = address;
        this.date = date;
    }

    public long getBillID() {
        return billID;
    }

    public void setBillID(long billID) {
        this.billID = billID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
    
    
}
