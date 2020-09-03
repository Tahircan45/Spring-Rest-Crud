package com.tahircan.crud.example.controller;

import com.tahircan.crud.example.entity.Product;
import com.tahircan.crud.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product)
    {
        return productService.saveProduct(product);
    }
    @PostMapping("/addproducts")
    public List<Product> addProduct(@RequestBody List<Product> products)
    {
        return productService.saveProducts(products);
    }
    @GetMapping("/products")
    public List<Product> findAlProducts(){
        return productService.getProducts();
    }
    @GetMapping("/productByI d/{id}")
    public Product findProductByID(@PathVariable int id)
    {
        return productService.getProductById(id);
    }
    @GetMapping("/productByName/{name}")
    public Product findProductByName(@PathVariable String name)
    {
        return productService.getProductByName(name);
    }
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product)
    {
        return productService.saveProduct(product);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id)
    {
        return productService.Delete(id);
    }

}
