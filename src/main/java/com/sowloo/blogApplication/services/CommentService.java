package com.sowloo.blogApplication.services;

import com.sowloo.blogApplication.data.models.Blog;
import com.sowloo.blogApplication.data.models.Comment;
import com.sowloo.blogApplication.dtos.requests.AddCommentRequest;
import com.sowloo.blogApplication.dtos.responses.AddCommentResponse;

public interface CommentService {
    AddCommentResponse addComment(AddCommentRequest addCommentRequest);
    Comment findMyCommentWithMy(Integer id);
}
