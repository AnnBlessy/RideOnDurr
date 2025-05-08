package com.example.RideOnDurr.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RideOnDurr.Entity.CustomerEntity;


public interface CustomerRepo extends JpaRepository<CustomerEntity, Integer> {
    Optional<CustomerEntity> findByUserNameAndPassword(String userName,String password);
}
