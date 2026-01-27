public class Exam5 {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Item("アナと雪の女王", 3000));
        shoppingCart.add(new Item("美女と野獣", 2000));
        shoppingCart.add(new Item("モアナと伝説の海", 8000));

        System.out.println("合計値：" + shoppingCart.getTotalPrice() + "円");
        System.out.println("平均値：" + shoppingCart.getAveragePrice() + "円");
    }
}
