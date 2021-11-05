package com.sowloo.blogApplication.utils;

import com.sowloo.blogApplication.data.models.Blog;
import com.sowloo.blogApplication.data.models.Comment;
import com.sowloo.blogApplication.dtos.requests.AddCommentRequest;
import com.sowloo.blogApplication.dtos.responses.AddCommentResponse;

public class CommentMapper {
    public static Comment map(AddCommentRequest addCommentRequest) {
        Comment comment = new Comment();
        comment.setComment_id(addCommentRequest.getCommentId());
        comment.setUser_id(addCommentRequest.getUserId());
        comment.setComment_title(addCommentRequest.getCommentTitle());
        comment.setComment_description(addCommentRequest.getCommentContent());
        comment.setLocalDateTime(addCommentRequest.getLocalDateTime());
        return comment;
    }
    public static AddCommentResponse map(Comment savedComment){
        AddCommentResponse response = new AddCommentResponse();
        response.setCommentId(savedComment.getComment_id());
        response.setUserId(savedComment.getUser_id());
        response.setCommentContent(savedComment.getComment_description());
        response.setLocalDateTime(savedComment.getLocalDateTime());
        return response;
    }
}
