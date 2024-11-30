package mimmoo.mimmoo_back.repository;

import jakarta.persistence.EntityManager;
import mimmoo.mimmoo_back.domain.Post;
import org.springframework.stereotype.Repository;

@Repository
public class JpaPostRepository implements PostRepository {
    private final EntityManager em;

    public JpaPostRepository(EntityManager em) { this.em = em; }

    @Override
    public Post save(Post post) {
        em.persist(post);
        return post;
    }
}
