package com.neustackapp.ecommerce.cart.domain;

import lombok.Getter;
import lombok.Setter;

@lombok.Builder
@Getter
@Setter
public class Product {

    private java.util.UUID id;
    private String name;
    // Currently, cost is considered as INR
    private double cost;
}
