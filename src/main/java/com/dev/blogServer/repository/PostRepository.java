package com.dev.blogServer.repository;

import java.util.*;
import com.dev.blogServer.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByNameContaining(String name);

}
