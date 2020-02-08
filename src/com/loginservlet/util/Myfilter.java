package com.loginservlet.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Myfilter implements Filter{

	@Override
	public void doFilter(ServletRequest ServletRequest, ServletResponse ServletResponse, FilterChain FilterChain)
			throws IOException, ServletException {
		System.out.println("进入过滤器");
		HttpServletRequest request =(HttpServletRequest)ServletRequest;
		HttpSession session = request.getSession();
		System.out.println("session:"+session);
		Object o = session.getAttribute("User");
		String path = request.getServletPath();
		System.out.println("path:"+path);
		System.out.println("o:"+o);
		System.out.println( path.indexOf("login"));
		if(o == null && path.indexOf("login")<0){
			System.out.println("转发到登录页面");
			request.getRequestDispatcher("login.jsp").forward(ServletRequest, ServletResponse);
		}else{
			
			FilterChain.doFilter(ServletRequest, ServletResponse);
		}
	}

}
