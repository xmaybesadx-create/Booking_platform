package com.booking.bookingservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @GetMapping("/booking/health")
    public String health() {
        return "booking controller ok";
    }
}
