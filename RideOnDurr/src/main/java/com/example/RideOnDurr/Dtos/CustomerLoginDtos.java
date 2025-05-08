package com.example.RideOnDurr.Dtos;

public class CustomerLoginDtos {
    private String userName;
    private String password;

    // No-args constructor
    public CustomerLoginDtos(){}

    // Parametrized constructor
    public CustomerLoginDtos(String userName,String password){
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
