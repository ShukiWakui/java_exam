public class Ex04 {
    public static void main(String[] args) {
        int year = 2100;
        if (isUruudosi(year)) {
            System.out.println(year + "年はうるう年です");
        } else {
            System.out.println(year + "年はうるう年ではありません");
        }
    }

    public static boolean isUruudosi(int year) {
        if (year%400 == 0 && year%100 == 0 && year%4 == 0) {
            return true;
        } else if (year%100 == 0 && year%4 == 0) {
            return false;
        } else if (year%4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
