package com.neustackapp.ecommerce.cart.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Cart {
    private List<Product> products;
}
