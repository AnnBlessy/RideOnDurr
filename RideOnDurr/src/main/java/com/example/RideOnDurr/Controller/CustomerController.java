package com.example.RideOnDurr.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RideOnDurr.Entity.CustomerEntity;
import com.example.RideOnDurr.Service.CustomerService;



@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;

    @GetMapping("/getAll")
    public List<CustomerEntity> getAll() {
        return customerService.getAllCustomer();
    }
     
    
}
