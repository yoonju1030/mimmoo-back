package mimmoo.mimmoo_back.repository;

import mimmoo.mimmoo_back.domain.Post;

import java.util.List;

public interface PostRepository {
    Post save(Post post);
    List<Post> getPostsByType(String type);
}
