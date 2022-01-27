package com.github.brunocs1991.controller;

import com.github.brunocs1991.model.Book;
import com.github.brunocs1991.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book-service")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "{id}/{currency}")
    public Book geetBook(@PathVariable("id") Long id, @PathVariable("currency")String currency){
        return bookService.findBookById(id, currency);
    }

}
