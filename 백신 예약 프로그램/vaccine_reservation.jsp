<%@ page import = "java.sql.*" %>
<%@ page import = "DB.DBConnect" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
		alert("�����ȣ�� �Է��ϼ���.");
		data.RESVNO.focus();
		return false;
	}else if(!document.data.JUMIN.value){
		alert("�ֹι�ȣ�� �Է��ϼ���.");
		data.JUMIN.focus();
		return false;
	}
	else if(!document.data.VCODE.value){
		alert("����ڵ带 �Է��ϼ���.");
		data.VCODE.focus();
		return false;
	}
	else if(!document.data.HOSPCODE.value){
		alert("�����ڵ带 �Է��ϼ���.");
		data.HOSPCODE.focus();
		return false;
	}
	else if(!document.data.RESVDATE.value){
		alert("���೯¥�� �Է��ϼ���.");
		data.RESVDATE.focus();
		return false;
	}
	else if(!document.data.RESVTIME.value){
		alert("����ð��� �Էµ��� �ʾҽ��ϴ�.");
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
	<div class="title">��� ����</div>
<form name="data" method="post" action="insert_reservation.jsp" onsubmit="return checkValue()">
	<table class="table_line">
		<tr>
			<th>�����ȣ</th>
			<td><input type="text" name="RESVNO" readonly="readonly" value="<%=num%>"> ��)20210011</td>
		</tr>
		<tr>
			<th>�ֹι�ȣ</th>
			<td><input type="text" name="jNum"> ��)790101-1111111</td>
		</tr>
		<tr>
			<th>����ڵ�</th>
			<td>
			<select name="VCODE">
				<option value="">��ż���</option>
				<option value="V001">A���</option>
				<option value="V002">B���</option>
				<option value="V003">C���</option>
			</select>
			 ��)V001, V002, V003</td>
		</tr>
		<tr>
			<th>�����ڵ�</th>
			<td>
			<label><input type="radio" name="HOSPCODE" value="H001">��_����</label>
			<label><input type="radio" name="HOSPCODE" value="H002">��_����</label>
			<label><input type="radio" name="HOSPCODE" value="H003">��_����</label>
			<label><input type="radio" name="HOSPCODE" value="H004">��_����</label>
			 ��)H001, H002, H003, H004</td>
		</tr>
		<tr>
			<th>���೯¥</th>
			<td><input type="text" name="RESVDATE"> ��)20210101</td>
		</tr>
		<tr>
			<th>����ð�</th>
			<td><input type="text" name="RESVTIME"> ��)0930, 1130</td>
		</tr>
		<tr>
			<th colspan="2">
				<input type="submit" value="���">
				<input type="button" value="���" onclick="location.href='vaccine_reservation.jsp'">
			</th>
		</tr>
	</table>
</form>
</section>

</body>
</html>