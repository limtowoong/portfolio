## DBConnection.java

	public static Connection getConnection() {
		Connection conn = null;
		//데이터베이스와 연결하는 객체
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "system";
		String pw = "1234";
		//데이터베이스에 연결하기 위한 정보
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//JDBC 드라이버 로딩
			conn = DriverManager.getConnection(url, id, pw);
			//Connection 생성
			
			System.out.println("DB test");
		} catch(Exception e) {
			e.printStackTrace();
		}

		return conn;
	}


&nbsp; <b>  </b>
## join.jsp

### 실행화면
![1](https://user-images.githubusercontent.com/104752202/186558002-56ff9201-1ac4-4c8e-b8e7-bba3bf1fa76a.png)

### 코드

![2](https://user-images.githubusercontent.com/104752202/186560032-f9186cbd-1cb5-4824-9e57-8655329e67f4.png)

### 설명

	Connection conn = DBConnect.getConnection();
	
&nbsp; conn을 통해 DB 연결

	PreparedStatement pstmt = conn.prepareStatement(sql);

&nbsp; Query문을 DB에 전달한다

	ResultSet rs = pstmt.executeQuery();

&nbsp; Query문 실행하여 마지막 번호을 검색하여 변수 rs에 저장

### 실행화면

![5](https://user-images.githubusercontent.com/104752202/186562672-b0027803-806d-4bb6-a4da-e528b6e6d925.png)

### 코드

![image](https://user-images.githubusercontent.com/104752202/186562021-8176dd2d-c0a1-449f-9c7d-df46c9b02bb7.png)

### 설명

입력을 받지 않은 상태에서 등록을 누르면 false가 되어 

### 결과

![image](https://user-images.githubusercontent.com/104752202/186561587-7f9365a3-28a8-46bf-86a2-2496c92a982b.png)

![image](https://user-images.githubusercontent.com/104752202/186562147-47f762aa-7ec5-4113-87ff-e8484cc82915.png)

### 

![3](https://user-images.githubusercontent.com/104752202/186560671-6b45369a-7731-46e6-82ce-2a2fca7ddbbc.png)

![4](https://user-images.githubusercontent.com/104752202/186561066-b75bab97-91c9-4a47-bf72-054914bdded3.png)
## join_p.jsp

## member_list.jsp


