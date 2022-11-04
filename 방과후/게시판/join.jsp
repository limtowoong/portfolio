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
<title>join.jsp</title>
<script type="text/javascript">
	function test() {
		if(!document.joinForm.id.value) {
			alert("아이디를 입력하세요.")
			joinForm.id.focus();
			return false;
		} else if(!document.joinForm.pw.value) {
			alert("비밀번호를 입력하세요.")
			joinForm.pw_r.focus();
			return false;
		} else if(!document.joinForm.pw_r.value) {
			alert("비밀번호 재확인을 입력하세요.")
			joinForm.pw_r.focus();
			return false;
		} else if(!document.joinForm.pw.value
				== document.joinForm.pw_r.value) {
			alert("비밀번호가 일치하지 않습니다.")
			joinForm.pw.focus();
			return false;
		} else if(document.joinForm.pw.value
				== document.joinForm.pw_r.value) {
			alert("비밀번호가 일치합니다.")
			joinForm.pw_r.focus();
			return false;
		} else if(!document.joinForm.chim.value) {
			alert("내용을 입력하세요.")
			joinForm.chim.focus();
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
	<h2>회원가입</h2>
	<form name="joinForm" action="join_P.jsp" method="get" onsubmit="return ()">
		<div class = "WriteForm">
			<p class = "WriteTitle">id</p>
			<input type="text" name="id" class="WriteInput" placeholder="id">
			<br>
			<p class = "WriteTitle">pw</p>
			<input type="text" name="pw" class="WriteInput" placeholder="pw">
			<br>
			<p class = "WriteTitle">pw_r</p>
			<input type="text" name="pw_r" class="WriteInput" placeholder="pw_r">
			<br>
			<p class = "WriteTitle">tel</p>
			<input id="ta" name="tel" class="WriteInput" placeholder="tel">
			<br>
			<p class = "WriteTitle">hobby</p>
			<input id="ta" name="hobby" class="WriteInput" placeholder="hobby">
			<br>
			<input class="bt" type="submit" value="글쓰기">
		</div>
	</form>
	
</section>

<jsp:include page="layout/footer.jsp"></jsp:include>

</body>
</html>