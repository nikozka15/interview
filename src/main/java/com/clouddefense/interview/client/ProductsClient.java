package com.clouddefense.interview.client;

import org.springframework.stereotype.Component;
import com.clouddefense.interview.client.model.Product;
import com.clouddefense.interview.client.model.ProductPrice;

import java.util.Set;

@Component
public class ProductsClient {

    Set<Product> mockProducts = Set.of(
            new Product(1, "BASIC", "Apple", "http://example.com/apple"),
            new Product(2, "Vegetable", "Carrot", "http://example.com/carrot")
    );

    Set<ProductPrice> mockPrices = Set.of(
            new ProductPrice(1, 0.99, "kg", 1),
            new ProductPrice(2, 1.50, "kg", 1)
    );

    public Set<Product> getProducts() {
        return mockProducts;
    }

    public Set<ProductPrice> getProductsPrices() {
        return mockPrices;
    }
}
