package com.github.brunocs1991.model;


import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Cambio implements Serializable {

    private static final Long serialVersionUID = 1L;

    private long id;
    private String from;
    private String to;
    private BigDecimal conversionFactor;
    private BigDecimal convertedValue;
    private String enviroment;
}
