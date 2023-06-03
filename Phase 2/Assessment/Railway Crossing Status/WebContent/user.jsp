<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<title>User</title> 
<h3>User Home Page</h3>
<a href="favourite.jsp">View Favorite Crossing</a><br><br>
<a style="position: absolute; top: 0px; right: 5px;" href="login.jsp">Logout</a>
<form style="position: absolute; top: 25px; right: 5px;" class="form-inline" method="post" action="search.jsp">
    <input type="text" name="sname" class="form-control" placeholder="Search crossing...">
    <button type="submit" name="save" class="btn btn-primary">Search</button>
  </form>
  
<sql:setDataSource var="ecommerce" driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/ecommerce" user="root"	password="Simplilearn" />

<sql:query dataSource="${ecommerce}" sql="SELECT * FROM station"
 	var="result" />

	<c:forEach var="row" items="${result.rows}">
			
			Station: <c:out value="${row.sname}" /><br>
			Status: <c:out value="${row.status}" /><br>
			Person in charge: <c:out value="${row.person_incharge}"/><br>
			Schedule: <c:out value="${row.schedule}" /><br>
			Landmark: <c:out value="${row.landmark}" /><br>
			Address: <c:out value="${row.address}" /><br>
			<a href="addfavourite.jsp?sname=${row.sname}">Add to favorites</a><br>
			<br><br>		
	</c:forEach>