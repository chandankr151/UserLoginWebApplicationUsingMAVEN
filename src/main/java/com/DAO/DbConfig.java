package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConfig {
	
	Connection con = null;
	
	public Connection getConnection() {
		
		String url = "jdbc:mysql://localhost:3306/springjdbc";
		String usr = "root";
		String pass ="govt";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,usr,pass);
			if(con != null) {
				System.out.println("Connection established!!!");
			}else {
				System.out.println("Error occured in database connection");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
