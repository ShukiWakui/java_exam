import java.util.LinkedList;

public class ShoppingCart extends LinkedList<Item> {
    /**
     * 商品の合計価格を求めて返す.
     * 
     * @return 商品の合計価格
     */
    public int getTotalPrice() {
        int total = 0;
        for (Item item: this) {
            total += item.getPrice();
        }
        return total;
    }

    /**
     * 商品の平均価格を求めて返す
     * 
     * @return 商品の平均価格
     */
    public int getAveragePrice() {
        return this.size()==0 ? 0 : getTotalPrice() / this.size();
    }
}
