public class ArrayPrinter {

    public static void printArray(int[][] table) {
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.print(table[row][col] + " "); // 添加空格以便分隔元素
            }
            System.out.println(); // 换行
        }
    }

    public static void main(String[] args) {
        // 创建一个二维数组
        int[][] myArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 调用 printArray 方法打印数组
        System.out.println("Printing 2D Array:");
        printArray(myArray);
    }
}
