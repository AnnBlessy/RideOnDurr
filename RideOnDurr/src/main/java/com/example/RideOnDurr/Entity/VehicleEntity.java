package com.example.RideOnDurr.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class VehicleEntity {
    @Id
    @Column(unique = true)
    private String vehicleNo;

    private String insurance;

    private String RC;

    private String licenceNo;

    private boolean avlStatus=true;

    @OneToOne
    @JoinColumn(name="CarTypeId")
    private CarTypeEntity carTypeId;

}
