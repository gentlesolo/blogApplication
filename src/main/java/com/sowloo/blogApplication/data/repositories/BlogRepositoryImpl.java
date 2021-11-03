package com.sowloo.blogApplication.data.repositories;

import com.sowloo.blogApplication.data.models.Blog;

import java.util.ArrayList;
import java.util.List;

public class BlogRepositoryImpl implements BlogRepository {
    List<Blog> blogs = new ArrayList<>();

    @Override
    public Blog save(Blog blog) {
        blogs.add(blog);
        return findByBlogId(blog.getBlogId());
    }

    @Override
    public Blog findByBlogId(String id) {
        for(Blog blog : blogs){
            if(blog.getBlogId().equals(id)){
                return blog;
            }
        }
        return null;
    }

    @Override
    public void delete(Blog blog) {
        blogs.remove(blog);
    }

    @Override
    public void deleteByBlogId(String id) {
        Blog blog = findByBlogId(id);
        blogs.remove(blog);
    }

    @Override
    public List<Blog> findAll() {
        return blogs;
    }
}
