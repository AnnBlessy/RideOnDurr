package com.example.RideOnDurr.Repo;

import com.example.RideOnDurr.Entity.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepo extends JpaRepository<DriverEntity, Long> {

}
