package com.example.RideOnDurr.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RideOnDurr.Entity.CustomerEntity;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Integer> {
}
