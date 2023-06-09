<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<title>Validate</title>
<form action="login.jsp" method="post">
	ID : &emsp;&emsp;<input type="text" name="userid"/><br>
	<input type="submit" />
</form>
   <%@page import="java.sql.*,java.util.*"%>
<%
String userid1 = request.getParameter("userid");
int userid=Integer.parseInt(userid1);
Class.forName("com.mysql.cj.jdbc.Driver");
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "686562");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from table where userid='" + userid + "'");
try {
 rs.next();
 if (Integer.parseInt(rs.getString("userid"))==(userid)) {
	 out.println("Success");
 }  
 else
 {
  out.println("Invalid password or username.");
 }
} catch (Exception e) {
 e.printStackTrace();
}
%>