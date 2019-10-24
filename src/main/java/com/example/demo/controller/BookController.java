package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.transaction.NotSupportedException;

@RestController
@RequestMapping("/api/bookings")
public class BookController {
    @Autowired
    private BookingService bookingService;

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Book saveParkingLot(@RequestBody Book bookingInfo) throws NotSupportedException {
        return bookingService.saveParkingLot(bookingInfo);
    }
}
