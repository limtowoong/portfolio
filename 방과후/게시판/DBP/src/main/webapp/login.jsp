<%@ page import="DB.DBConnect"%>
<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css?ver=0">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="layout/header.jsp"></jsp:include>

<jsp:include page="layout/nav.jsp"></jsp:include>

<section>
	<form action="loginP.jsp">
		<h3>id</h3>
		<input type="text" class="WriteInput" name="id" placeholder="id">
		<h3>pw</h3>
		<input type="password" class="WriteInput" name="pw" placeholder="pw">
		<input type="submit" value="login">
	</form>
</section>

<jsp:include page="layout/footer.jsp"></jsp:include>

</body>
</html>