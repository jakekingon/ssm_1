package com.cn.hnust.listener;

import javax.servlet.http.HttpSessionEvent;  
import javax.servlet.http.HttpSessionListener;  
  
import com.cn.hnust.util.SessionContext;  
  
public class SessionListener implements HttpSessionListener {
	
    public  static SessionContext sessionContext=SessionContext.getInstance();  
   
    public void sessionCreated(HttpSessionEvent httpSessionEvent) { 
    	System.out.println("---------sessionCreated start-------------------");
        sessionContext.AddSession(httpSessionEvent.getSession());  
    }  
  
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {  
        sessionContext.DelSession(httpSessionEvent.getSession());  
    }  
} 
