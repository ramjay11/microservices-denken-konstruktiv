package com.ramjava.post.dienst.controller;

import com.ramjava.post.dienst.model.Posts;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {

    @GetMapping(value = "/{ppstId}")
    public Posts getPosts(@PathVariable("postId") String postId) {
        var postOne = new Posts(postId, "Post description for " + postId);
        return postOne;
    }

}
