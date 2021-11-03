package com.sowloo.blogApplication.data.repositories;

import com.sowloo.blogApplication.data.models.Blog;
import com.sowloo.blogApplication.data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    List<User> users = new ArrayList<>();

    @Override
    public User save(User user) {
        users.add(user);
        return findByUserId(user.getUserId());
    }

    @Override
    public User findByUserId(String id) {
        for(User user : users) {
            if(user.getUserId().equalsIgnoreCase(id)){
                return user;
            }
        }
        return null;
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }

    @Override
    public void deleteByUserId(String id) {
        User user = findByUserId(id);
        users.remove(user);
    }

    @Override
    public List<User> findAll() {
        return users;
    }
}
