package com.github.brunocs1991.service;

import com.github.brunocs1991.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BookService {

    @Autowired
    private Environment environment;

    public Book findBookById(Long id, String currency){

        var port = environment.getProperty("local.server.port");
        return new Book(1L, "Bruno C", "Docker", new Date(), Double.valueOf(13.7), currency, port);
    }
}
