<%@ page import="DB.DBConnect"%>
<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	Connection conn = DBConnect.getConnection();
	String sql = "select * from member where id=? and pw=?";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	
	pstmt.setString(1, request.getParameter("id"));
	pstmt.setString(1, request.getParameter("pw"));
	
	ResultSet rs = pstmt.executeQuery(sql);
	
	if(rs.next()) {
		session.setAttribute("id", rs.getString(2));
%>
	alert("로그인 되었습니다.");
	<jsp:forward page="index.jsp"/>
<%
	}
%>

