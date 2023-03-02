package ru.geekbrains.spring1.lesson4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.spring1.lesson4.data.Product;
import ru.geekbrains.spring1.lesson4.repository.ProductDao;
import ru.geekbrains.spring1.lesson4.repository.ProductDaoImpl;


import java.util.List;

@Service
public class ProductService {

    private ProductDao productDao;


    public ProductService(ProductDaoImpl productDaoImpl) {
        this.productDao = productDaoImpl;
    }

    public List<Product> findAll() {
        return productDao.findAll();
    }

    public Product findById(Long id) {
        return productDao.findById(id);
    }

    public void deleteProduct(Long id) {
        productDao.deleteProduct(id);
    }

    public void changePrice(Long productId, Integer delta) {
        Product p = productDao.findById(productId);
        p.setPrice(p.getPrice() + delta);
        productDao.save(p);
    }
}
