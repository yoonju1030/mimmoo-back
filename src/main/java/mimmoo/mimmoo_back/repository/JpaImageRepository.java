package mimmoo.mimmoo_back.repository;

import jakarta.persistence.EntityManager;
import mimmoo.mimmoo_back.domain.Image;
import org.springframework.stereotype.Repository;

@Repository
public class JpaImageRepository implements ImageRepository{
    private final EntityManager em;

    public JpaImageRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Image save(Image image) {
        em.persist(image);
        return image;
    }
}
