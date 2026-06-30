package com.example.catalog.controller;

import com.example.catalog.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/")
    public String home(Model model) {

        List<Product> products = List.of(
                new Product(1,
                        "Laptop",
                        "https://picsum.photos/300?1",
                        59999),

                new Product(2,
                        "Mobile Phone",
                        "https://picsum.photos/300?2",
                        29999),

                new Product(3,
                        "Headphones",
                        "https://picsum.photos/300?3",
                        4999),

                new Product(4,
                        "Smart Watch",
                        "https://picsum.photos/300?4",
                        7999)
        );

        model.addAttribute("products", products);

        return "index";
    }
}