package com.model;
// Generated Aug 15, 2018 2:16:27 AM by Hibernate Tools 5.1.8.Final


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="user"
    ,catalog="webshop2"
)
@Proxy(lazy = false)
public class User  implements java.io.Serializable {


     private String userId;
     private Role role;
     private String userName;
     private String userEmail;
     private String userPass;
     private Set<Bill> bills = new HashSet<Bill>(0);

    public User() {
    }

	
    public User(String userId, Role role, String userName, String userEmail, String userPass) {
        this.userId = userId;
        this.role = role;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPass = userPass;
    }
    public User(String userId, Role role, String userName, String userEmail, String userPass, Set<Bill> bills) {
       this.userId = userId;
       this.role = role;
       this.userName = userName;
       this.userEmail = userEmail;
       this.userPass = userPass;
       this.bills = bills;
    }
   
     @Id 

    
    @Column(name="user_id", unique=true, nullable=false, length=45)
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="role_id", nullable=false)
    public Role getRole() {
        return this.role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }

    
    @Column(name="user_name", nullable=false, length=45)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    @Column(name="user_email", nullable=false, length=45)
    public String getUserEmail() {
        return this.userEmail;
    }
    
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    
    @Column(name="user_pass", nullable=false, length=45)
    public String getUserPass() {
        return this.userPass;
    }
    
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<Bill> getBills() {
        return this.bills;
    }
    
    public void setBills(Set<Bill> bills) {
        this.bills = bills;
    }




}


