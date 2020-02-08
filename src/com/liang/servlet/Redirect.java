package com.liang.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Redirect extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service doget");
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		System.out.println("service dopost");
/*		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>你大爷的</title></head>");
		out.print("</html>");
		out.print("你好大爷");
		out.close();*/
		request.setAttribute("requestkey", "requestvalue");
		HttpSession session = request.getSession();
		session.setAttribute("sessionkey", "sessionvalue");
		ServletContext application = this.getServletContext();
		application.setAttribute("applicationkey", "applicationvalue");
		response.sendRedirect("target.jsp");
		 
		
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("servlet销毁");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		/**
		 * servlet的生命周期，servlet类加载-》servlet实例被创建-》处理调用doget/dopost-》servlet销毁
		 */
		System.out.println("servlete初始化");
	}
	
}
