package com.neustackapp.ecommerce.cart.store;

import com.neustackapp.ecommerce.cart.domain.Cart;
import com.neustackapp.ecommerce.cart.domain.Product;
import io.micronaut.core.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Product store to store product data in key-value
 */
public class ProductStore {

    private final static List<Product> productList = new ArrayList<>();

    private final static Cart cart = Cart.builder().build();

    static {
        productList.add(Product.builder()
                .id(UUID.randomUUID())
                .name("")
                .cost(100.00).build());

        productList.add(Product.builder()
                .id(UUID.randomUUID())
                .name("")
                .cost(1000.00).build());

        productList.add(Product.builder()
                .id(UUID.randomUUID())
                .name("")
                .cost(200.00).build());

        productList.add(Product.builder()
                .id(UUID.randomUUID())
                .name("")
                .cost(500.00).build());

        productList.add(Product.builder()
                .id(UUID.randomUUID())
                .name("")
                .cost(600.00).build());

        productList.add(Product.builder()
                .id(UUID.randomUUID())
                .name("")
                .cost(700.00).build());

    }

    public static List<Product> products() {
        return productList;
    }

    public static Product product(UUID productId) {
        Optional<Product> optionalProduct = productList.stream().findFirst();
        if (optionalProduct.isPresent()) {
            return optionalProduct.get();
        } else {
            throw new RuntimeException("Product Not Found");
        }
    }

    public static Cart getCart() {
        return cart;
    }

    public static void addToCart(Product product) {
        if (cart.getProducts() != null) {
            cart.getProducts().add(product);
        } else {
            cart.setProducts(List.of(product));
        }
    }

    public static void removeFromCart(Product product) {
        List<Product> products = cart.getProducts();
        if (CollectionUtils.isNotEmpty(products)) {
            Optional<Product> removeProduct = products.stream().filter(pro -> {
                return pro.getId().equals(product.getId());
            }).findFirst();
            products.remove(product);
        }
    }
}
