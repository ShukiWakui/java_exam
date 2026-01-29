package exam;

import dao.MemberDao;
import dto.Member;

/**
 * insert()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class InsertMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		dao.insert(new Member("シロー", 54, 3));
		

		System.out.println("insert終了");
	}

}
