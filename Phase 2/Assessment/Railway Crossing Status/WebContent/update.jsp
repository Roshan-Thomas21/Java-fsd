<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<title>Status</title>
<%
String sname = request.getParameter("sname");
session.setAttribute("sname", sname);
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<a style="position: absolute; top: 0px; right: 5px;" href="login.jsp">Logout</a>
<%
try{
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Simplilearn");
statement=connection.createStatement();
String sql ="select * from station where sname='"+sname + "'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>

<h3>Update status of crossing</h3>
<form method="get" action="update-process.jsp?sname=${row.sname}">
Status:<input type="text" name="status" value="<%=resultSet.getString("status") %>"><br>
<input type="submit" value="submit">
</form>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>