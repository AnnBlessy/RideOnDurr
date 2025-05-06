package com.example.RideOnDurr.Dtos;

public class CustomerResponseDtos {
    private String userName;
    private String Name;
    private String emailId;
    private String contact;
    private String address;

    // No-args constructor
    public CustomerResponseDtos(){
    }

    // custom constructor
    public CustomerResponseDtos(String userName,String Name,
    String emailId,String contact,String address){
        this.userName = userName;
        this.Name = Name;
        this.emailId = emailId;
        this.contact = contact;
        this.address = address;
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
