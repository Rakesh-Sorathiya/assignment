package com.neustackapp.ecommerce.cart.service;

import com.neustackapp.ecommerce.cart.response.CartResponse;
import jakarta.inject.Singleton;

@Singleton
public class CartService {

    

    /**
     * To add product in cart
     *
     * @return
     */
    CartResponse addProduct() {
        return CartResponse.builder().build();
    }

    /**
     * To remove product from cart
     *
     * @return
     */
    CartResponse removeProduct() {
        return CartResponse.builder().build();
    }

    /**
     * Cart information
     *
     * @return
     */
    CartResponse cart() {
        return CartResponse.builder().build();
    }

}
