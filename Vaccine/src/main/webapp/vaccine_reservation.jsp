<%@ page import = "java.sql.*" %>
<%@ page import = "DB.DBConnect" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%
	String sql =" select max(RESVNO) from TBL_VACCRESV_202108 " ;

	Connection conn = DBConnect.getConnection();
	PreparedStatement pstmt = conn.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery();
	
	rs.next();
	int num = rs.getInt(1)+1;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link type="text/css" rel="stylesheet" href="css/style.css">
<title>Insert title here</title>
<script type="text/javascript">
function checkValue(){
	if(!document.data.RESVNO.value){
		alert("예약번호를 입력하세요.");
		data.RESVNO.focus();
		return false;
	}else if(!document.data.JUMIN.value){
		alert("주민번호를 입력하세요.");
		data.JUMIN.focus();
		return false;
	}
	else if(!document.data.VCODE.value){
		alert("백신코드를 입력하세요.");
		data.VCODE.focus();
		return false;
	}
	else if(!document.data.HOSPCODE.value){
		alert("병원코드를 입력하세요.");
		data.HOSPCODE.focus();
		return false;
	}
	else if(!document.data.RESVDATE.value){
		alert("예약날짜를 입력하세요.");
		data.RESVDATE.focus();
		return false;
	}
	else if(!document.data.RESVTIME.value){
		alert("예약시간이 입력되지 않았습니다.");
		data.RESVTIME.focus();
		return false;
	}
}
</script>
</head>
<body>
<jsp:include page="layout/header.jsp"/>
<jsp:include page="layout/nav.jsp"/>
<section class="section">
	<div class="title">백신 예약</div>
<form name="data" method="post" action="insert_reservation.jsp" onsubmit="return checkValue()">
	<table class="table_line">
		<tr>
			<th>예약번호</th>
			<td><input type="text" name="RESVNO" readonly="readonly" value="<%=num%>"> 예)20210011</td>
		</tr>
		<tr>
			<th>주민번호</th>
			<td><input type="text" name="jNum"> 예)790101-1111111</td>
		</tr>
		<tr>
			<th>백신코드</th>
			<td>
			<select name="VCODE">
				<option value="">백신선택</option>
				<option value="V001">A백신</option>
				<option value="V002">B백신</option>
				<option value="V003">C백신</option>
			</select>
			 예)V001, V002, V003</td>
		</tr>
		<tr>
			<th>병원코드</th>
			<td>
			<label><input type="radio" name="HOSPCODE" value="H001">가_병원</label>
			<label><input type="radio" name="HOSPCODE" value="H002">나_병원</label>
			<label><input type="radio" name="HOSPCODE" value="H003">다_병원</label>
			<label><input type="radio" name="HOSPCODE" value="H004">라_병원</label>
			 예)H001, H002, H003, H004</td>
		</tr>
		<tr>
			<th>예약날짜</th>
			<td><input type="text" name="RESVDATE"> 예)20210101</td>
		</tr>
		<tr>
			<th>예약시간</th>
			<td><input type="text" name="RESVTIME"> 예)0930, 1130</td>
		</tr>
		<tr>
			<th colspan="2">
				<input type="submit" value="등록">
				<input type="button" value="취소" onclick="location.href='vaccine_reservation.jsp'">
			</th>
		</tr>
	</table>
</form>
</section>

</body>
</html>