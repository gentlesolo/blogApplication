package com.sowloo.blogApplication.data.repositories;

import com.sowloo.blogApplication.data.models.Blog;

import java.util.List;

public interface BlogRepository {
    Blog save(Blog blog);
    Blog findByBlogId(Integer id);
    void delete(Blog blog);
    void deleteByBlogId(String id);
    List<Blog> findAll();
}
