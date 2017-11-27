package com.cn.hnust.service;

import javax.servlet.http.HttpServletRequest;

import com.cn.hnust.pojo.ResultMsg;

public interface UserLoginService {

	public ResultMsg checkUser(String user,String password,int logintype,String token,HttpServletRequest rq);
	public ResultMsg registUser(String username,String password,String email,String tel);
}
