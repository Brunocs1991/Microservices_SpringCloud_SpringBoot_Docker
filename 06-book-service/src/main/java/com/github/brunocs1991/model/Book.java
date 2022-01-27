package com.github.brunocs1991.model;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Book implements Serializable {

    private static final long serrialVersionUID = 1L;
    private Long id;
    private String author;
    private String title;
    private Date launchDate;
    private Double price;
    private String currency;
    private String enviroment;
}
