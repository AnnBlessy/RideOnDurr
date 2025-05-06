package com.example.RideOnDurr.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Drivers")
public class DriverEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driverId;

    @Column(unique = true)
    private String userName;

    private String driverName;

    private String password;

    @Column(unique = true)
    private Long phoneNo;
    @Column(unique = true)
    private String email;

    public DriverEntity() {
    }

    public DriverEntity(String userName, String driverName, String password, Long phoneNo, String email) {
        this.userName = userName;
        this.driverName = driverName;
        this.password = password;
        this.phoneNo = phoneNo;
        this.email = email;
    }
}

