package com.neustackapp.ecommerce.cart.response;

import com.neustackapp.ecommerce.cart.domain.Cart;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CartResponse {
    Cart cart;
    double totalCost;
}
