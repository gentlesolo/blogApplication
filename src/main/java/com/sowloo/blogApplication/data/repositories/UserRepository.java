package com.sowloo.blogApplication.data.repositories;

import com.sowloo.blogApplication.data.models.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    User findByUserId(Integer id);
    void delete(User user);
    void deleteByUserId(Integer id);
    List<User> findAll();
}
