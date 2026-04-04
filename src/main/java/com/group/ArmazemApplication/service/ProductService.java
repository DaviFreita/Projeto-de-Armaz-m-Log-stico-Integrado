package com.group.ArmazemApplication.service;

import com.group.ArmazemApplication.model.Product;
import com.group.ArmazemApplication.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product save(Product product) {
        return repository.save(product);
    }

    public List<Product> productList() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Product> search(String Value) {
        return repository.findByNameProductContainingIgnoreCaseOrCategoryContainingIgnoreCase(Value, Value);
    }

    public Product searchById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));

    }

    public Product toUpdate(Long id, Product newProduct) {
        Product product = searchById(id);

        product.setNameProduct(newProduct.getNameProduct());
        product.setCategory(newProduct.getCategory());
        product.setDescription(newProduct.getDescription());
        product.setCostPrice(newProduct.getCostPrice());
        product.setSalePrice(newProduct.getSalePrice());
        product.setUrlImage(newProduct.getUrlImage());
        product.setIncreaseQuantity(newProduct.getQuantity());

        return repository.save(product);
    }

    public String sell(Long id, int newQuantity){
        Product product = searchById(id);

        if(newQuantity < product.getQuantity()) {
            return "Quantidade Insuficiente";
        }

        product.setQuantity(product.getQuantity() - newQuantity);
        return "Venda Realizada com sucesso";
    }
}
