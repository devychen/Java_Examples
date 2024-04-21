public class AddDemo {
    public static void main(String[] args) {

        // 实际参数：实际调用传递给他的参数
        int sum = add(1, 2);
        System.out.println(sum);

        test();
    }

    /* 修饰符 返回值类型 方法名（参数类型 参数名称）{
        ...
        方法体：具体语句，定义该方法的功能
        ...
        return 返回值 「如果存在返回值)」;
    }
    */
    public static int add(int a, int b) { 
        return a + b;
    }

    // 形式参数，用于定义
    public static void test() {
        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.println(i + "\t");
            }
            if (i % (5 * 3) == 0) {
                System.out.println();
                // System.out.ptint("\n");
            }
        }
    }
}
