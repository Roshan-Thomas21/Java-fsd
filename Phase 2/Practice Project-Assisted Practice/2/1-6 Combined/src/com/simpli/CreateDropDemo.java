package com.simpli;

import java.io.*;
import java.sql.*;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/create-drop-demo")
public class CreateDropDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection = null;

	@Override
	public void init() throws ServletException {
		super.init();
		// Load the DB properties from the config file
		InputStream in = getServletContext().getResourceAsStream("config.properties");

		Properties props = new Properties();
		try {
			props.load(in);
		} catch (IOException e) {
			System.out.println(e);
		}

		DBUtil dbutil = new DBUtil(props.getProperty("url"), props.getProperty("userid"),
				props.getProperty("password"));

		connection = dbutil.getConnection();
		System.out.println("DB Connection initialized successfully!.<br>");
	}
protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		try {
			// Step 3: create the statement
			Statement stmt = connection.createStatement();
			stmt.execute("CREATE DATABASE SAMPLE1");			
			out.println("Successfully created database SAMPLE1");
			
//			stmt.execute("DROP DATABASE SAMPLE1");
//			out.println("Successfully dropped database SAMPLE1");

		} catch (SQLException e) {
			e.printStackTrace();
		}	
		out.println("</body></html>");
	}

	@Override
	public void destroy() {
		super.destroy();
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}