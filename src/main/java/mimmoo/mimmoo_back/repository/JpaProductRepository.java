package mimmoo.mimmoo_back.repository;

import jakarta.persistence.EntityManager;
import mimmoo.mimmoo_back.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaProductRepository implements ProductRepository {

    private final EntityManager em;

    public JpaProductRepository(EntityManager em) {
        this.em = em;
    }
    @Override
    public List<Product> findAll() {
        return em.createQuery("select m from Member m", Product.class).getResultList();
    }
}
