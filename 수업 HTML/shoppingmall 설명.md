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

    Connection conn = DBConnect.getConnection();

&nbsp; <b> DB에 연결된 상태를 conn 에 담는다. </b>

    PreparedStatement pstmt = conn.prepareStatement(sql);

&nbsp; <b> conn을 가지고 prepareStatement(sql)메소드를 통해 DB에 Sql문을 보낸다. </b>

    ResultSet rs = pstmt.executeQuery();

&nbsp; <b> 쿼리문을 실행한다. </b>




