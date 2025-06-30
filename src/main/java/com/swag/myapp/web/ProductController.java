package com.swag.myapp.web;

import com.swag.myapp.repositories.ProductRepository;

public class ProductController {
    private ProductRepository repo = new ProductRepository(); // ❌ Accessing repository directly
}
