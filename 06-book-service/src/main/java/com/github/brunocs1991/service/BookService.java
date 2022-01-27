package com.github.brunocs1991.service;

import com.github.brunocs1991.model.Book;
import com.github.brunocs1991.model.to.CambioTO;
import com.github.brunocs1991.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
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
        HashMap<String, String> params = new HashMap<>();
        params.put("amount", book.getPrice().toString());
        params.put("from", "USD");
        params.put("to", currency);
        var response = new RestTemplate().getForEntity("http://localhost:8000/cambio-service/{amount}/{from}/{to}", CambioTO.class, params);
        var cambio = response.getBody();
        var port = environment.getProperty("local.server.port");
        book.setEnviroment(port);
        book.setPrice(cambio.getConvertedValue());
        return book;
    }
}
