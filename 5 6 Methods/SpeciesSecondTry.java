
import java.util.Scanner;

public class SpeciesSecondTry
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

    /**
     Returns the projected population of the calling object
     after the specified number of years.
    */
    public int predictPopulation(int years) // before: public int getPopulationIn10( )
    {
		int result = 0;
        double populationAmount = population;
        int count = years; // before: int count = 10;

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
}
