package com.sowloo.blogApplication.controllers;

import com.sowloo.blogApplication.data.models.Blog;
import com.sowloo.blogApplication.dtos.requests.AddBlogRequest;
import com.sowloo.blogApplication.dtos.responses.AddBlogResponse;
import com.sowloo.blogApplication.services.BlogService;
import com.sowloo.blogApplication.services.BlogServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class BlogController {
    private final BlogService blogService = new BlogServiceImpl();

    @PostMapping("/api/addblog")
    public AddBlogResponse addBlog(@RequestBody AddBlogRequest addBlogRequest) {
        return blogService.addBlog(addBlogRequest);
    }
    @GetMapping("/api/blog/{id}")
    public Blog findBlogById(@PathVariable("id") Integer id) {
        return blogService.findMyBlogWithMy(id);
    }
}
