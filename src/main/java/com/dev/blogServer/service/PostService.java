package com.dev.blogServer.service;

import com.dev.blogServer.entity.Post;
import org.springframework.stereotype.Service;


public interface PostService {

    Post savePost(Post post);
}
