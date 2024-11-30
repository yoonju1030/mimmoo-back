package mimmoo.mimmoo_back.repository;

import mimmoo.mimmoo_back.domain.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository {

    List<Product> findAll();
    Product save(Product product);
    Product findById(String id);
}
