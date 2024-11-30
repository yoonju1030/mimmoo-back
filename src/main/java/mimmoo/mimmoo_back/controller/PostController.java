package mimmoo.mimmoo_back.controller;

import mimmoo.mimmoo_back.domain.Post;
import mimmoo.mimmoo_back.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/post")
    @ResponseBody
    public Post save(@RequestBody() Post bodyPost) {
        bodyPost.setDate();
        Post savedPost = postService.save(bodyPost);
        return savedPost;
    }
}