package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.pojo.ResultMsg;
import com.cn.hnust.service.UserLoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Resource
	private UserLoginService userloginservice;
	
	@RequestMapping("/userlogin.do")
	public String excuter(HttpServletRequest rq,@RequestParam(value = "user") String user,@RequestParam(value = "password") String password,
			@RequestParam(value = "logintype") int logintype,@RequestParam(value = "token") String token,
			Model model){
		System.out.println(user+" "+password+" "+logintype+" "+token);
		ResultMsg result=this.userloginservice.checkUser(user, password, logintype, token,rq);
		model.addAttribute("viwe", result);
		return "helloworld";
	}
	
	
	
}
