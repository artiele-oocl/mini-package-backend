package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.NotSupportedException;

@Service
public class BookingService {
    @Autowired
    private BookRepository bookRepository;

    public Book saveBooking(Book bookInfo) throws NotSupportedException {
        return bookRepository.save(bookInfo);
    }
    public Iterable<Book> getAllBookings(Integer page, Integer pageSize) {
        if (page != null && pageSize != null) {
            return bookRepository.findAll(PageRequest.of(page, pageSize));
        }
        return bookRepository.findAll();
    }
}
