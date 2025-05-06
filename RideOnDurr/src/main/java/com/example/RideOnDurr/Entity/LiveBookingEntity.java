package com.example.RideOnDurr.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class LiveBookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer LiveId;
    private Integer OTP;
    @OneToOne
    @JoinColumn(name="pendingBookingId",referencedColumnName = "pendingBookingId")
    private PendingBookingEntity PendingBooking;

    public LiveBookingEntity(Integer liveId, Integer OTP, PendingBookingEntity pendingBooking) {
        LiveId = liveId;
        this.OTP = OTP;
        PendingBooking = pendingBooking;
    }
}
