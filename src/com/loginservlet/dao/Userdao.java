package com.loginservlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.loginserclet.model.User;

public class Userdao {
	public User login(Connection conn, User user){
		User resultUser = null;
		String sql = "select * from user where username=? and password=?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				resultUser = new User();
				resultUser.setUsername(rs.getString("username"));
				resultUser.setPassword(rs.getString("password"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultUser;
	}

}
