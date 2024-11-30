package mimmoo.mimmoo_back.service;

import jakarta.transaction.Transactional;
import mimmoo.mimmoo_back.domain.Post;
import mimmoo.mimmoo_back.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class PostService {
    @Autowired
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post save(Post post) {
        Post savedPost = postRepository.save(post);
        return savedPost;
    }

    public List<Post> getPostByType(String type) {
        List<Post> posts = postRepository.getPostsByType(type);
        return posts;
    }
}
