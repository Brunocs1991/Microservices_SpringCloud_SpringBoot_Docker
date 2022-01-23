package com.github.brunocs1991.calculator.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Person implements Serializable {
    private Long id;
    private String firtname;
    private String lastName;
    private String adress;
    private String gender;
}

