package com.example.RideOnDurr.Dtos;

public class CustomerDtos {
    private String userName;
    private String Name;
    private String password;
    private String emailId;
    private String contact;
    private String address;

    // No-args constructor
    public CustomerDtos(){
    }

    //Custom constructor
    public CustomerDtos(String userName,String Name,
    String password,String emailId,String contact,String address){
        this.userName = userName;
        this.Name = Name;
        this.password = password;
        this.emailId = emailId;
        this.contact = contact;
        this.address = address;
    }
}
