// an example with accessor and mutator methods
import java.util.Scanner;

public class SpeciesFourthTry
{
     private String name;
     private int population;
     private double growthRate;

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

     /**
      Precondition: years is a nonnegative number.
      Returns the projected population of the calling object
      after the specified number of years.
     */
    public int predictPopulation(int years)
    {
		int result = 0;
        double populationAmount = population;
        int count = years;
        while ((count > 0) && (populationAmount > 0))
        {
            populationAmount = (populationAmount +
                          (growthRate / 100) * populationAmount);
            count--;
        }
        if (populationAmount > 0)
            result = (int)populationAmount;
	
        return result;
    }

    // mutator method
    public void setSpecies(String newName,
                    int newPopulation, double newGrowthRate)
    {
        name = newName;
        if (newPopulation >= 0)
            population = newPopulation;
        else
        {
            System.out.println(
                       "ERROR: using a negative population.");
            System.exit(0);
        }
        growthRate = newGrowthRate;
    }

    // accessor method
    public String getName( )
    {
        return name;
    }

    // accessor method
    public int getPopulation( )
    {
        return population;
    }

    // accessor method
    public double getGrowthRate( )
    {
        return growthRate;
    }
}


/*
 * 类定义及实例变量声明：
这部分定义了一个类 SpeciesFourthTry，
包含私有的实例变量 name、population 和 growthRate，
用于存储物种的名称、种群数量和增长率。

输入方法 readInput：
通过键盘输入物种的信息，包括名称、种群数量和增长率。

输出方法 writeOutput：
将物种的信息输出到控制台，包括名称、种群数量和增长率。

预测种群数量方法 predictPopulation：
根据指定的年数预测物种的种群数量。使用增长率和当前种群数量进行计算，返回预测值。

修改器方法 setSpecies：
修改物种的信息，包括名称、种群数量和增长率。

访问器方法 getName, getPopulation, getGrowthRate：
获取物种的名称、种群数量和增长率。
 */