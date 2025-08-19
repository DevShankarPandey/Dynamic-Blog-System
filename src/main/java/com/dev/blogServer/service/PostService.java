package com.dev.blogServer.service;

import com.dev.blogServer.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {

    Post savePost(Post post);

    List<Post> getAllPosts();

    Post getPostById(Long postId);

    void likePost(Long postId);

    List<Post> searchByName(String name);
}
