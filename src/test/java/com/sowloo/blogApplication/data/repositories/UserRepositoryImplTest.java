package com.sowloo.blogApplication.data.repositories;

import com.sowloo.blogApplication.data.models.Blog;
import com.sowloo.blogApplication.data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplTest {
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepositoryImpl();
    }

    @Test
    void save() {
        User user = new User();
        user.setUserId("234");
        user.setFirstName("Tunde");
        user.setLastName("Bakeri");
        User savedUser = userRepository.save(user);
        assertEquals(user, savedUser);
    }

    @Test
    void findByUserId() {
        User user = new User();
        user.setUserId("234");
        user.setFirstName("Tunde");
        user.setLastName("Bakeri");
        User savedUser = userRepository.save(user);
        User foundUser = userRepository.findByUserId("234");
        assertEquals(savedUser, foundUser);
    }

    @Test
    void delete() {
        User user = new User();
        user.setUserId("234");
        user.setFirstName("Tunde");
        user.setLastName("Bakeri");
        User savedUser = userRepository.save(user);
        assertNotNull(userRepository.findByUserId("234"));
        userRepository.delete(user);
        assertNull(userRepository.findByUserId("234"));
    }

    @Test
    void deleteByUserId() {
        User user = new User();
        user.setUserId("234");
        user.setFirstName("Tunde");
        user.setLastName("Bakeri");
        User savedUser = userRepository.save(user);
        assertNotNull(userRepository.findByUserId("234"));
        userRepository.deleteByUserId("234");
        assertNull(userRepository.findByUserId("234"));
    }

    @Test
    void findAll() {
        User user = new User();
        user.setUserId("234");
        user.setFirstName("Tunde");
        user.setLastName("Bakeri");
        userRepository.save(user);
        userRepository.save(user);
        userRepository.save(user);
        userRepository.save(user);
        assertEquals(4,userRepository.findAll().size());
    }
}