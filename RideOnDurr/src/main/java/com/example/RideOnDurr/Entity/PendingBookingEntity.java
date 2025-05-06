package com.example.RideOnDurr.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class PendingBookingEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer pendingBookingId;

    @OneToOne
    @JoinColumn(name = "custId")
    private CustomerEntity customer;

    @OneToOne
    @JoinColumn(name = "CarTypeId")
    private CarTypeEntity carType;

    @OneToOne
    @JoinColumn(name = "LiveId")
    private LiveBookingEntity LiveBooking;

    private String source;
    private String destination;

    public PendingBookingEntity(){
    }

}
