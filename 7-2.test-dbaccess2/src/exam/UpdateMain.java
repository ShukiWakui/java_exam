package exam;

import dao.MemberDao;
import dto.Member;

/**
 * update()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class UpdateMain {
	public static void main(String[] args) {
		
		MemberDao dao = new MemberDao();
		Member jiro = dao.load(2);
		jiro.setAge(100);
		dao.update(jiro);
		
		System.out.println("update終了");
	}
}
