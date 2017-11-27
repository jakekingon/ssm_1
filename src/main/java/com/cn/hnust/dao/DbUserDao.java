package com.cn.hnust.dao;

import com.cn.hnust.pojo.DbUser;
import com.cn.hnust.pojo.DbUserExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbUserDao {
    int countByExample(DbUserExample example);

    int deleteByExample(DbUserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(DbUser record);

    int insertSelective(DbUser record);

    List<DbUser> selectByExample(DbUserExample example);

    DbUser selectByPrimaryKey(String userid);
    DbUser selectByUserTel(String tel);
    DbUser selectByUserName(String username);
    DbUser selectByUserEmail(String email);

    int updateByExampleSelective(@Param("record") DbUser record, @Param("example") DbUserExample example);

    int updateByExample(@Param("record") DbUser record, @Param("example") DbUserExample example);

    int updateByPrimaryKeySelective(DbUser record);

    int updateByPrimaryKey(DbUser record);
}