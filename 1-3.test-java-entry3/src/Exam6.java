public class Exam6 {
    public static void main(String[] args) {
        System.out.println("第1引数:2、第2引数:3、第3引数:’+’　　⇒　" + calc(2, 3, '+'));
        System.out.println("第1引数:8、第2引数:2、第3引数:’-’　　⇒　" + calc(8, 2, '-'));
        System.out.println("第1引数:5、第2引数:4、第3引数:’*’　　⇒　" + calc(5, 4, '*'));
        System.out.println("第1引数:7、第2引数:2、第3引数:’/’　　⇒　" + calc(7, 2, '/'));
        System.out.println("第1引数:3、第2引数:8、第3引数:’@’　　⇒　" + calc(3, 8, '@'));
    }

    static int calc(int num1, int num2, char str) {
        if (str == '+') {
            return num1 + num2;
        } else if (str == '-') {
            return num1 - num2;
        } else if (str == '*') {
            return num1 * num2;
        } else if (str == '/') {
            return num1 / num2;
        } else {
            return -1;
        }
    } 
}
