package com.sowloo.blogApplication.services;

import com.sowloo.blogApplication.data.models.Blog;
import com.sowloo.blogApplication.dtos.requests.AddBlogRequest;
import com.sowloo.blogApplication.dtos.responses.AddBlogResponse;

public interface BlogService {
    AddBlogResponse addBlog(AddBlogRequest addBlogRequest);
    Blog findMyBlogWithMy(Integer id);
}
