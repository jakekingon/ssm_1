package com.cn.hnust.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.pojo.ResultMsg;
import com.cn.hnust.service.UserLoginService;

@Controller
@RequestMapping("/user")
public class RegistController {

	@Resource
	private UserLoginService userloginservice;
	
	@RequestMapping("/regist.do")
	@ResponseBody
	public ResultMsg execute(String username,String password,String email,String tel){
		System.out.println(username+" "+password+" "+email+" "+tel);
		ResultMsg result = this.userloginservice.registUser(username, password, email, tel);
		System.out.println("------------------controller处理完成---------------------------");
		return result;
	}
}
