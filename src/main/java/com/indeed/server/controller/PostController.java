package com.indeed.server.controller;

import com.indeed.server.constants.APIConstants;
import com.indeed.server.dto.PostDTO;
import com.indeed.server.model.PostModel;
import com.indeed.server.service.PostService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Slf4j
public class PostController {
    @Autowired
    PostService postService;
    @GetMapping(APIConstants.GET_ALL_POSTS)
    public List<PostModel> getAllPosts() {
        return this.postService.getAllPosts();
    }
    @PostMapping(APIConstants.SAVE_POST)
    public PostModel savePost(@Valid @RequestBody PostDTO postDTORequest) {
        return this.postService.savePost(postDTORequest);
    }
}