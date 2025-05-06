package com.example.RideOnDurr.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class CustomerEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer custId;

    @Column(unique=true)
    private String userName;

    private String Name;

    private String password;
    
    @Column(unique=true)
    private String emailId;

    @Column(unique=true)
    private String contact;
    private String address;

    //No-args Constructor
    public CustomerEntity() {
    }
    
    //custom-constructor
    public CustomerEntity(String userName,String Name,String password,
    String emailId,String contact,String address){
        this.userName = userName;
        this.Name = Name;
        this.password = password;
        this.emailId = emailId;
        this.contact = contact;
        this.address = address;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
