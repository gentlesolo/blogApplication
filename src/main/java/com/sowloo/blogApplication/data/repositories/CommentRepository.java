package com.sowloo.blogApplication.data.repositories;

import com.sowloo.blogApplication.data.models.Comment;

import java.util.List;

public interface CommentRepository {
    Comment save(Comment comment);
    Comment findById(Integer id);
    void delete(Comment comment);
    void deleteById(Integer id);
    List<Comment> findAll();
}
