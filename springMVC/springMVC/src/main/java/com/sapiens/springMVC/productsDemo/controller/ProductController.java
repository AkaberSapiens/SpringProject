package com.sapiens.springMVC.productsDemo.controller;

import com.sapiens.springMVC.productsDemo.model.Product;
import com.sapiens.springMVC.productsDemo.sevice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value="/product")
    public List<Product> getProduct(){
        List<Product> products = productService.finsAll();
        return products;
    }

    @GetMapping(value="/companyDetails")
    public List<Product> getProducts(){
        List<Product> products = productService.finsAll();
        return products;
    }
}
