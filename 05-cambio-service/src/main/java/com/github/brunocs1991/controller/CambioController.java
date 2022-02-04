package com.github.brunocs1991.controller;

import com.github.brunocs1991.model.Cambio;
import com.github.brunocs1991.repository.CambioRepository;
import com.github.brunocs1991.service.CambioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

@Tag(name = "Cambio Service API")
@RestController
@RequestMapping("cambio-service")
public class CambioController {

    @Autowired
    private CambioService cambioService;

    private Logger logger = LoggerFactory.getLogger(CambioController.class);

    @Operation(description = "Get cambio from currency!")
    @GetMapping(value = "/{amount}/{from}/{to}")
    public Cambio getCambio(@PathVariable("amount")BigDecimal amount,
                            @PathVariable("from") String from,
                            @PathVariable("to") String to){

        logger.info("getCambio is called with -> {}, {} and {} ", amount, from, to);
        return  cambioService.retornaCambio(amount, from, to);
    }
}
