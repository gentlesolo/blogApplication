package com.sowloo.blogApplication.data.repositories;

import com.sowloo.blogApplication.data.models.Role;

import java.util.ArrayList;
import java.util.List;

public class RoleRepositoryImpl implements RoleRepository{
    List<Role> roles = new ArrayList<>();

    @Override
    public Role save(Role role) {
        roles.add(role);
        return role;
    }

    @Override
    public Role findRoleById(String id) {
        for(Role role : roles) {
            if(role.getRole_id().equalsIgnoreCase(id)){
                return role;
            }
        }
        return null;
    }

    @Override
    public void delete(Role role) {
        roles.remove(role);
    }

    @Override
    public void deleteById(String id) {
        Role role = findRoleById(id);
        roles.remove(role);
    }

    @Override
    public List<Role> findAllRoles() {
        return roles;
    }
}
