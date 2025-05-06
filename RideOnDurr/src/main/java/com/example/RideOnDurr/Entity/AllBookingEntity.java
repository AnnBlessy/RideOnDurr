package com.example.RideOnDurr.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class AllBookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int BookingId;

    @OneToOne
    @JoinColumn(name="LiveId",referencedColumnName = "LiveId")
    private LiveBookingEntity LiveBooking;

    public AllBookingEntity(int bookingId, LiveBookingEntity liveBooking) {
        BookingId = bookingId;
        LiveBooking = liveBooking;
    }
}
