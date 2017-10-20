package cw;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TimeCapsule_DAO {
	private static Connection conn;
	private PreparedStatement pstmt;
	private CallableStatement cstmt;
	private ResultSet rs;

	
	private void getConnection() throws ClassNotFoundException, SQLException {
		if (conn == null) { // dbConn�� null�̸� Connection ��ü ������..
			// ��������
			String url = "jdbc:oracle:thin:@192.168.0.22:1521:xe";
			String user = "test";
			String dbpw = "test";

			// JDBC����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ����Ŭ(DBMS)�� �����Ͽ� Connection ��ü ���.
			conn = DriverManager.getConnection(url, user, dbpw);
			System.out.println("DB����Ϸ�");
		}
	}
	
	public void dbClose() {

		      if (rs != null) {
		         try {
		            rs.close();
		         } catch (SQLException e) {
		            System.out.println("����:ResultSet��ü close():" + e.getMessage());
		         }
		      }

		      if (pstmt != null) {
		         try {
		            pstmt.close();
		         } catch (SQLException e) {
		            System.out.println("����:PreparedStatement��ü close():" + e.getMessage());
		         }
		      }

		      if (cstmt != null) {
		         try {
		            cstmt.close();
		         } catch (SQLException e) {
		            System.out.println("����:CallableStatement��ü close():" + e.getMessage());
		         }
		      }

		      if (conn != null) {
		         try {
		            conn.close();
		         } catch (SQLException e) {
		            System.out.println("����:Connection��ü close():" + e.getMessage());
		         }
		      }

		      conn = null;
		   }

	public int createAcc(String id, int pw, String email) {
		int result = 0;
		try {
			 getConnection();
			
			 String sql = "INSERT INTO TABLE_ACCOUNT VALUES(SEQ_ACCOUNT_ID.NEXTVAL, ?,?,?)";
	         PreparedStatement pstmt = conn.prepareStatement(sql);
	         
	         pstmt.setString(1, id);
	         pstmt.setInt(2, pw);
	         pstmt.setString(3, email);
	         
	         result = pstmt.executeUpdate();
	         	         
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return result;
	}

	public boolean login(String email, int pw) {
		boolean isConnect = false;
		try {
			getConnection();
			
			String sql = "SELECT PW FROM TABLE_ACCOUNT WHERE EMAIL = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			ResultSet r = pstmt.executeQuery();
			
			r.next();
			int readPW =r.getInt("PW");
			if(readPW==pw) {
				System.out.println("����Ǿ����ϴ�. true�� �����մϴ�.");
				isConnect = true;
			} else {
				System.out.println("������ ��ġ���� �ʽ��ϴ�.");
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbClose();
		}
		
		return isConnect;
	}

}
