package ru.geekbrains.spring1.lesson4.repository;

import org.springframework.stereotype.Repository;
import ru.geekbrains.spring1.lesson4.data.Product;

import java.util.List;

@Repository
public interface ProductDao {

    List<Product> findAll();

    Product findById(Long id);

    void deleteProduct(Long id);

    void save(Product product);
}
