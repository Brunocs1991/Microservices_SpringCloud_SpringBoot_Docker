package com.github.brunocs1991.service;

import com.github.brunocs1991.model.Cambio;
import com.github.brunocs1991.repository.CambioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

@Service
public class CambioService {

    @Autowired
    private Environment environment;

    @Autowired
    private CambioRepository cambioRepository;

    public Cambio retornaCambio(BigDecimal amount, String from, String to){
        var cambio = cambioRepository.findByFromAndTo(from, to);
        if(Objects.isNull(cambio)){
            throw new RuntimeException("Currency Unsuported");
        }
        var port = environment.getProperty("local.server.port");
        BigDecimal conversionFactor = cambio.getConversionFactor();
        BigDecimal convertedValue = conversionFactor.multiply(amount);
        cambio.setConvertedValue(convertedValue.setScale(2, RoundingMode.CEILING));
        cambio.setEnviroment(port);

        return  cambio;
    }
}
