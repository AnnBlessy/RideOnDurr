package com.example.RideOnDurr.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class LiveBookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int LiveId;
    private int OTP;
    @OneToOne
    @JoinColumn(name="pendingId",referencedColumnName = "pendingId")
    private PendingBookingEntity PendingBooking;

    public LiveBookingEntity(int liveId, int OTP, PendingBookingEntity pendingBooking) {
        LiveId = liveId;
        this.OTP = OTP;
        PendingBooking = pendingBooking;
    }
}
