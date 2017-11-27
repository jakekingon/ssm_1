package com.cn.hnust.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.pojo.ResultMsg;
import com.cn.hnust.util.TokenProccessor;

@Controller
@RequestMapping("/creattoken")
public class CreatTokenController {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@RequestMapping("/makeid.do")
	@ResponseBody
	public ResultMsg excuter(HttpServletRequest rq){
		System.out.println("------------进入controller---------------");
		ResultMsg result = new ResultMsg();
		String token=TokenProccessor.getInstance().makeToken();
		HttpSession session=rq.getSession();
		logger.debug("生成的token为："+token);
		session.setAttribute("token", token);
		logger.debug("Web 容器Session对象被创建,sid:" + session.getId());
		result.setData(token);
		result.setMsg("tokenid");
		result.setStatus(0);
		System.out.println(token);
		return result;
	}

}
