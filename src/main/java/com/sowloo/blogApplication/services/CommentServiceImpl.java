package com.sowloo.blogApplication.services;

import com.sowloo.blogApplication.data.models.Comment;
import com.sowloo.blogApplication.data.repositories.CommentRepository;
import com.sowloo.blogApplication.data.repositories.CommentRepositoryImpl;
import com.sowloo.blogApplication.dtos.requests.AddCommentRequest;
import com.sowloo.blogApplication.dtos.responses.AddCommentResponse;
import com.sowloo.blogApplication.utils.CommentMapper;

public class CommentServiceImpl implements CommentService {
    private CommentRepository commentRepository = new CommentRepositoryImpl();
    @Override
    public AddCommentResponse addComment(AddCommentRequest addCommentRequest) {
        Comment comment = CommentMapper.map(addCommentRequest);

        Comment savedComment = commentRepository.save(comment);
        return CommentMapper.map(savedComment);
    }

    @Override
    public Comment findMyCommentWithMy(Integer id) {
        return commentRepository.findById(id);
    }
}
