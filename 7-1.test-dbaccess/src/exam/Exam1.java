package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// import java.util.ArrayList;
// import java.util.List;

public class Exam1 {
    public static void main(String[] args) {
           
        // 接続情報
        String url = "jdbc:postgresql://localhost:5432/student";
        String user = "postgres";
        String password = "Ubuntu";

        Connection con = null; // 使用する変数の宣言
        PreparedStatement pstmt = null;
        // String sql1, sql2, sql3 = null;
        String sql = null;
        int InsertOfNum = 0;
        // List<String> list = new ArrayList<>();

        try {
            // (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

            // sql1 = "INSERT INTO test_members(name, age, dep_id) VALUES ('山田太郎', 62, 1);";
            // sql2 = "INSERT INTO test_members(name, age, dep_id) VALUES ('佐藤花子', 33, 2);";
            // sql3 = "INSERT INTO test_members(name, age, dep_id) VALUES ('遠藤次郎', 55, 2);";
            // list.add(sql1);
            // list.add(sql2);
            // list.add(sql3);

            // // (3)SQL実行準備
            // for (String sql: list) {
            //     pstmt = con.prepareStatement(sql);

            //     int num = pstmt.executeUpdate();
            //     InsertOfNum += num;
            // }

            sql = "INSERT INTO test_members(name, age, dep_id) VALUES ('山田太郎', 62, 1); ";
            sql += "INSERT INTO test_members(name, age, dep_id) VALUES ('佐藤花子', 33, 2); ";
            sql += "INSERT INTO test_members(name, age, dep_id) VALUES ('遠藤次郎', 55, 2);";
            pstmt = con.prepareStatement(sql);
            InsertOfNum = pstmt.executeUpdate();

            System.out.println(InsertOfNum + "件挿入しました");
			
        } catch(SQLException ex) {
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
			} catch (Exception ex) {
                ex.printStackTrace();
            }
		}
        
    }
}
