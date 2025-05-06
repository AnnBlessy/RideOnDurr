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
}
