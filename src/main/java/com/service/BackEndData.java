package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.DAO.DbConfig;

public class BackEndData {

	public ResultSet getBackendData() {

		ResultSet rs = null;
		Connection con = null;
		Statement stmt = null;
		
		DbConfig conf = new DbConfig();

		String query = "select * from usrlogin";

		try {
			con = conf.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			
			/*
			 * while(rs.next()) { System.out.println(rs.getString(1));
			 * System.out.println(rs.getString(2)); }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
}