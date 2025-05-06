package com.example.RideOnDurr.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RideOnDurr.Entity.CustomerEntity;
import com.example.RideOnDurr.Repo.CustomerRepo;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo custRepo;
    
    public List<CustomerEntity> getAllCustomer(){
        return custRepo.findAll();
    } 
}
