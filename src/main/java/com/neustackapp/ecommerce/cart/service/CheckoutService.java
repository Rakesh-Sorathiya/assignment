package com.neustackapp.ecommerce.cart.service;

import com.neustackapp.ecommerce.cart.response.CheckoutResponse;

public class CheckoutService {

    public CheckoutResponse checkout() {
        return CheckoutResponse.builder().build();
    }

    public CheckoutResponse checkout(String discountCode) {
        return CheckoutResponse.builder().build();
    }
}
