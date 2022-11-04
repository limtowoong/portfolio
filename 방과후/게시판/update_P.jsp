<%@page import="java.sql.*"%>
<%@page import="DB.DBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 	request.setCharacterEncoding("UTF-8");
	
	Connection conn = DBConnect.getConnection();
	String sql = "update board set writer=?, title=?, cont=? where bno=?";
	
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setInt(4, Integer.parseInt(request.getParameter("bno")));
	pstmt.setString(1, request.getParameter("writer"));
	pstmt.setString(2, request.getParameter("title"));
	pstmt.setString(3, request.getParameter("cont"));
		
	pstmt.executeUpdate();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="css/style.css?ver=1">
<title>index.jsp</title>
</head>
<body>

<jsp:include page="layout/header.jsp"/>

<jsp:include page="layout/nav.jsp"/>
	
<section>
 <%=request.getParameter("bno")%>번째 글 수정이 완료되었습니다.
</section>

<jsp:include page="layout/footer.jsp"/>
</body>
</html>