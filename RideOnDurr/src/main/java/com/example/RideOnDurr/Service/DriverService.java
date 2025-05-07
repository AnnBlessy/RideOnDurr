package com.example.RideOnDurr.Service;

import com.example.RideOnDurr.Entity.DriverEntity;
import com.example.RideOnDurr.Repo.DriverRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Driver;
import java.util.List;
import java.util.Optional;

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

    public void updateDriverDetails(DriverEntity driver){
        String name = driver.getDriverName();
        String user = driver.getUserName();
        Long phone = driver.getPhoneNo();
        String email = driver.getEmail();
        String pass = driver.getPassword();
        
    }
}
