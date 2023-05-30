package com.simpli;

import java.io.*;
import java.sql.*;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/update-demo")
public class UpdateDemo extends HttpServlet {
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
protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		String id = request.getParameter("id");
		String newPrice = request.getParameter("price");

		try {
			// Step 3: create the statement
			Statement stmt = connection.createStatement();

			// Step 4: execute the update

			stmt.executeUpdate("UPDATE eproduct set price=" + newPrice + " where id=" + id);

			out.println("Successfully update eproduct table setting the new price " + newPrice);

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