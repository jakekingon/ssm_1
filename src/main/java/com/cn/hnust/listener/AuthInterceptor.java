package com.cn.hnust.listener;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
  
import org.springframework.web.servlet.HandlerInterceptor;  
import org.springframework.web.servlet.ModelAndView;  
  
/** 
 * 登陆拦截器 
 * 场景：用户点击查看的时候，我们进行登陆拦截器操作，判断用户是否登陆？ 
 * 登陆，则不拦截，没登陆，则转到登陆界面； 
 * TODO 
 * 作者：原明卓 
 * 时间：2016年1月8日 下午3:25:35 
 * 工程：SpringMvcMybatis1Demo 
 */  
public class AuthInterceptor implements HandlerInterceptor {  
      
	//进入Handler方法之前执行
		//可以用于身份认证、身份授权。如果认证没有通过表示用户没有登陆，需要此方法拦截不再往下执行，否则就放行
		@Override
		public boolean preHandle(HttpServletRequest request,
				HttpServletResponse response, Object handler) throws Exception {
			System.out.println("----------------登录拦截器start--------------------");
			//获取请求的url
			String url = request.getRequestURI();
			//判断url是否公开地址（实际使用时将公开地址配置到配置文件中）
			//这里公开地址是否登陆提交的地址
			System.out.println(url);
			String[] uriPath=new String[] { "/login/userlogin.do", "/user/regist.do" };
			for(String s:uriPath){
				if(url.indexOf(s) > 0) {
					//如果进行登陆提交，放行
					return true;
				}
			}
			
			//判断session
			HttpSession session = request.getSession();
			//从session中取出用户身份信息
			String username = (String) session.getAttribute("userid");
			if(username != null) {
				return true;
			}
			
			
			//执行到这里表示用户身份需要验证，跳转到登陆页面
			request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
			
			return false;
		}

		//进入Handler方法之后，返回ModelAndView之前执行
		//应用场景从modelAndView出发：将公用的模型数据（比如菜单导航之类的）在这里传到视图，也可以在这里同一指定视图
		@Override
		public void postHandle(HttpServletRequest request,
				HttpServletResponse response, Object handler,
				ModelAndView modelAndView) throws Exception {

			System.out.println("HandlerInterceptor1....postHandle");
			
		}

		//执行Handler完成之后执行
		//应用场景：统一异常处理，统一日志处理
		@Override
		public void afterCompletion(HttpServletRequest request,
				HttpServletResponse response, Object handler, Exception ex)
				throws Exception {
			
			System.out.println("HandlerInterceptor1....afterCompletion");
		}
}  
