package com.wgblendz.Repository;

import com.wgblendz.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Optional<Booking> findByDateTimeAndStaffName(LocalDateTime dateTime, String staffName);
}