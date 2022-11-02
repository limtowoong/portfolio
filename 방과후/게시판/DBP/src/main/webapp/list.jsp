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
<meta charset="utf-8">
<link rel="stylesheet" type="text/css"
 href="css/style.css?ver=7">
<title>list.jsp</title>
<script type="text/javascript">
	function delete() {
		if(!confirm("삭제하시겠습니까?")) {
			alert("취소하셨습니다.);
			return;
		} else {
			location.href='delete.jsp?bno='+deleteBno;
			alert("삭제되었습니다.")
		}
   	}
</script>
</head>
<body>

<jsp:include page="layout/header.jsp"/>

<jsp:include page="layout/nav.jsp"/>
	
<section>
<h2>글 목록</h2>
<table>
  <tr>
    <th>글번호</th>
    <th>작성자</th>
    <th>제목</th>
    <th>내용</th>
    <th>글쓴시간</th>
    <th colspan="2">수정/삭제</th>
  </tr>
  
  <% while(rs.next()){
  	int deleteBno = rs.getInt("bno");
  %>
  <tr>
    <td><%=rs.getInt("bno")%></td>
    <td><%=rs.getString("writer")%></td>
    <td><%=rs.getString("title")%></td>
    <td><%=rs.getString("cont")%></td>
    <td><%=rs.getString("wdate")%></td>
    <td><input class="sb" type="button" value="수정" onclick="location.href='update.jsp?bno=<%=rs.getInt("bno")%>'"></td>
    <td><input class="sb" type="button" value="삭제" onclick="delete(deleteBno)"></td>
  </tr>
  <% } %>
</table>
</section>

<jsp:include page="layout/footer.jsp"/>
</body>
</html>
