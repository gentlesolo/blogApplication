package com.sowloo.blogApplication.data.repositories;

import com.sowloo.blogApplication.data.models.Comment;

import java.util.List;

public interface CommentRepository {
    Comment save(Comment comment);
    Comment findById(String id);
    void delete(Comment comment);
    void deleteById(String id);
    List<Comment> findAll();
}
