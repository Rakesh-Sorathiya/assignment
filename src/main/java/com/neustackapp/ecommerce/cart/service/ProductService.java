package com.neustackapp.ecommerce.cart.service;

import com.neustackapp.ecommerce.cart.domain.Product;
import com.neustackapp.ecommerce.cart.store.ProductStore;
import jakarta.inject.Singleton;

import java.util.List;

/**
 * Product service responsible to serve products to clients
 */
@Singleton
public class ProductService {

    /**
     * List of products
     */
    public List<Product> listProducts() {
       return ProductStore.products();
    }
}
