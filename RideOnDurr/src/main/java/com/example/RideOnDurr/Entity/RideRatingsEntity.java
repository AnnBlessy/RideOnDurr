package com.example.RideOnDurr.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class RideRatingsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ratingId;
    /* Need to addd booking ID */
    private Integer stars;
    @Column(nullable = true)
    private String title;
    @Column(nullable = true)
    private String details;
}
