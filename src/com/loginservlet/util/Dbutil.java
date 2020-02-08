package com.loginservlet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Dbutil {
	private static String jdbcName = "com.mysql.cj.jdbc.Driver";
	private static String dbUrl = "jdbc:mysql://localhost:3306/loginservlet?useSSL=false&serverTimezone=UTC";
	private static String dbUserName = "root";
	private static String dbPssword = "123456";
	private static Connection conn;
	
	public  static Connection getConnection() throws Exception{
				
				Class.forName(jdbcName);
				conn = DriverManager.getConnection(dbUrl, dbUserName, dbPssword);
				return conn;
	}
	public static void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception {
		Connection conn = getConnection();
		if (conn == null) {
			System.out.println("链接失败");
			
		}else {
			System.out.println("链接成功");
			
		}
		
	}
}
