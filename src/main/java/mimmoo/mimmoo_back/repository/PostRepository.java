package mimmoo.mimmoo_back.repository;

import mimmoo.mimmoo_back.domain.Post;

public interface PostRepository {
    Post save(Post post);
}
