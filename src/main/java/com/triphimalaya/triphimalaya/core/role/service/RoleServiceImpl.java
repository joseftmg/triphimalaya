package com.triphimalaya.triphimalaya.core.role.service;

import com.triphimalaya.triphimalaya.core.role.entity.Role;
import com.triphimalaya.triphimalaya.core.role.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService{
    private RoleRepository roleRepository;
    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role getById(long id) {
        return roleRepository.getOne(id);
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role delete(Role role) {
        roleRepository.delete(role);
        return role;
    }
}
