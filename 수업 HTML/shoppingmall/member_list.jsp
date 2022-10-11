<%@ page import="DB.DBConnect"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String sql="select custno, custname, phone, address, "
	          +"to_char(joindate,'yyyy-mm-dd') joindate, "
			  +"case when grade = 'A' then 'VIP' when grade = 'B' then '일반' else '직원' end grade, "
			  +"city from member_tbl_02 order by custno asc";

	Connection conn = DBConnect.getConnection();
	PreparedStatement pstmt = conn.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member_list</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript">
	function checkDel(custno) {
		msg="삭제하시겠습니까?";
		if(confirm(msg)!=0){
			location.href="delete.jsp?d_custno="+custno;
			alert("삭제되었습니다.");
		} else {
			alert("삭제가 취소되었습니다.")
			return;
		}
	}
</script>
</head>
<body>
   	 <jsp:include page="layout/header.jsp"/>
   	 <jsp:include page="layout/nav.jsp"/>	
 <section class="section">
   	 <h2>회원 목록 조회 / 수정</h2><br>
	<table class="table_line">
				<tr>
					<th>회원번호</th>
					<th>회원성명</th>
					<th>전화번호</th>
					<th>주소</th>
					<th>가입일자</th>
					<th>고객등급</th>
					<th>거주지역</th>
					
				</tr>
				<%
					while(rs.next()) {
				%>
				<tr class="center">
					<td class="link"><a href="update.jsp?click_custno=<%= rs.getString("custno")%>"><%= rs.getString("custno")%></a></td>
					<td><%= rs.getString("custname") %></td>
					<td><%= rs.getString("phone") %></td>
					<td><%= rs.getString("address") %></td>
					<td><%= rs.getString("joindate") %></td>
					<td><%= rs.getString("grade") %></td>
					<td><%= rs.getString("city") %></td>
					<td>
						
						<input type="button" value="수정" onclick ="javascript:location.href='update.jsp?click_custno=<%= rs.getString("custno")%>'">
						<input type="button" value="삭제" onclick ="checkDel(<%= rs.getString("custno")%>);"></td>
				</tr>
				<%
					}
				%>
			</table>	
</section>
   	 <jsp:include page="layout/footer.jsp"/>
</body>
</html>