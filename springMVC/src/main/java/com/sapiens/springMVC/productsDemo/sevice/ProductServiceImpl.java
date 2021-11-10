package com.sapiens.springMVC.productsDemo.sevice;

import com.sapiens.springMVC.productsDemo.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class ProductServiceImpl implements ProductService{
    @Override
    public List<Product> finsAll() {
        ArrayList<Product> products = new ArrayList<Product>();

        products.add(new Product(101, "Mobile", "CLKJDFE", 9000.00, 7));
        products.add(new Product(102, "TV", "CLKJDFE", 49000.00, 67));
        products.add(new Product(104, "AC", "REWWT67", 23000.00, 7));
        products.add(new Product(106, "IPad", "WERTUJ", 3000.00, 76));
        products.add(new Product(107, "SWatch", "UYRR234", 8000.00, 79));

        return products;
    }
}

