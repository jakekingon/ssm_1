package com.cn.hnust.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cn.hnust.dao.userinfo_dbMapper;
import com.cn.hnust.pojo.userinfo_db;
import com.cn.hnust.service.DBUser;

@Repository
@Service
public class DBUserImpl implements DBUser{
	@Resource
	private userinfo_dbMapper user_m;
	
	public userinfo_db getUserById(String userId) {
		
		return this.user_m.selectByPrimaryKey(userId);
	}

}
