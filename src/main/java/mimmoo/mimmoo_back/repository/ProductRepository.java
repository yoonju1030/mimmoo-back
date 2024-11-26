package mimmoo.mimmoo_back.repository;

import mimmoo.mimmoo_back.domain.Product;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
}
