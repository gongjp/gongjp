package com.sto.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Hello implements Serializable {

    private String name;

    private BigDecimal price;
    
    private double weight;

    private String password;


}
