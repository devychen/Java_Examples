
public class SpeciesFirstTryDemo
{
    public static void main(String[] args)
    {
        // 使用new关键字调用SpeciesFirstTry类的默认构造函数，
        // 创建了一个新的SpeciesFirstTry对象，并将其赋值给speciesOfTheMonth变量。
        // 这样，程序可以通过这个对象来访问SpeciesFirstTry类的方法和实例变量
        // 或者说 创建了一个名为speciesOfTheMonth的SpeciesFirstTry类的新对象。
        SpeciesFirstTry speciesOfTheMonth = new SpeciesFirstTry( );
        
        System.out.println("Enter data on the Species of the Month:");
        speciesOfTheMonth.readInput( );
        speciesOfTheMonth.writeOutput( );
        int futurePopulation = speciesOfTheMonth.getPopulationIn10( );
        System.out.println("In ten years the population will be " +
                           futurePopulation);
						   
        //Change the species to show how to change 
        //the values of instance variables:
		speciesOfTheMonth.name = "Klingon ox";
        speciesOfTheMonth.population = 10;
        speciesOfTheMonth.growthRate = 15;
        System.out.println("The new Species of the Month:");
        speciesOfTheMonth.writeOutput( );
        System.out.println("In ten years the population will be " +
                           speciesOfTheMonth.getPopulationIn10( ));
    }
}



