package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam2 {
    public static void main(String[] args) {
        // 接続情報
		String url = "jdbc:postgresql://localhost:5432/student";
		String user = "postgres";
		String password = "Ubuntu";

        // 使用する変数の宣言
		Connection con = null; 
		PreparedStatement pstmt = null;
		String sql = null;
        ResultSet rs = null;

        try {
            // (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

            sql = "SELECT * FROM test_members WHERE dep_id = 2;";

            pstmt = con.prepareStatement(sql);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                int depId = rs.getInt("dep_id");
                System.out.println("id:" + id);
                System.out.println("name:" + name);
                System.out.println("age:" + age);
                System.out.println("dep_id:" + depId);
            }

        } catch (SQLException ex) {
            System.err.println("SQL = " + sql);
			ex.printStackTrace();
        } finally {
            try {
				// (6) メモリの解放(切断)
				if (con != null) {
                    con.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
			} catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }
}
