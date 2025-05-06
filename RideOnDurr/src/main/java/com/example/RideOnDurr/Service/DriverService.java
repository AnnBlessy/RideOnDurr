package com.example.RideOnDurr.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RideOnDurr.Entity.DriverEntity;
import com.example.RideOnDurr.Repo.DriverRepo;

@Service
public class DriverService {
    @Autowired
    private DriverRepo driverRepo;

    public void addDriverDetails(DriverEntity driver){
        driverRepo.save(driver);
    }

    public Optional<DriverEntity> getDriverById(Long driverId){
        return driverRepo.findById(driverId);
    }
}
