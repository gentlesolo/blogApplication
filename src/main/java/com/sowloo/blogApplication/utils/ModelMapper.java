package com.sowloo.blogApplication.utils;

import com.sowloo.blogApplication.data.models.Blog;
import com.sowloo.blogApplication.dtos.requests.AddBlogRequest;
import com.sowloo.blogApplication.dtos.responses.AddBlogResponse;

public class ModelMapper {
    public static Blog map(AddBlogRequest addBlogRequest) {
        Blog blog = new Blog();
        blog.setBlogId(addBlogRequest.getBlogId());
        blog.setUserId(addBlogRequest.getUserId());
        blog.setBlogTitle(addBlogRequest.getBlogTitle());
        blog.setBlogContent(addBlogRequest.getBlogContent());
        blog.setBlogDescription(addBlogRequest.getBlogDescription());
        blog.setLocalDateTime(addBlogRequest.getLocalDateTime());
        return blog;
    }
    public static AddBlogResponse map(Blog savedBlog){
        AddBlogResponse response = new AddBlogResponse();
        response.setBlogId(savedBlog.getBlogId());
        response.setUserId(savedBlog.getUserId());
        response.setBlogTitle(savedBlog.getBlogTitle());
        response.setBlogContent(savedBlog.getBlogContent());
        response.setBlogDescription(savedBlog.getBlogDescription());
        response.setLocalDateTime(savedBlog.getLocalDateTime());
        return response;
    }
}
