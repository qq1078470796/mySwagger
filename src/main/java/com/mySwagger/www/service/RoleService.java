package com.mySwagger.www.service;


import java.util.List;

import com.mySwagger.www.entity.Role;


public interface RoleService {
    /**
     * 根据id查询角色
     * @param id
     * @return
     */
    Role findById(Long id);

    /**
     * 添加角色
     * @param role
     * @return
     */
    int add(Role role);

    /**
     * 根据用户id查询所有角色
     * @param uid
     * @return
     */
    List<Role> findByUid(Long uid);
}
