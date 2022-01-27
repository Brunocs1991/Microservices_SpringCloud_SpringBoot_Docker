package com.github.brunocs1991.model.to;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CambioTO implements Serializable {

    private static final long SerialVersionUID = 1l;

    private long id;
    private String from;
    private String to;
    private Double conversionFactor;
    private Double convertedValue;
    private String enviroment;
}
