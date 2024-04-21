public class CompareDemo {
    public static void main(String[] args) {
        int max = max (10, 20);
        System.out.println(max);
    }

    // compare size
    // use static to tell it's a class variable, could be invocated directly.
    // num1 and num2 is just 形式参数
    public static int max(int num1, int num2) {

        int result = 0;

        if(num1 == num2){
            System.out.println("equal.");
            return 0; // 终止方法
        }

        if (num1 > num2) {
            result =  num1;
        } else {
            result = num2;
        }

        return result; // 把结果返回出去；

    }

    // 方法可以无限多重名，但参数类型需要不同，即方法的重载 
    // public static double max (double num1, double num2){}
}
