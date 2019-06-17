package com.mySwagger.www.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.mySwagger.www.entity.LoginLog;

import tk.mybatis.mapper.common.Mapper;

public interface LoginLogMapper extends Mapper<LoginLog>{

}