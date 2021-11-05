package com.sowloo.blogApplication.data.repositories;

import com.sowloo.blogApplication.data.models.Comment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentRepositoryImplTest {

    private CommentRepository commentRepository;

    @BeforeEach
    void setUp() {
        commentRepository = new CommentRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
        Comment comment = new Comment();
        comment.setComment_id(342);
        comment.setComment_title("introduction");
        comment.setComment_description("what a nice post you have here");
        comment.setUser_id(234);
        Comment savedComment = commentRepository.save(comment);
        assertEquals(comment, savedComment);
    }

    @Test
    void findById() {
        Comment comment = new Comment();
        comment.setComment_id(342);
        comment.setComment_title("introduction");
        comment.setComment_description("what a nice post you have here");
        comment.setUser_id(234);
        Comment savedComment = commentRepository.save(comment);
        Comment foundComment = commentRepository.findById(342);
        assertEquals(savedComment, foundComment);
    }

    @Test
    void delete() {
        Comment comment = new Comment();
        comment.setComment_id(342);
        comment.setComment_title("introduction");
        comment.setComment_description("what a nice post you have here");
        comment.setUser_id(234);
        Comment savedComment = commentRepository.save(comment);
        commentRepository.delete(comment);
        assertNull(commentRepository.findById(342));
    }

    @Test
    void deleteById() {
        Comment comment = new Comment();
        comment.setComment_id(342);
        comment.setComment_title("introduction");
        comment.setComment_description("what a nice post you have here");
        comment.setUser_id(234);
        Comment savedComment = commentRepository.save(comment);
        commentRepository.deleteById(342);
        assertNull(commentRepository.findById(342));
    }

    @Test
    void findAll() {
        Comment comment = new Comment();
        comment.setComment_id(342);
        comment.setComment_title("introduction");
        comment.setComment_description("what a nice post you have here");
        comment.setUser_id(234);
        commentRepository.save(comment);
        commentRepository.save(comment);
        commentRepository.save(comment);
        assertEquals(3, commentRepository.findAll().size());
    }
}