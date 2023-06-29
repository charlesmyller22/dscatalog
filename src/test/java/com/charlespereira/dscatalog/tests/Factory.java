package com.charlespereira.dscatalog.tests;

import com.charlespereira.dscatalog.dto.ProductDTO;
import com.charlespereira.dscatalog.entities.Category;
import com.charlespereira.dscatalog.entities.Product;

import java.time.Instant;

public class Factory {

    public static Product createProduct() {
        Product product = new Product(1L, "Phone", "Good phone", 800.0, "https://www.google.com", Instant.parse("2020-11-23T03:00:00Z"));
        product.getCategories().add(new Category(2L, "Electronics"));
        return product;
    }

    public static ProductDTO createProductDTO() {
        Product product = createProduct();
        return new ProductDTO(product, product.getCategories());
    }
}
