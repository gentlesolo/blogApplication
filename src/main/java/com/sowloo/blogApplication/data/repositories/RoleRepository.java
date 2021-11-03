package com.sowloo.blogApplication.data.repositories;

import com.sowloo.blogApplication.data.models.Role;

import java.util.List;

public interface RoleRepository {
    Role save(Role role);
    Role findRoleById(String id);
    void delete(Role role);
    void deleteById(String id);
    List<Role> findAllRoles();
}
