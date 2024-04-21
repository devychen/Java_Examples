public abstract class FirstClass implements A {  // This class must define all the methods that the interface has, thus adding 'abstract' otherwise error
    
    @Override // tells to override methods in implements
    public int getValue(){
        return 0;
    }

}

// if do not use 'abstract'
/*
 * public class FirstClass implements A {
 * 
 *  @Override
    public int getValue(){
        return 0;
    }

    @Override
    public void methodA(){
        System.out.println("Implements methodA"); 
    }
 * 
 * }
*/
