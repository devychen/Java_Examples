import java.util.Arrays;

public class Initialise {
    public static void main(String[] args) {
        int[] count = new int[100];
        for (int i = 0; i < 100; i++){
            count[i] = 0;
        }
        // 打印数组中的所有元素
        for (int i = 0; i < count.length; i++) {
            System.out.println("count[" + i + "] = " + count[i]);
        }
    }
}
