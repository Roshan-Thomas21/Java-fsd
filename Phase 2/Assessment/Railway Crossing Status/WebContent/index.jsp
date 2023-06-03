<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <title>Main</title>
    <h1>Railway Crossing</h1>
    <h4>User Registration</h4>
<form action="process.jsp" method="post">  
User Name: <input type="text" name="uname" value="Name..." onclick="this.value=''"/><br/>  
Email ID: &nbsp;&emsp;<input type="text" name="uemail"  value="Email ID..." onclick="this.value=''"/><br/>  
Password: &nbsp;&ensp;<input type="password" name="upass"  value="Password..." onclick="this.value=''"/><br/>  
<input type="submit" value="Register"/>  
</form>  
<a href="login.jsp">Login here</a>