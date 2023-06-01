<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>Hello World JSP 2</h1>

<% out.println("Today is Sunday :"  + new java.util.Date()); %>

<br><br>
JSP Expressions Demo<br>
<%= java.util.Calendar.getInstance().getTime()%>

<br><br>
JSP Declaration Demo<br>
<%! int data=100; 
	public int getSomeNumber(){
		return 1500;
	}
%>

<%= "Value is:"+data %> 
<%= "NUmber  is:"+getSomeNumber() %>