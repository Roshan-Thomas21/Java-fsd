<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@ page import="java.sql.*" %>
<%!String driverName = "com.mysql.cj.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/ecommerce";%>
<%!String user = "root";%>
<%!String psw = "Simplilearn";%>
<%
String sname=session.getAttribute("sname").toString();
String status = request.getParameter("status");
if(sname != null)
{
Connection con = null;
PreparedStatement ps = null;
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql="UPDATE station set status=? where sname='"+ sname + "'" ;
ps = con.prepareStatement(sql);

ps.setString(1, status);
int i = ps.executeUpdate();
if(i > 0)
{
out.print("Status Updated Successfully");
%>
<br><a href="adminhome.jsp">Home</a>
<%
}
else
{
out.print("There is a problem in updating status.");
} 
}
catch(SQLException sql)
{
request.setAttribute("Error", sql);
out.println(sql);
}
}
%>