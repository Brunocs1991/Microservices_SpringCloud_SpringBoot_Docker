package com.github.brunocs1991.controller;

import com.github.brunocs1991.model.Book;
import com.github.brunocs1991.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Book Endpoint")
@RestController
@RequestMapping("book-service")
public class BookController {

    @Autowired
    private BookService bookService;

    @Operation(summary = "find specific book by you id")
    @GetMapping(value = "{id}/{currency}")
    public Book geetBook(@PathVariable("id") Long id, @PathVariable("currency")String currency){
        return bookService.findBookById(id, currency);
    }

}
