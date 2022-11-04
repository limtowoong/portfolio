<%@page import="java.sql.*"%>
<%@page import="DB.DBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 	request.setCharacterEncoding("utf-8");
	
	Connection conn = DBConnect.getConnection();
	String sql = "delete from board where bno=?";
	
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setInt(1, Integer.parseInt(request.getParameter("bno")));
		
	pstmt.executeUpdate();
%>
<jsp:forward page="list.jsp" />