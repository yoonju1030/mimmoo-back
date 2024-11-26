package mimmoo.mimmoo_back.repository;

import jakarta.persistence.EntityManager;
import mimmoo.mimmoo_back.domain.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaProductRepository implements ProductRepository {

    private final EntityManager em;

    public JpaProductRepository(EntityManager em) {
        this.em = em;
    }
    @Override
    public Product save(Product product) {
        em.persist(product);
        return product;
    }

    @Override
    public List<Product> findAll(){
        return em.createQuery("select p from Product p", Product.class).getResultList();
    }
}
