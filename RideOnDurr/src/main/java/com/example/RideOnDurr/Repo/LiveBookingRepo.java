package com.example.RideOnDurr.Repo;

import com.example.RideOnDurr.Entity.LiveBookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiveBookingRepo extends JpaRepository<LiveBookingEntity,Integer> {
}
