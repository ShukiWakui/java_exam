package q4;

import java.util.ArrayList;
import java.util.List;

/**
 * Q4. 52枚のカードの絵柄とランクを表示しなさい。
 * その際、q4パッケージ内の他のクラスを利用すること。
 *
 * 表示結果は以下のようになります。
 * 
 * <pre>
 * スペードのA
 * スペードの2
 * ...
 * スペードの10
 * スペードのJ
 * スペードのQ
 * スペードのK
 * ハートのA
 * ハートの2
 * ...
 * ハートの10
 * ハートのJ
 * ハートのQ
 * ハートのK
 * クラブのA
 * クラブの2
 * ...
 * クラブのK
 * ダイヤのA
 * ...
 * ダイヤのK
 * </pre>
 *
 * @author y.morinaga
 */
public class CardMain {

    public static void main(String[] args) {
        List<Card> cardList = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cardList.add(new Card(suit, rank));
            }
        }
        for (Card card : cardList) {
            System.out.println(card);
        }
    }

}
