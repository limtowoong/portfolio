<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
<script type="text/javascript">
	function checkValue2() {
		if(!document.data.RESVNO.value) {
			alert("회원번호를 입력하세요.");
			data.RESVNO.focus();
			return false;
		} 
		return true;}
</script>
</head>
<body>
	<jsp:include page="layout/header.jsp"/>
	<jsp:include page="layout/nav.jsp"/>	
 <section>
	<div class="section">
		<div class="title">백신예약조회</div>
		<div>
		<form name="data" action="search_reservation_table.jsp" method="post" onsubmit="return checkValue2()">
			<table class="table_line">
				<tr>
					<th>예약번호</th>
					<td><input type="text" name="RESVNO"></td>
				</tr>
				<tr>
					<th colspan="2">
						<input class="btn_st" type="submit" value="조회하기">
						<input class="btn_st" type="button" value="홈으로" onclick="location.href='index.jsp'">
					</th>
				</tr>
			</table>
		</form>
		</div>
	</div>
 </section>	
 <footer>
	<jsp:include page="layout/footer.jsp"/>
 </footer>	
</body>
</html>