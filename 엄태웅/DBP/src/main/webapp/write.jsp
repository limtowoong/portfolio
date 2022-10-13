<%@ page import="DB.DBConnect"%>
<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection conn = DBConnect.getConnection();
	Statement stmt = conn.createStatement();

	String sql = "select max(bno) from BOARD";
	ResultSet rs = stmt.executeQuery(sql);
	
	rs.next();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css?ver=2">
<title>Insert title here</title>
<script type="text/javascript">
	function test() {
		if(!document.data.writer.value) {
			alert("작성자를 입력하세요.")
			data.writer.focus();
			return false;
		} else if(!document.data.title.value) {
			alert("제목을 입력하세요.")
			data.title.focus();
			return false;
		} else if(!document.data.cont.value) {
			alert("내용을 입력하세요.")
			data.cont.focus();
			return false;
		}
		return true;
	}
</script>
</head>
<body>

<jsp:include page="layout/header.jsp"></jsp:include>

<jsp:include page="layout/nav.jsp"></jsp:include>

<section class = "section">
	<h2>게시판 글쓰기</h2>
	<form name="data" action="write_P.jsp" method="get" onsubmit="return test()">
		<div class = "WriteForm">
			<p class = "WriteTitle">글번호</p>
			<input type="text" name="bno" class="WriteInput" value="<%= rs.getInt(1)+1 %>" readonly>
			<br>
			<p class = "WriteTitle">작성자</p>
			<input type="text" name="writer" class="WriteInput" placeholder="작성자를 입력하세요.">
			<br>
			<p class = "WriteTitle">제목</p>
			<input type="text" name="title" class="WriteInput" placeholder="제목을 입력하세요.">
			<br>
			<p class = "WriteTitle">내용</p>
			<textarea id="ta" name="cont" class="WriteInput" placeholder="내용을 입력하세요."></textarea>
			<br>
			<br>
			<input class="bt" type="submit" value="글쓰기">
		</div>
	</form>
	
</section>

<jsp:include page="layout/footer.jsp"></jsp:include>

</body>
</html>