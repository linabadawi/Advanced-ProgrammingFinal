package strategy;


//Create a Context class that will ask from Startegy interface to execute the type of strategy.
public class Context {
	 private Strategy strategy;  
     
     public Context(Strategy strategy){  
        this.strategy = strategy;  
     }  

     public float executeStrategy(float height, float width){  
        return strategy.calculation(height, width);  
     }  
}
