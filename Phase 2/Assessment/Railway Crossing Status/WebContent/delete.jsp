<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%
String id = request.getParameter("sname");
if(id != null)
{
Connection con = null;
PreparedStatement ps = null;
try
{
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Simplilearn");
String sql = "DELETE FROM station WHERE sname='"+id + "'";
ps = con.prepareStatement(sql);
int i = ps.executeUpdate();
if(i > 0)
{
%>
<jsp:forward page="/adminhome.jsp"/><br>
out.println("Success");
<%
}
else{
%>
<jsp:forward page="/failure.jsp"/>
<%
}
}
catch(SQLException sqe)
{
request.setAttribute("Error", sqe);
out.println(sqe);
}
}
%>