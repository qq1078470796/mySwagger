package com.mySwagger.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mySwagger.www.common.PageHelper;
import com.mySwagger.www.common.PageHelper.Page;
import com.mySwagger.www.dao.UserMapper;
import com.mySwagger.www.entity.User;
import com.mySwagger.www.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public int regist(User user) {
       return userMapper.insert(user);
    }

    public User login(String name, String password) {
        User user = new User();
        user.setEmail( name );
        user.setPassword( password );
        return userMapper.selectOne( user );
        //return userMapper.findUserByNameAndPwd( name,password );
    }

    public User findByEmail(String email) {
        User user = new User();
        user.setEmail( email );
        return userMapper.selectOne( user );
       // return userMapper.findByEmail(email);
    }

    @Override
    public User findByPhone(String phone) {
        User user = new User();
        user.setPhone(phone);
        return userMapper.selectOne(user);
    }

    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(id);
        return userMapper.selectOne(user);
    }

    public User findByEmailActive(String email) {
        User user = new User();
        user.setEmail( email );
        return userMapper.selectOne( user );
        // return userMapper.findByEmail(email);
    }

    public User findById(String id) {
        User user = new User();
        Long uid = Long.parseLong( id );
        user.setId( uid );
        return userMapper.selectOne( user );
    }

    public User findById(long id) {
        User user = new User();
        user.setId( id );
        return userMapper.selectOne( user );
    }

    public void deleteByEmail(String email) {
        User user = new User();
        user.setEmail( email );
        userMapper.delete( user );
    }

    public void deleteByEmailAndFalse(String email) {
        User user = new User();
        user.setEmail( email );
        userMapper.delete( user );
    }

    public void update(User user) {
        userMapper.updateByPrimaryKeySelective( user );
    }

    @Override
    public PageHelper.Page<User> findAll(Integer pageNum, Integer pageSize) {
        //分页查询
        PageHelper.startPage(pageNum, pageSize);//开始分页
        List<User> list = userMapper.select(null);
        Page endPage = PageHelper.endPage();//分页结束
        return endPage;
    }
}
