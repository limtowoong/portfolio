<%@page import="java.sql.*"%>
<%@page import="DB.DBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	request.setCharacterEncoding("UTF-8");

	Connection conn = DBConnect.getConnection();

	String sql = "insert into board values(?, ?, ?, ?, ?)";
	
	PreparedStatement pstmt = conn.prepareStatement(sql);

	pstmt.setString(1, request.getParameter("name"));
	pstmt.setString(2, request.getParameter("id"));
	pstmt.setString(3, request.getParameter("pw"));
	pstmt.setString(4, request.getParameter("tel"));
	pstmt.setString(5, request.getParameter("chim"));
		
	pstmt.executeUpdate();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="css/style.css?ver=1">
<title>write_P</title>
</head>
<body>
<jsp:forward page="index.jsp"/>
</body>
</html>