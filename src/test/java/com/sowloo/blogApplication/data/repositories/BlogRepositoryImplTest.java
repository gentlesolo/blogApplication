package com.sowloo.blogApplication.data.repositories;

import com.sowloo.blogApplication.data.models.Blog;
import com.sowloo.blogApplication.data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlogRepositoryImplTest {

    private BlogRepository blogRepository;

    @BeforeEach
    void setUp() {
        blogRepository = new BlogRepositoryImpl();
    }

    @Test
    void save() {
        Blog blog = new Blog();
        User user = new User();
        blog.setBlogId(234);
        blog.setBlogTitle("The best real estate investment");
        blog.setBlogContent("The best real estate investment The best real estate investment");
        Blog  savedBlog = blogRepository.save(blog);
        assertEquals(blog, savedBlog);
    }

    @Test
    void findByBlogId() {
        Blog blog = new Blog();
        blog.setBlogId(234);
        blog.setBlogTitle("The best real estate investment");
        blog.setBlogContent("The best real estate investment The best real estate investment");
        Blog savedBlog = blogRepository.save(blog);
        Blog foundBlog = blogRepository.findByBlogId(234);
        assertEquals(savedBlog, foundBlog);

    }

    @Test
    void delete() {
        Blog blog = new Blog();
        blog.setBlogId(234);
        blog.setBlogTitle("The best real estate investment");
        blog.setBlogContent("The best real estate investment The best real estate investment");
        Blog savedBlog = blogRepository.save(blog);
        blogRepository.delete(blog);
        assertNull(blogRepository.findByBlogId(234));
    }

    @Test
    void deleteByBlogId() {
        Blog blog = new Blog();
        blog.setBlogId(234);
        blog.setBlogTitle("The best real estate investment");
        blog.setBlogContent("The best real estate investment The best real estate investment");
        Blog savedBlog = blogRepository.save(blog);
        blogRepository.deleteByBlogId("234");
        assertNull(blogRepository.findByBlogId(234));
    }

    @Test
    void findAll() {
        Blog blog = new Blog();
        blog.setBlogId(234);
        blog.setBlogTitle("The best real estate investment");
        blog.setBlogContent("The best real estate investment The best real estate investment");
        blogRepository.save(blog);
        blogRepository.save(blog);
        blogRepository.save(blog);
        assertEquals(3, blogRepository.findAll().size());
    }
}