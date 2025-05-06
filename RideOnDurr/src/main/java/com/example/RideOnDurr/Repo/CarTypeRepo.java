package com.example.RideOnDurr.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RideOnDurr.Entity.CarTypeEntity;

@Repository
public interface CarTypeRepo extends JpaRepository<CarTypeEntity, Integer> {

}
