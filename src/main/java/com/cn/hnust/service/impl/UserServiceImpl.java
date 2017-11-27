package com.cn.hnust.service.impl;

import javax.annotation.Resource;
import javax.naming.spi.DirStateFactory.Result;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.IUserDao;
import com.cn.hnust.pojo.ResultMsg;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	
	public User getUserById(int userId) {
		System.out.println("------------123--------");		// TODO Auto-generated method stub
		System.out.println(this.userDao.selectByPrimaryKey(userId));
		return this.userDao.selectByPrimaryKey(userId);
	}

	@Override
	public ResultMsg addUser(User user) {
		int userId = user.getId();
		User user2 = this.userDao.selectByPrimaryKey(userId);
		if(user2!=null){
			ResultMsg result = new ResultMsg();
			result.setMsg("用户id已存在！");
			result.setStatus(1);
			return result;
		}
		
		String userNmae=user.getUserName();
		User user1 = this.userDao.findByName(userNmae);
		if(user1!=null){
			ResultMsg result = new ResultMsg();
			result.setMsg("用户名已存在！");
			result.setStatus(1);
			return result;
		}
		
		this.userDao.insert(user);
		ResultMsg result = new ResultMsg();
		result.setMsg("注册成功！");
		result.setStatus(0);
//		return this.userDao.insert(user);
		return result;
	}

	@Override
	public ResultMsg deletUser(int userId) {
		User user = this.userDao.selectByPrimaryKey(userId);
		ResultMsg result = new ResultMsg();
		if(user==null){
			result.setMsg("该用户不存在，无法操作！");
			result.setStatus(1);
			return result;
		}else{
			this.userDao.deleteByPrimaryKey(userId);
			result.setMsg("用户删除成功！");
			result.setStatus(0);
		}
		return result;
	}
	
	

}
