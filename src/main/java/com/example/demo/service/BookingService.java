package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.NotSupportedException;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    private BookRepository bookRepository;


    public Book saveParkingLot(Book bookInfo) throws NotSupportedException {
        Optional<ParkingLot> parkingLotDB = Optional.ofNullable(parkingLotRepository.findOneByName(parkingLot.getName()));
        if(parkingLot.getCapacity() < 1) throw new NotSupportedException(INVALID_CAPACITY);
        if(parkingLotDB.isPresent()) throw new NotSupportedException(PARKING_NAME_ALREADY_EXISTS);
        return parkingLotRepository.save(parkingLot);
    }
}
