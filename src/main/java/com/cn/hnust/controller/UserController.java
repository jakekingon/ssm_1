package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.pojo.ResultMsg;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
	 
	@RequestMapping("/adduser")
	@ResponseBody
	public ResultMsg insertUser(HttpServletRequest request){
		int userId = Integer.parseInt(request.getParameter("id"));
		String userName = (String) request.getParameter("name");
		String password = (String) request.getParameter("password");
		int age = Integer.parseInt(request.getParameter("age"));
		User user = new User();
		user.setAge(age);
		user.setId(userId);
		user.setPassword(password);
		user.setUserName(userName);
		ResultMsg result = this.userService.addUser(user);
		return result;
	}
	
	@RequestMapping("/deletuser")
	@ResponseBody
	public ResultMsg DeletUser(HttpServletRequest request){
		int userId = Integer.parseInt(request.getParameter("id"));
		ResultMsg result = this.userService.deletUser(userId); 
		return result;
	}
}
