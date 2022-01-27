package com.github.brunocs1991.service;

import com.github.brunocs1991.model.Book;
import com.github.brunocs1991.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BookService {

    @Autowired
    private Environment environment;

    @Autowired
    private BookRepository bookRepository;

    public Book findBookById(Long id, String currency){

        var book = bookRepository.getById(id);
        if(Objects.isNull(book)){
            throw new RuntimeException("Book not Found");
        }
        var port = environment.getProperty("local.server.port");
        book.setEnviroment(port);
        return book;
    }
}
