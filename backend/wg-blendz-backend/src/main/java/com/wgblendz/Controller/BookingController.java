package com.wgblendz.Controller;

import com.wgblendz.model.Booking;
import com.wgblendz.Service.BookingService;
import com.wgblendz.Exception.DuplicateBookingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "http://localhost:3000")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public ResponseEntity<?> createBooking(@RequestBody Map<String, String> bookingDetails) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
            LocalDateTime dateTime = LocalDateTime.parse(bookingDetails.get("dateTime"), formatter);
            String email = bookingDetails.get("email");
            String staffName = bookingDetails.get("staffName");

            Booking booking = bookingService.createBooking(dateTime, email, staffName);
            return ResponseEntity.ok(booking);
        } catch (DuplicateBookingException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }
}