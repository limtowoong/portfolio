## DBConnection.java

### 코드
![image](https://user-images.githubusercontent.com/104752202/186581482-8343dcb9-d9a2-4ac2-89ec-62ba6613d113.png)

&nbsp; <b>DB를 연결시켜주는 코드입니다.</b> <br><br><br>

### 코드 설명

```javascript
Connection conn = null;
```

&nbsp; 데이터베이스와 연결하는 객체 <br><br><br>

```javascript
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String id = "system";
String pw = "1234";
```

&nbsp; 데이터베이스에 연결하기 위한 정보 <br><br><br>

```javascript
conn = DriverManager.getConnection(url, id, pw);
```

&nbsp; Connection 객체를 이용하여 DB와 연결 <br><br><br>

```java
System.out.println("DB test");
```

&nbsp; DB연결 성공시 "DB test" 출력 <br><br><br>

## join.jsp

### 실행화면

![1](https://user-images.githubusercontent.com/104752202/186558002-56ff9201-1ac4-4c8e-b8e7-bba3bf1fa76a.png)

<br>

### 코드

![2](https://user-images.githubusercontent.com/104752202/186560032-f9186cbd-1cb5-4824-9e57-8655329e67f4.png)

&nbsp; <b>회원번호를 자동발생 시켜주는 코드</b> <br><br><br>

### 코드 설명

```javascript
Connection conn = DBConnect.getConnection();
```

&nbsp; conn을 통해 DB 연결 <br><br><br>

```javascript
PreparedStatement pstmt = conn.prepareStatement(sql);
```

&nbsp; Query문을 DB에 전달한다 <br><br><br>

```javascript
ResultSet rs = pstmt.executeQuery();
```

&nbsp; Query문을 실행시키고 마지막 번호를 rs에 저장 <br><br><br>

```javascript
rs.next();
int num = rs.getInt(1)+1;
```

&nbsp;  rs값에 +1 하고 num에 저장 <br><br><br>

### 예시1 ) 실행화면

![5](https://user-images.githubusercontent.com/104752202/186562672-b0027803-806d-4bb6-a4da-e528b6e6d925.png)

<br>

### 코드

![image](https://user-images.githubusercontent.com/104752202/186562021-8176dd2d-c0a1-449f-9c7d-df46c9b02bb7.png)

&nbsp; <b>value 값이 있으면 ture가 되어 통과되지만 value 값이 없으면 false가 되면 alert를 보여준다.</b> <br><br>

### 결과

![image](https://user-images.githubusercontent.com/104752202/186561587-7f9365a3-28a8-46bf-86a2-2496c92a982b.png)

![image](https://user-images.githubusercontent.com/104752202/186562147-47f762aa-7ec5-4113-87ff-e8484cc82915.png)

<br>

### 예시2 ) 실행화면

![3](https://user-images.githubusercontent.com/104752202/186560671-6b45369a-7731-46e6-82ce-2a2fca7ddbbc.png)

<br>

### 결과

![4](https://user-images.githubusercontent.com/104752202/186561066-b75bab97-91c9-4a47-bf72-054914bdded3.png)

<br>

## join_p.jsp

### 코드

![image](https://user-images.githubusercontent.com/104752202/186582085-e7c5eca8-04b3-4388-a5f2-9a26a1ebaa45.png)

<br>

### 코드 설명

```javascript
request.setCharacterEncoding("UTF-8");
```

&nbsp; UTF-8로 변환해주는 코드 <br><br><br>

```javascript
String sql="insert into member_tbl_02 values (?, ?, ?, ?, ?, ?, ?)";
```

&nbsp; 문자열인 Sql Query문을 저장 <br><br><br>

```javascript
pstmt.setInt(1, Integer.parseInt(request.getParameter("custno")));
pstmt.setString(2, request.getParameter("custname"));
pstmt.setString(3, request.getParameter("phone"));
pstmt.setString(4, request.getParameter("address"));
pstmt.setString(5, request.getParameter("joindate"));
pstmt.setString(6, request.getParameter("grade"));
pstmt.setString(7, request.getParameter("city"));
```

&nbsp; sql 문자열에 값을 넣어주는 코드 (custno는 int 값으로 받아줘야해서 Integer.parseInt로 변환하여 값을 넣어준다) <br><br><br>

```javascript
pstmt.executeUpdate();
```

&nbsp; DB 업데이트 <br><br>

## member_list.jsp

### 실행화면

![image](https://user-images.githubusercontent.com/104752202/186583226-e2e3636a-d114-4c04-83bd-b451958b985a.png)

<br>

### 코드

![image](https://user-images.githubusercontent.com/104752202/186584465-7d7c53df-318b-4005-ab00-c8b658e90452.png)

![image](https://user-images.githubusercontent.com/104752202/186584555-c5e7847c-266b-4963-845f-4c2755f808d1.png)

<br>

### 코드 설명

```javascript
String sql="select custno, custname, phone, address, "
	+"to_char(joindate,'yyyy-mm-dd') joindate, "
	+"case when grade = 'A' then 'VIP' when grade = 'B' then '일반' else '직원' end grade, "
	+"city from member_tbl_02 order by custno asc";
```

<br>

&nbsp; 1. 문자열인 sql에 Query문을 작성하고 custno, custname, phon, address를 검색한다. <br><br>
&nbsp; 2. to_char를 이용하여 날짜 형식을 yyyy-mm-dd 형식으로 바꿔준다. <br><br>
&nbsp; 3. when을 사용하여 조건에 따라 등급을 정한다. <br><br>
&nbsp; 4. 도시 번호를 가져온다. <br><br>

<br><br>

```html
<tr>
	<th>회원번호</th>
	<th>회원성명</th>
	<th>전화번호</th>
	<th>주소</th>
	<th>가입일자</th>
	<th>고객등급</th>
	<th>거주지역</th>
</tr>
```

&nbsp; 첫행에 표시될 코드 <br><br>

```javascript
<%
	while(rs.next()) {
%>
<tr class="center">
	<td><%= rs.getString("custno")%></td>
	<td><%= rs.getString("custname") %></td>
	<td><%= rs.getString("phone") %></td>
	<td><%= rs.getString("address") %></td>
	<td><%= rs.getString("joindate") %></td>
	<td><%= rs.getString("grade") %></td>
	<td><%= rs.getString("city") %></td>
	<td>
		<input type="button" value="수정" >
		<input type="button" value="삭제" >
	</td>
</tr>
<%
	}
%>
```

&nbsp; while 문에 조건으로 rs.next를 넣어 마지막값까지 반복 <br>

&nbsp; rs를 받을 때 String 형태로 받기 때문에 getString을 쓴다.
