package com.example.RideOnDurr.Repo;

import com.example.RideOnDurr.Entity.AllBookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllBookingRepo extends JpaRepository<AllBookingEntity,Integer>
{
}
