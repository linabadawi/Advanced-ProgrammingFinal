package strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyMain {
  public static void main(String[] args) throws NumberFormatException, IOException {  
          
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
          System.out.print("Enter the first value: ");  
          float value1=Float.parseFloat(br.readLine());  
          System.out.print("Enter the second value: ");  
          float value2=Float.parseFloat(br.readLine());  
          Context context = new Context(new AreaOfRectangle()); 
          
          System.out.println("Rectangle = " + context.executeStrategy(value1, value2));  
  
         
          Context context1 = new Context(new AreaofTriangle());     
          
          System.out.println("Triangle = " + context1.executeStrategy(value1, value2));  
       }  
}
