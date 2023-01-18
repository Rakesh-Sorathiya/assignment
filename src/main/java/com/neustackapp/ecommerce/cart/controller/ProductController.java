package com.neustackapp.ecommerce.cart.controller;

import com.neustackapp.ecommerce.cart.service.ProductService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

/**
 * Product controller
 */
@Controller("/api/")
public class ProductController {

    @Inject
    private ProductService productService;

    /**
     * @return Return {@link HttpResponse } response with products {@link com.neustackapp.ecommerce.cart.domain.Product}
     */
    @Get("products")
    HttpResponse listProducts() {
        return HttpResponse.ok(productService.listProducts());
    }
}
