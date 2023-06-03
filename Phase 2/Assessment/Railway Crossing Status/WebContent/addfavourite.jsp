<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
%>
<a style="position: absolute; top: 0px; right: 5px;" href="login.jsp">Logout</a>
<%
String sname=request.getParameter("sname");
try
{
         Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Simplilearn");
           Statement st=conn.createStatement();
           int i=st.executeUpdate("insert into favourite(sname)values('"+sname+"')");
        out.println("Added a favorite!<br>");
        %><a href="user.jsp">Home</a><%
        }
        catch(Exception e)
        {
        System.out.print(e);
        e.printStackTrace();
        }
 %>