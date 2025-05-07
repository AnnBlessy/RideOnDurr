package com.example.RideOnDurr.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class AllBookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer BookingId;

    @OneToOne
    @JoinColumn(name="LiveId",referencedColumnName = "LiveId")
    private LiveBookingEntity LiveBooking;

    public AllBookingEntity(Integer bookingId, LiveBookingEntity liveBooking) {
        BookingId = bookingId;
        LiveBooking = liveBooking;
    }
}
