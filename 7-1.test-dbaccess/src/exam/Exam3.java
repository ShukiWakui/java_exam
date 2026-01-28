package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam3 {
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

            sql = "SELECT tm.id, tm.name AS tmname, tm.age, td.name AS tdname FROM test_members AS tm INNER JOIN test_deps AS td ON tm.dep_id = td.id;";

            pstmt = con.prepareStatement(sql);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("tmname");
                int age = rs.getInt("age");
                String depName = rs.getString("tdname");
                System.out.print("id=" + id + ", ");
                System.out.print("name=" + name + ", ");
                System.out.print("age=" + age + ", ");
                System.out.println("dep_name=" + depName);
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
