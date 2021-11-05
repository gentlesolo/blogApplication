package com.sowloo.blogApplication.controllers;

import com.sowloo.blogApplication.data.models.Comment;
import com.sowloo.blogApplication.dtos.requests.AddCommentRequest;
import com.sowloo.blogApplication.dtos.responses.AddCommentResponse;
import com.sowloo.blogApplication.services.CommentService;
import com.sowloo.blogApplication.services.CommentServiceImpl;
import org.springframework.web.bind.annotation.*;


@RestController
public class CommentController {
    private final CommentService commentService = new CommentServiceImpl();

    @PostMapping("/api/addcomment")
    public AddCommentResponse addComment(@RequestBody AddCommentRequest addCommentRequest) {
        return commentService.addComment(addCommentRequest);
    }
    @GetMapping("/api/comment/{id}")
    public Comment findCommentById(@PathVariable("id") Integer id) {
        return commentService.findMyCommentWithMy(id);
    }
}
