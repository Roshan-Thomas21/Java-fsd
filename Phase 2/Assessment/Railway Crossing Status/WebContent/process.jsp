<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="bean.RegisterDao"%>
<jsp:useBean id="obj" class="bean.User" />

<jsp:setProperty property="*" name="obj" />

<%  
int status=RegisterDao.register(obj);  
if(status>0) { 
out.print("You have registered successfully"); 
%><br><a href="login.jsp">Login here</a><%
}
%>