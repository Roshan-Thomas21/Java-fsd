<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%! String data="Kannur"; %> 
<sql:setDataSource var="ecommerce" driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/ecommerce" user="root"	password="Simplilearn" />

<sql:query dataSource="${ecommerce}" sql="SELECT * FROM station where station.sname='"+data +"'"
 	var="result" />

	<c:forEach var="row" items="${result.rows}">
			
			Station: <c:out value="${row.sname}" /><br>
			Status: <c:out value="${row.status}" /><br>
			Person in charge: <c:out value="${row.person_incharge}"/><br>
			Schedule: <c:out value="${row.schedule}" /><br>
			Landmark: <c:out value="${row.landmark}" /><br>
			Address: <c:out value="${row.address}" />	<br>
			<br><br>		
	</c:forEach>