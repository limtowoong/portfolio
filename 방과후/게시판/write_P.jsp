<%@page import="java.sql.*"%>
<%@page import="DB.DBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection conn = DBConnect.getConnection();
	String sql = "insert into board values(?, ?, ?, ?, sysdate)";
	
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setInt(1, Integer.parseInt(request.getParameter("bno")));
	pstmt.setString(2, request.getParameter("writer"));
	pstmt.setString(3, request.getParameter("title"));
	pstmt.setString(4, request.getParameter("cont"));
		
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

<jsp:include page="layout/header.jsp"/>

<jsp:include page="layout/nav.jsp"/>
	
<section>
 <%=request.getParameter("bno")%>번째 글 등록이 완료되었습니다.
</section>

<jsp:include page="layout/footer.jsp"/>
</body>
</html>