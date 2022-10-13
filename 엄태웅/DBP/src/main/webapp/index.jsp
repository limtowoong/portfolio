<%@ page import="DB.DBConnect"%>
<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection conn = DBConnect.getConnection();
	Statement stmt = conn.createStatement();
	
	String sql = "select * from board";
	ResultSet rs = stmt.executeQuery(sql);
%>

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
	
</section>

<jsp:include page="layout/footer.jsp"></jsp:include>

</body>
</html>