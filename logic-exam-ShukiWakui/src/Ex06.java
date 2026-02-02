import java.util.ArrayList;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        int num1 = (int) (Math.floor(Math.random() * 10));
        int num2 = (int) (Math.floor(Math.random() * 10));
        while (num1 == num2) {
            num2 = (int) (Math.floor(Math.random() * 10));
        }
        int num3 = (int) (Math.floor(Math.random() * 10));
        while (num3 == num1 || num3 == num2) {
            num3 = (int) (Math.floor(Math.random() * 10));
        }

        int[] nums = {num1, num2, num3};
        for (int i=0; i<=2; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j=0; j<=2; j++) {
                if (j != i) {
                    list.add(nums[j]);
                }
            }
            System.out.println("" + nums[i] + list.get(0) + list.get(1)); 
            System.out.println("" + nums[i] + list.get(1) + list.get(0)); 
        }
        
    }
}
