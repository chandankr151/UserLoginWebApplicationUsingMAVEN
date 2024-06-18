package com.ServletController;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.BackEndData;

public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String usr = request.getParameter("usr");
		String pass = request.getParameter("pass");

		BackEndData obj = new BackEndData();
		ResultSet rs = obj.getBackendData();
		
		try {
			
			boolean flag = false;
			
			while (rs.next()) {
				
				if (rs.getString(1).equalsIgnoreCase(usr) && rs.getString(2).equalsIgnoreCase(pass)) {
					out.println("<html><head>");
					out.println("<link rel='stylesheet' href='style.css' >");
					out.println("</head>");
					out.println("<body><form>");
					out.println("Login Successful!!!");
					out.println("<h1>Jsp Data on Servlet!!! </h1>");
					out.println("<h2>User Id: </h2>" + usr);
					out.println("<h2>User Password: </h2>" + pass);

					out.println("</form></body></html>");
					flag = true;
				}
			}
			if (!flag) {
				out.println("<html><head>");
				out.println("<link rel='stylesheet' href='style.css' >");
				out.println("</head>");
				out.println("<body><form>");
				out.println("<h1>Invalid Credentials!!!</h1>");
				
				out.println("</form></body></html>");
				System.out.print("Invalid Credentials!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}