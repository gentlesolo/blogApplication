package com.sowloo.blogApplication.data.repositories;

import com.sowloo.blogApplication.data.models.Role;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoleRepositoryImplTest {

    private RoleRepository roleRepository;

    @BeforeEach
    void setUp() {
        roleRepository = new RoleRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
        Role role = new Role();
        role.setRole_id("2345");
        role.setRole_title("superAdmin");
        role.setRole_description("superAdmin can access all features");
        Role savedRole = roleRepository.save(role);
        assertEquals(role, savedRole);
    }

    @Test
    void findRoleById() {
        Role role = new Role();
        role.setRole_id("2345");
        role.setRole_title("superAdmin");
        role.setRole_description("superAdmin can access all features");
        Role savedRole = roleRepository.save(role);
        Role foundRole = roleRepository.findRoleById("2345");
        assertEquals(savedRole, foundRole);
    }

    @Test
    void delete() {
        Role role = new Role();
        role.setRole_id("2345");
        role.setRole_title("superAdmin");
        role.setRole_description("superAdmin can access all features");
        Role savedRole = roleRepository.save(role);
        roleRepository.delete(role);
        assertNull(roleRepository.findRoleById("2345"));

    }

    @Test
    void deleteById() {
        Role role = new Role();
        role.setRole_id("2345");
        role.setRole_title("superAdmin");
        role.setRole_description("superAdmin can access all features");
        Role savedRole = roleRepository.save(role);
        roleRepository.deleteById("2345");
        assertNull(roleRepository.findRoleById("2345"));
    }

    @Test
    void findAllRoles() {
        Role role = new Role();
        role.setRole_id("2345");
        role.setRole_title("superAdmin");
        role.setRole_description("superAdmin can access all features");
        roleRepository.save(role);
        roleRepository.save(role);
        roleRepository.save(role);
        roleRepository.save(role);
        assertEquals(4, roleRepository.findAllRoles().size());
    }
}