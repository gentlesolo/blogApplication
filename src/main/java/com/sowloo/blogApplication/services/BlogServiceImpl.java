package com.sowloo.blogApplication.services;

import com.sowloo.blogApplication.data.models.Blog;
import com.sowloo.blogApplication.data.repositories.BlogRepository;
import com.sowloo.blogApplication.data.repositories.BlogRepositoryImpl;
import com.sowloo.blogApplication.dtos.requests.AddBlogRequest;
import com.sowloo.blogApplication.dtos.responses.AddBlogResponse;
import com.sowloo.blogApplication.utils.ModelMapper;

public class BlogServiceImpl implements BlogService {
    private BlogRepository blogRepository = new BlogRepositoryImpl();

    @Override
    public AddBlogResponse addBlog(AddBlogRequest addBlogRequest) {
        Blog blog = ModelMapper.map(addBlogRequest);

        Blog savedBlog = blogRepository.save(blog);
        return ModelMapper.map(savedBlog);
    }

    @Override
    public Blog findMyBlogWithMy(Integer id) {
        return blogRepository.findByBlogId(id);
    }

//    @Override
//    public AddBlogResponse addBlog(AddBlogRequest addBlogRequest) {
//        return null;
//    }
}
