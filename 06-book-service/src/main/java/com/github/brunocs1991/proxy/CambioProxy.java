package com.github.brunocs1991.proxy;

import com.github.brunocs1991.model.to.CambioTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

@FeignClient(name = "cambi-service", url = "localhost:8000")
public interface CambioProxy {

    @GetMapping(value = "/cambio-service/{amount}/{from}/{to}")
    public CambioTO getCambio(@PathVariable("amount") Double amount,
                              @PathVariable("from") String from,
                              @PathVariable("to") String to);
}
