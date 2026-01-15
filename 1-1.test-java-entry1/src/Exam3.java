public class Exam3 {
    public static void main(String[] args) {
        int item1Price = 200;
        int item2Price = 250;
        System.out.println("⼩計");
        System.out.println(item1Price*3 + item2Price*4);
        System.out.println("消費税");
        System.out.println((int)((item1Price*3 + item2Price*4) * 0.1));
        System.out.println("合計⾦額");
        System.out.println((int)((item1Price*3 + item2Price*4) * 1.1));
    }
}
