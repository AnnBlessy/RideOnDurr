package com.example.RideOnDurr.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RideOnDurr.Dtos.CustomerDtos;
import com.example.RideOnDurr.Dtos.CustomerResponseDtos;
import com.example.RideOnDurr.Entity.CustomerEntity;
import com.example.RideOnDurr.Repo.CustomerRepo;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo custRepo;
    
    public List<CustomerEntity> getAllCustomer(){
        return custRepo.findAll();
    } 

    // For Login Authentication
    public CustomerResponseDtos loginCustomer(String username,String password){
        Optional<CustomerEntity> optionalCustomer = custRepo.findByUserNameAndPassword(username, password);
        if(optionalCustomer.isPresent()){
            CustomerEntity customer = optionalCustomer.get();
            return new CustomerResponseDtos(
                customer.getName(),
                customer.getUserName(),
                customer.getName(),
                customer.getContact(),
                customer.getAddress()
            );
        }
        else{
            throw new RuntimeException("userName/mailId is not valid");
        }
    }

    public CustomerResponseDtos getCustomerById(Integer id){
        Optional<CustomerEntity> optionalCustomer = custRepo.findById(id);

        if(optionalCustomer.isPresent()){
            CustomerEntity customer = optionalCustomer.get();
            return new CustomerResponseDtos(
                customer.getUserName(),
                customer.getName(),
                customer.getEmailId(),
                customer.getAddress(),
                customer.getContact()
            );
        }
        else{
            throw new RuntimeException("Customer with the ID"+id+"not found");
        }
    }

    public CustomerResponseDtos addCustomer(CustomerDtos customerDtos){
        CustomerEntity customer = new CustomerEntity(
            customerDtos.getUserName(),
            customerDtos.getName(),
            customerDtos.getPassword(),
            customerDtos.getEmailId(),
            customerDtos.getContact(),
            customerDtos.getAddress()
        );

        CustomerEntity saved = custRepo.save(customer);

        return new CustomerResponseDtos(
            saved.getUserName(),
            saved.getName(),
            saved.getEmailId(),
            saved.getContact(),
            saved.getAddress()
        );
    }

    public CustomerResponseDtos updateCustomerDetails(Integer id,CustomerDtos customerDtos){
        Optional<CustomerEntity> optionalCustomer = custRepo.findById(id);

        if(optionalCustomer.isPresent()){
            CustomerEntity customer = optionalCustomer.get();
            
            customer.setUserName(customerDtos.getUserName());
            customer.setName(customerDtos.getName());
            customer.setPassword(customerDtos.getPassword());
            customer.setContact(customerDtos.getContact());
            customer.setEmailId(customerDtos.getEmailId());
            customer.setAddress(customerDtos.getAddress());

            CustomerEntity updatedCustomerEntity = custRepo.save(customer);

            return new CustomerResponseDtos(
                updatedCustomerEntity.getUserName(),
                updatedCustomerEntity.getName(),
                updatedCustomerEntity.getEmailId(),
                updatedCustomerEntity.getContact(),
                updatedCustomerEntity.getAddress()
            );
        }
        else{
            throw new RuntimeException("Customer with the Id"+id+"not found");
        }
    }

    public String deleteCustomerDetail(Integer id){
        Optional<CustomerEntity> optionalCustomer = custRepo.findById(id);

        if(optionalCustomer.isPresent()){
            CustomerEntity customer = optionalCustomer.get();
            String name = customer.getName();
            custRepo.deleteById(id);
            return "customer "+name+" account deleted sucessfully.";
        }
        else{
            throw new RuntimeException("Customer with the Id"+id+"not found");
        }
    }
}
