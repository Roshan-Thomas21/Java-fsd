<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Admin</title>
Welcome Admin<br><br>
<a style="position: absolute; top: 0px; right: 5px;" href="login.jsp">Logout</a>
<a href="addcrossing.html">Add a new crossing</a><br>

<sql:setDataSource var="ecommerce" driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/ecommerce" user="root"	password="Simplilearn" />
	
<sql:query dataSource="${ecommerce}" sql="SELECT * FROM station"	var="result" />
<table border=1>
	<tr>
		<th>Station</th>
		<th>Status</th>
		<th>Person in charge</th>
		<th>Schedule</th>
		<th>Landmark</th>
		<th>Address</th>
		<th>Action</th>
	</tr>

	<c:forEach var="row" items="${result.rows}">
	<tr>
			 <td><c:out value="${row.sname}" />
			 <td><c:out value="${row.status}" />
			 <td><c:out value="${row.person_incharge}"/>
			 <td><c:out value="${row.schedule}" />
			 <td><c:out value="${row.landmark}" />
			 <td><c:out value="${row.address}" />
			 <td><a href="update.jsp?sname=${row.sname}">Update</a>&ensp;<a href="delete.jsp?sname=${row.sname}">Delete</a>
		</tr>	
	</c:forEach>
	</table>
	