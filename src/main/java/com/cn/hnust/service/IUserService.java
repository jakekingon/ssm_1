package com.cn.hnust.service;

import com.cn.hnust.pojo.ResultMsg;
import com.cn.hnust.pojo.User;

public interface IUserService {
	public User getUserById(int userId);
	public ResultMsg addUser(User user);
	public ResultMsg deletUser(int userId);
}
