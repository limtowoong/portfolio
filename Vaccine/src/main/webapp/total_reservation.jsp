<%@ page import = "java.sql.*" %>
<%@ page import = "DB.DBConnect" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
StringBuffer sb = new StringBuffer();
    
sb.append(" select h.HOSPADDR,                             ")
.append(" case h.HOSPADDR                                  ")
.append(" 	when '10' then '서울'                           ")
.append(" 	when '20' then '대전'                           ")
.append(" 	when '30' then '대구'                           ")
.append(" 	when '40' then '광주'                           ")
.append(" end as HOSPAREA,                                 ")
.append(" count(v.HOSPCODE)                                ")
.append(" from TBL_VACCRESV_202108 v, TBL_HOSP_202108 h    ")
.append(" where h.HOSPCODE = v.HOSPCODE(+)               ")
.append(" group by HOSPADDR                                ")
.append(" order by HOSPADDR                                ");
    
String sql = sb.toString();
    
Connection conn = DBConnect.getConnection();
PreparedStatement pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();
    
int sum = 0;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
<jsp:include page="layout/header.jsp"/>
<jsp:include page="layout/nav.jsp"/>	
 <section class="section">
	<div class="title">백신예약현황</div>
<table class="table_line align_center">
	<tr>
		<th>병원지역</th>
		<th>병원지역명</th>
		<th>접종예약건수</th>
	</tr>
	<%
		while(rs.next()){ 
	%>
	<tr>
		<td><%=rs.getString(1) %></td>
		<td><%=rs.getString(2) %></td>
		<td><%=rs.getString(3) %></td>
	</tr>
		<%
	sum += Integer.parseInt(rs.getString(3));
		} %>
	<tr>
		<td colspan="2">총합</td>
		<td><%=sum %></td>
	</tr>
</table>
 </section>
<jsp:include page="layout/footer.jsp"/>
</body>
</html>