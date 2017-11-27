package com.cn.hnust.service;

import com.cn.hnust.pojo.LoginInfo;
import com.cn.hnust.pojo.ResultMsg;

public interface LoginService {

	public ResultMsg getUserById(int userId);
	public ResultMsg addUser(LoginInfo lifo);
	public ResultMsg deletUser(int userId);
}
