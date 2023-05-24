package com.simpli;

import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException; 
import java.io.PrintWriter; 
public class ServletGetPostDemo extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter(); 
		out.print("Got a GET HTTP request."); 
		} 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		PrintWriter out = response.getWriter(); 
		out.print("Got a POST HTTP request."); 
		}
	}