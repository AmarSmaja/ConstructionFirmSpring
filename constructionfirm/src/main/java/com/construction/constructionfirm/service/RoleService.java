package com.construction.constructionfirm.service;

import com.construction.constructionfirm.entity.RoleEntity;
import com.construction.constructionfirm.repos.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepo roleRepo;

    public List<RoleEntity> getAllRoles() {
        List<RoleEntity> roles = roleRepo.findAll();
        return roles;
    }

    public RoleEntity saveRoles(RoleEntity roleEntity) {
        return roleRepo.save(roleEntity);
    }
}