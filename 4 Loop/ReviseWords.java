import java.util.*;

public class ReviseWords {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String line = keyboard.nextLine();

        System.out.println("Enter lines of text to be reversed");

        for(int i = line.length() - 1; i >= 0; i-- ) // 使用for循环，从字符串line的最后一个字符开始逆序遍历到第一个字符（索引为0）
        {
            System.out.print(line.charAt(i)); // 打印当前循环迭代中字符串line中索引为i的字符，实现文本反转的效果
        }
        System.out.println(""); // 打印一个空行，用于使反转的文本与提示消息分隔开。
        keyboard.close();
        
    }
}

/*
 for(int i = line.length() - 1; i > 0; i-- ): 
 初始化一个循环变量 i，
 它从输入文本的最后一个字符的索引开始（line.length() - 1），一直递减到索引为0。
 -- 因为最后一个字符对应索引是length-1，比如"rei"这个单词，length=3，但最后一个字符index=2，分别是0, 1, 2
 这确保了我们从字符串的最后一个字符开始反转。

System.out.print(line.charAt(i));
在每次循环迭代中，
使用 charAt(i) 方法获取字符串 line 中索引为 i 的字符，
然后使用 System.out.print 打印该字符，
但注意这里使用的是 print 而不是 println，因此字符会在同一行输出。
*/