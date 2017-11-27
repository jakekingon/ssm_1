package com.cn.hnust.service.impl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.hnust.dao.DbUserDao;
import com.cn.hnust.listener.SessionListener;
import com.cn.hnust.pojo.DbUser;
import com.cn.hnust.pojo.ResultMsg;
import com.cn.hnust.service.UserLoginService;
import com.cn.hnust.util.HnustUtil;

@Service
@Transactional
public class UserLoginServiceimpl implements UserLoginService{

	@Resource
	private DbUserDao userdao;
	private Boolean checkFlag=true;
	public ResultMsg checkUser(String user,String password,int logintype,String token,HttpServletRequest rq) {
		ResultMsg result = new ResultMsg();
		DbUser usero =new DbUser();
		if(logintype==0){
			usero=this.userdao.selectByPrimaryKey(user);
			result=checkpassword(password,usero,rq);
		}else if(logintype==1){
			usero=this.userdao.selectByUserEmail(user);
			result=checkpassword(password,usero,rq);
		}else if(logintype==2){
			usero=this.userdao.selectByUserName(user);
			result=checkpassword(password,usero,rq);
		}else if(logintype==3){
			usero=this.userdao.selectByUserTel(user);
			result=checkpassword(password,usero,rq);
		}else{
			checkFlag=false;
			result.setMsg("登录信息有误！");
			result.setStatus(1);
		}
		if(checkFlag){
			
		}
		return result;
	}
	
	public ResultMsg checkpassword(String password,DbUser user,HttpServletRequest resq){
		ResultMsg result = new ResultMsg();
		if(user!=null){
			if(!user.getPassword().equals(password)){
				result.setMsg("密码错误！");
				result.setStatus(1);
				return result;
			}else{
				HttpSession session=resq.getSession();
				session.setAttribute("userid", user.getUserid().toString());
				
				String userid=user.getUserid().toString();  
		        if(SessionListener.sessionContext.getSessionMap().get(userid)!=null){  
		            HttpSession userSession=(HttpSession)SessionListener.sessionContext.getSessionMap().get(userid);  
		            //注销在线用户  
		            userSession.invalidate();             
		            SessionListener.sessionContext.getSessionMap().remove(userid);  
		            //清除在线用户后，更新map,替换map sessionid  
		            SessionListener.sessionContext.getSessionMap().remove(session.getId());   
		            SessionListener.sessionContext.getSessionMap().put(userid,session);   
		        }else{  
		            // 根据当前sessionid 取session对象。 更新map key=用户名 value=session对象 删除map  
		            SessionListener.sessionContext.getSessionMap().get(session.getId());  
		            SessionListener.sessionContext.getSessionMap().put(userid,SessionListener.sessionContext.getSessionMap().get(session.getId()));  
		            SessionListener.sessionContext.getSessionMap().remove(session.getId());  
		        } 
				
				result.setMsg("密码校验正确！");
				result.setStatus(0);
				result.setData(userid);
				return result;
			}
		}else{
			result.setMsg("用户不存在！");
			result.setStatus(1);
			return result;
		}
	}

	@Override
	public ResultMsg registUser(String username, String password, String email, String tel) {
		ResultMsg result = new ResultMsg();
		DbUser user =new DbUser();
		user = this.userdao.selectByUserName(username);
		if(user!=null){
			result.setMsg("用户名已存在！");
			result.setStatus(1);
			return result;
		}
		user=this.userdao.selectByUserEmail(email);
		if(user!=null){
			result.setMsg("邮箱已被注册！");
			result.setStatus(1);
			return result;
		}
		user=this.userdao.selectByUserTel(tel);
		if(user!=null){
			result.setMsg("手机号码已被注册！");
			result.setStatus(1);
			return result;
		}
		DbUser user1 =new DbUser();
		user1.setEmail(email);
		user1.setTel(tel);
		user1.setUsername(username);
		user1.setPassword(password);
		String userid = HnustUtil.redomnum();
		System.out.println(userid);
		user1.setUserid(userid);
		user1.setSex("1");
		this.userdao.insert(user1);
		result.setMsg("注册成功！");
		result.setStatus(0);
		return result;
	}
	
	public void sessionHandlerByCacheMap(HttpSession session){  
        String userid=session.getAttribute("userid").toString();  
        if(SessionListener.sessionContext.getSessionMap().get(userid)!=null){  
            HttpSession userSession=(HttpSession)SessionListener.sessionContext.getSessionMap().get(userid);  
            //注销在线用户  
            userSession.invalidate();             
            SessionListener.sessionContext.getSessionMap().remove(userid);  
            //清除在线用户后，更新map,替换map sessionid  
            SessionListener.sessionContext.getSessionMap().remove(session.getId());   
            SessionListener.sessionContext.getSessionMap().put(userid,session);   
        }  
        else  
        {  
            // 根据当前sessionid 取session对象。 更新map key=用户名 value=session对象 删除map  
                SessionListener.sessionContext.getSessionMap().get(session.getId());  
            SessionListener.sessionContext.getSessionMap().put(userid,SessionListener.sessionContext.getSessionMap().get(session.getId()));  
            SessionListener.sessionContext.getSessionMap().remove(session.getId());  
        }  
    } 

}
