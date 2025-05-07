package com.example.RideOnDurr.Repo;

import com.example.RideOnDurr.Entity.DriverEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepo extends JpaRepository<DriverEntity, Long> {
    @Transactional
    @Modifying
    @Query("UPDATE DriverEntity d SET d.driverName=:name, d.userName=:user, d.phoneNo=:phone, d.email=:newEmail, d.password=:pass")
    void updateDriverDetails(
            @Param("name") String name,
            @Param("user") String user,
            @Param("phone") Long phone,
            @Param("newEmail") String newEmail,
            @Param("pass") String pass
    );
}
