/*
 * 这段代码定义了一个名为SpeciesFirstTry的类，该类表示一种物种的信息。
 * 它包括物种名称（name）、种群数量（population）和增长率（growthRate）等实例变量。
 * 通过readInput方法，用户可以从键盘输入物种的相关信息。
 * writeOutput方法用于将物种信息输出到控制台。
 * getPopulationIn10方法计算并返回当前种群在未来10年内的预测值。
 */

import java.util.Scanner;

public class SpeciesFirstTry
{
    public String name;
    public int population;
    public double growthRate;
	
    public void readInput( )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the species' name?");
        name = keyboard.nextLine( );

        System.out.println("What is the population of the species?");
        population = keyboard.nextInt( );

        System.out.println("Enter growth rate (% increase per year):");
        growthRate = keyboard.nextDouble( );

        keyboard.close();
    }

    public void writeOutput( )
    {
         System.out.println("Name = " + name);
         System.out.println("Population = " + population);
         System.out.println("Growth rate = " + growthRate + "%");
    }

    /* 
     * 定义了一个方法getPopulationIn10，用于预测未来10年内的物种种群数量。
     * 在循环中，通过增长率计算每年的增长量，并更新populationAmount。
     * 如果在10年内种群数量仍然大于0，将最终结果取整并返回。
     * 否则，返回默认值0。
    */
    public int getPopulationIn10( )
    {
		int result = 0;
        double populationAmount = population;
        int count = 10;
		
        while ((count > 0) && (populationAmount > 0)) // 只要预测年数大于0且当前种群数量大于0，执行循环体
        {
            // 通过增长率计算每年的增长量，
            // 然后更新populationAmount
            populationAmount = populationAmount +
                              (growthRate / 100) * populationAmount;
            count--; // 减少count表示已经预测了一年。
        }
	   
        // 如果循环结束后种群数量仍然大于0，
        // 将populationAmount转换为整数并赋值给result。
        if (populationAmount > 0)
            result = (int)populationAmount;
	
        return result;
    }
}
