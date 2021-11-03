package com.sowloo.blogApplication.data.repositories;

import com.sowloo.blogApplication.data.models.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository{
    List<Comment> comments = new ArrayList<>();

    @Override
    public Comment save(Comment comment) {
        comments.add(comment);
        return findById(comment.getComment_id());
    }

    @Override
    public Comment findById(String id) {
        for (Comment comment : comments){
            if(comment.getComment_id().equalsIgnoreCase(id)){
                return comment;
            }
        }
        return null;
    }

    @Override
    public void delete(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public void deleteById(String id) {
        Comment comment = findById(id);
        comments.remove(comment);
    }

    @Override
    public List<Comment> findAll() {
        return comments;
    }
}
