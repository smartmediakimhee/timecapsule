   private static Connection conn;
   private PreparedStatement pstmt;
   private CallableStatement cstmt;
   private ResultSet rs;

   private void getConnection() throws ClassNotFoundException, SQLException {
      if (conn == null) { // dbConn이 null이면 Connection 객체 얻어오기..
         // 접속정보
         String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
         String user = "test";
         String pw = "test";

         // JDBC드라이버 로드
         Class.forName("oracle.jdbc.driver.OracleDriver");
         // 오라클(DBMS)에 연결하여 Connection 객체 얻기.
         conn = DriverManager.getConnection(url, user, pw);
         System.out.println("DB연결완료");
      }
   }

   public boolean insertMember(String name) {

      boolean result = false;
      try {
         getConnection();

         String sql = "INSERT INTO member VALUES (?,?,?)";
         PreparedStatement pstmt = conn.prepareStatement(sql);

         pstmt.setString(1, name);
         pstmt.setString(2, "010-0000-0000");
         pstmt.setInt(3, 99);
         
         int r = pstmt.executeUpdate();

         if (r > 0)
            result = true;

      } catch (Exception e) {
         e.printStackTrace();
         System.out.println("예외발생:insertMember()=> " + e.getMessage());
      } finally {
         dbClose();
      }
      return result;
   }

   public boolean updateMember(String name) {

      boolean result = false;
      try {
         getConnection();

         String sql = "UPDATE member SET name = ? WHERE name =?";
         PreparedStatement pstmt = conn.prepareStatement(sql);

         pstmt.setString(1, name);
         pstmt.setString(2, name);

         int r = pstmt.executeUpdate();

         if (r > 0)
            result = true;

      } catch (Exception e) {
         System.out.println("예외발생:updateMember()=> " + e.getMessage());
      } finally {
         dbClose();
      }
      return result;
   }

   public ArrayList<MemberDTO> selectAll() {
      ArrayList<MemberDTO> dto = new ArrayList<>();
      try {
         getConnection();

         String sql = "SELECT * FROM member";
         PreparedStatement pstmt = conn.prepareStatement(sql);
         ResultSet r = pstmt.executeQuery();

      
         while (r.next()) {
            String n = r.getString("name");
            String phoneNumber = r.getString("phoneNum");
            int age = r.getInt("age");
            dto.add(new MemberDTO(n, phoneNumber, age));
         }
         
      } catch (Exception e) {
         System.out.println("예외발생:getMember()=> " + e.getMessage());
      } finally {
         dbClose();
      }
      return dto;
   }
   
   public MemberDTO getMember(String name) {
      MemberDTO dto = null;
      try {
         getConnection();

         String sql = "SELECT * FROM member WHERE phoneNum = ?";
         PreparedStatement pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, name);
         ResultSet r = pstmt.executeQuery();

      
         while (r.next()) {
            String n = r.getString("name");
            String phoneNumber = r.getString("phoneNum");
            int age = r.getInt("age");
            System.out.println(n + phoneNumber + age);
            dto = new MemberDTO(n, phoneNumber, age);
         }
         
      } catch (Exception e) {
         System.out.println("예외발생:getMember()=> " + e.getMessage());
      } finally {
         dbClose();
      }

      return dto;
   }

   public boolean deleteMember(String id) {
      boolean result = false;
      try {
         getConnection();

         String sql = "DELETE FROM member WHERE name = ?";
         PreparedStatement pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, id);
         int r = pstmt.executeUpdate();

         if (r > 0)
            result = true;

      } catch (Exception e) {
         System.out.println("예외발생:deleteMember()=> " + e.getMessage());
      } finally {
         dbClose();
      }
      return result;
   }

   /** DB연결 해제(닫기) */
   public void dbClose() {

      if (rs != null) {
         try {
            rs.close();
         } catch (SQLException e) {
            System.out.println("예외:ResultSet객체 close():" + e.getMessage());
         }
      }

      if (pstmt != null) {
         try {
            pstmt.close();
         } catch (SQLException e) {
            System.out.println("예외:PreparedStatement객체 close():" + e.getMessage());
         }
      }

      if (cstmt != null) {
         try {
            cstmt.close();
         } catch (SQLException e) {
            System.out.println("예외:CallableStatement객체 close():" + e.getMessage());
         }
      }

      if (conn != null) {
         try {
            conn.close();
         } catch (SQLException e) {
            System.out.println("예외:Connection객체 close():" + e.getMessage());
         }
      }

      conn = null;
   }// dbClose()---------