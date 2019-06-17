package com.mySwagger.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mySwagger.www.dao.RoleUserMapper;
import com.mySwagger.www.entity.RoleUser;
import com.mySwagger.www.entity.User;
import com.mySwagger.www.service.RoleUserService;

import java.util.List;


@Service
public class RoleUserServiceImpl implements RoleUserService {
    @Autowired
    private RoleUserMapper roleUserMapper;

    public List<RoleUser> findByUser(User user) {
        RoleUser roleUser = new RoleUser();
        roleUser.setuId( user.getId() );
        return roleUserMapper.select( roleUser );
    }

    public int add(RoleUser roleUser) {
        return roleUserMapper.insert( roleUser );
    }

    public void deleteByUid(Long uid) {
        RoleUser roleUser = new RoleUser();
        roleUser.setuId( uid );
        roleUserMapper.delete( roleUser );
    }
}
