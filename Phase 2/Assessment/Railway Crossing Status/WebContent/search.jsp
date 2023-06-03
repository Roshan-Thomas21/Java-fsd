<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%
%>
<title>Search</title>
<a style="position: absolute; top: 0px; right: 5px;" href="login.jsp">Logout</a>
<%
String driver = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "ecommerce";
String userid = "root";
String password = "Simplilearn";
String sname=request.getParameter("sname");
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>

<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from station where sname='"+sname+"'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>

Station : <%=resultSet.getString("sname") %><br>
Status : <%=resultSet.getString("status") %><br>
Person in charge : <%=resultSet.getString("person_incharge") %><br>
Schedule : <%=resultSet.getString("schedule") %><br>
Landmark : <%=resultSet.getString("landmark") %><br>
Address : <%=resultSet.getString("address") %><br>

<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
<a href="user.jsp">Home</a>
<%
%>
</table>
</body>
</html>