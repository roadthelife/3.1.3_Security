package com.example.crud.service;

import com.example.crud.model.Role;

import java.util.Set;

public interface RoleService {
    Set<Role> getAllRoles();

    Role getRoleById(Long id);

    Set<Role> getRoleByName(String rollName);

    void addRole(Role role);
}
