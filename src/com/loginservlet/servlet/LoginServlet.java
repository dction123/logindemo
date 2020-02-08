package com.loginservlet.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.loginserclet.model.User;
import com.loginservlet.dao.Userdao;
import com.loginservlet.util.Dbutil;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //Dbutil dbutil = new Dbutil();
    Userdao userdao = new Userdao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Connection conn = null;
		try {
			conn = Dbutil.getConnection();
			User user = new User(username,password);
			User resultUser = userdao.login(conn, user);
			if(resultUser==null) {
				System.out.println("no");
				request.setAttribute("erro", "账号或密码错误");
				request.setAttribute("username", username);
				request.setAttribute("password", password);
				request.getRequestDispatcher("login.jsp").forward(request, response);
				
			}else {
				System.out.println("ok");
				
				HttpSession session = request.getSession();
				session.setAttribute("User", resultUser);
				response.sendRedirect("main.jsp");
				//重定向到main.jsp
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			Dbutil.closeConnection(conn);
		}
		
		
		
		
	}

}
