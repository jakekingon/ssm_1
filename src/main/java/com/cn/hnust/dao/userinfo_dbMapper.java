package com.cn.hnust.dao;

import com.cn.hnust.pojo.userinfo_db;

public interface userinfo_dbMapper {
    int deleteByPrimaryKey(String userid);

    int insert(userinfo_db record);

    int insertSelective(userinfo_db record);

    userinfo_db selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(userinfo_db record);

    int updateByPrimaryKey(userinfo_db record);
}