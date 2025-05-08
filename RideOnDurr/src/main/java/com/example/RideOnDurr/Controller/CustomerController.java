package com.example.RideOnDurr.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RideOnDurr.Dtos.CustomerDtos;
import com.example.RideOnDurr.Dtos.CustomerLoginDtos;
import com.example.RideOnDurr.Dtos.CustomerResponseDtos;
import com.example.RideOnDurr.Entity.CustomerEntity;
import com.example.RideOnDurr.Service.CustomerService;


@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;

    @GetMapping("/login")
    public CustomerResponseDtos loginCustomer(@RequestBody CustomerLoginDtos customerLoginDtos) {
        return customerService.loginCustomer(customerLoginDtos.getUserName(),customerLoginDtos.getPassword());
    }
    
    @GetMapping("/getAll")
    public List<CustomerEntity> getAll() {
        return customerService.getAllCustomer();
    }

    @GetMapping("/{id}")
    public CustomerResponseDtos customerById(@PathVariable Integer id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping("/")
    public CustomerResponseDtos addNewCustomer(@RequestBody CustomerDtos customerDtos) {
        return customerService.addCustomer(customerDtos);
    }
    
    @PutMapping("/{id}")
    public CustomerResponseDtos updateCustomer(@PathVariable Integer id, @RequestBody CustomerDtos customerDtos) {
        return customerService.updateCustomerDetails(id,customerDtos);
    }

    @DeleteMapping("{id}")
    public String deleteCustomer(@PathVariable Integer id){
        return customerService.deleteCustomerDetail(id);
    }
}
