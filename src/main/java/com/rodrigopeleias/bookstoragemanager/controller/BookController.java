package com.rodrigopeleias.bookstoragemanager.controller;


import com.rodrigopeleias.bookstoragemanager.dto.MessageResponseDTO;
import com.rodrigopeleias.bookstoragemanager.entity.Book;
import com.rodrigopeleias.bookstoragemanager.repository.BookRepository;
import com.rodrigopeleias.bookstoragemanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {


    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
      return bookService.create(book);

    }

}
