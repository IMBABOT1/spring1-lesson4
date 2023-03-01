package ru.geekbrains.spring1.lesson4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.spring1.lesson4.data.Product;
import ru.geekbrains.spring1.lesson4.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteProduct(id);
    }

    public void changePrice(Long productId, Integer delta) {
        Product p = productRepository.findById(productId);
        p.setPrice(p.getPrice() + delta);
    }
}
