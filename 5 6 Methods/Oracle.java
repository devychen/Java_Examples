
import java.util.Scanner;

public class Oracle
{
    private String oldAnswer = "The answer is in your heart.";
    private String newAnswer;
    private String question;
	
    public void chat( )
    {
        System.out.print("I am the oracle. ");
        System.out.println("I will answer any one-line question.");
        Scanner keyboard = new Scanner(System.in);
        String response;
        do
        {
            answer( );
            System.out.println("Do you wish to ask another question?");
            response = keyboard.next( );
        } while (response.equalsIgnoreCase("yes"));
        System.out.println("The oracle will now rest.");

        keyboard.close();
    }
	
    private void answer( )
    {
        System.out.println("What is your question?");
        Scanner keyboard = new Scanner(System.in);
        question = keyboard.nextLine();
        seekAdvice( );
        System.out.println("You asked the question:");
        System.out.println("  " + question);
		System.out.println("Now, here is my answer:");
        System.out.println("  " + oldAnswer);
        update( );

        keyboard.close();
    }
	
    private void seekAdvice( )
    {
        System.out.println("Hmm, I need some help on that.");
        System.out.println("Please give me one line of advice.");
        Scanner keyboard = new Scanner(System.in);
        newAnswer = keyboard.nextLine();
        System.out.println("Thank you. That helped a lot.");

        keyboard.close();
    }

    private void update( )
    {
        oldAnswer = newAnswer;
    }
}

/* 该程序模拟了一个简单的神谕对话，用户可以提问并获得答案，同时神谕会通过用户提供的建议来更新答案。
 * 程序概要：

 程序创建了一个 Oracle 类，
其中包含了私有的实例变量 oldAnswer（旧答案）、newAnswer（新答案）和 question（问题）。
chat 方法模拟了与神谕的对话，接收用户输入的问题，并提供答案。可以多次询问问题，直到用户不再希望提问。

方法详解：

chat 方法：
输出神谕的介绍信息。
使用 do-while 循环，调用 answer 方法来回答用户的问题，并询问是否继续提问。
当用户不再希望提问时，输出神谕休息的信息。

answer 方法：
提示用户输入问题，并调用 seekAdvice 方法来获取一行建议。
输出用户的问题和旧答案。
调用 update 方法来更新旧答案。

seekAdvice 方法：
提示用户提供一行建议。
将用户提供的建议存储在 newAnswer 中。

update 方法：
更新旧答案为新答案，以保持神谕的答案更新。
 */