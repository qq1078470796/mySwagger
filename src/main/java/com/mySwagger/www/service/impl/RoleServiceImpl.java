package com.mySwagger.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mySwagger.www.dao.RoleMapper;
import com.mySwagger.www.entity.Role;
import com.mySwagger.www.service.RoleService;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public Role findById(Long id) {
        Role role = new Role();
        role.setId( id );
        return roleMapper.selectOne( role );
    }

    @Override
    public int add(Role role) {
        return roleMapper.insert(role);
    }

    @Override
    public List<Role> findByUid(Long uid) {
        return roleMapper.findByUid(uid);
    }
}
