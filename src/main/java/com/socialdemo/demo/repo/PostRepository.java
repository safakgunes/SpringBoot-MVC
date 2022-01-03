package com.socialdemo.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialdemo.demo.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

	List<Post> findByUserId(Long userId);

}
