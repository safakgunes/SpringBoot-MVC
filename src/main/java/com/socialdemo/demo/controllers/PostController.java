package com.socialdemo.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.socialdemo.demo.entities.Post;
import com.socialdemo.demo.requests.PostCreateRequest;
import com.socialdemo.demo.requests.PostUpdateRequest;
import com.socialdemo.demo.services.PostService;

@RestController
@RequestMapping("/posts")

public class PostController {

	PostService postService ;


	public PostController(PostService postService) {
		super();
		this.postService = postService;
	}


	@GetMapping
	
	public List<Post> getAllPosts(@RequestParam Optional<Long> userId){
		return postService.getAllPosts(userId);
	}
	
	@PostMapping
	public Post createOnePost(@RequestBody PostCreateRequest newPostRequest) {
		return postService.creatOnePost(newPostRequest);
	}
	
	
	
	@GetMapping("/{postId}")
	
	public Post getOnePostbyId(@PathVariable Long postId) {
		return postService.getOnePostById(postId);
	}
	
	@PutMapping("/{postId}")
	public Post updateOnePost(@PathVariable Long postId, @RequestBody PostUpdateRequest updatePost) {
		return postService.updateOnePostById(postId, updatePost);
	}
	@DeleteMapping("/{postId}")
	public void deleteOnePost(@PathVariable Long postId) {
		 postService.deleteOnePostById(postId);
	}
	
}
