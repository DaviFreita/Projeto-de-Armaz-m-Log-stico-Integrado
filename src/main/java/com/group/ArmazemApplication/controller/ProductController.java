package com.group.ArmazemApplication.controller;


import com.group.ArmazemApplication.model.Product;
import com.group.ArmazemApplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping
    public List<Product> productList() {
        return productService.productList();
    }

    @GetMapping("/{search}")
    public List<Product> search(@RequestBody String Value) {
        return productService.search(Value);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id){
        productService.delete(id);
    }

    @PutMapping("/{id}")
    public void toUpdate(@PathVariable Long id, @RequestBody Product product){
        productService.toUpdate(id, product);
    }

    @PostMapping("/{id}")
    public String sell(@PathVariable Long id, @RequestParam int newQuantity){
        return productService.sell(id, newQuantity);

    }
}
