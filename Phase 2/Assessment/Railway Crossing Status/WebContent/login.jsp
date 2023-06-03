<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<title>Login</title>
<h3>Login</h3>
<form action="login.jsp" method="post">
	Email : &emsp;&emsp;<input type="text" name="email"/><br>
	Password : <input type="password" name="password" /><br>
	<input type="submit" />
</form>
<br><a href="index.jsp">Click to register</a>
   <%@page import="java.sql.*,java.util.*"%>
<%
String email = request.getParameter("email");
session.putValue("email", email);
String password = request.getParameter("password");
Class.forName("com.mysql.cj.jdbc.Driver");
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Simplilearn");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from register where email='" + email + "' and password='" + password + "'");
try {
 rs.next();
 if(rs.getString("password").equals("admin") && rs.getString("email").equals("admin"))
 {
	 response.sendRedirect("adminhome.jsp");
	 }
 else
 if (rs.getString("password").equals(password) && rs.getString("email").equals(email)) {
	 response.sendRedirect("user.jsp");
 }  
 else
 {
  out.println("Invalid password or username.");
 }
} catch (Exception e) {
 e.printStackTrace();
}
%>