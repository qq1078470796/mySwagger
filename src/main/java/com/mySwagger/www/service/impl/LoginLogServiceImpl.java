package com.mySwagger.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mySwagger.www.dao.LoginLogMapper;
import com.mySwagger.www.entity.LoginLog;
import com.mySwagger.www.service.LoginLogService;

import java.util.List;


@Service
public class LoginLogServiceImpl implements LoginLogService {
    
    @Autowired
    private LoginLogMapper loginLogMapper;


    public int add(LoginLog loginLog) {
        return loginLogMapper.insert( loginLog );
    }

    @Override
    public List<LoginLog> findAll() {
        return loginLogMapper.select(null);
    }

    @Override
    public List<LoginLog> findByUid(Long uid) {
        LoginLog loginLog = new LoginLog();
        loginLog.setuId(uid);
        return loginLogMapper.select(loginLog);
    }
}

