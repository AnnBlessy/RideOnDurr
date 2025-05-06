package com.example.RideOnDurr.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CarTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CarTypeId;
    private String CarType;
    private Double farePerKM;
    private Integer maxCapacity;

    public CarTypeEntity(Integer carTypeId, String carType, Double farePerKM, Integer maxCapacity) {
        CarTypeId = carTypeId;
        CarType = carType;
        this.farePerKM = farePerKM;
        this.maxCapacity = maxCapacity;
    }

    public CarTypeEntity() {
    }

}
