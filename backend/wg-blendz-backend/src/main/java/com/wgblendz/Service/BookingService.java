package com.wgblendz.Service;

import com.wgblendz.model.Booking;
import com.wgblendz.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wgblendz.Exception.DuplicateBookingException;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking createBooking(LocalDateTime dateTime, String email, String staffName) {
        Optional<Booking> existingBooking = bookingRepository.findByDateTimeAndStaffName(dateTime, staffName);
        if (existingBooking.isPresent()) {
            throw new DuplicateBookingException("The selected time slot is already booked.");
        }

        Booking booking = new Booking();
        booking.setDateTime(dateTime);
        booking.setEmail(email);
        booking.setStaffName(staffName);

        return bookingRepository.save(booking);
    }
}