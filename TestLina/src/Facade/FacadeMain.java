package Facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadeMain {
 
	 private static int  choice;  
	    public static void main(String args[]) throws NumberFormatException, IOException{  
	        do{       
	            System.out.print("========= gardenia Bakery ============ \n");  
	            System.out.print("            1. Cakes.              \n");  
	            System.out.print("            2. Coffee.              \n");  
	            System.out.print("            3. doughnuts.            \n");  
	            System.out.print("            4. Exit.                     \n");  
	            System.out.print("Enter your choice: ");  
	              
	            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	            choice=Integer.parseInt(br.readLine());  
	            BakeryKeeper Bk=new BakeryKeeper();  
	              
	            switch (choice) {  
	            case 1:  
	                {   
	                  Bk.cakesSale();  
	                    }  
	                break;  
	       case 2:  
	                {  
	                  Bk.coffeeSale();      
	                    }  
	                break;    
	       case 3:  
	                           {  
	                           Bk.doughnutsSale();     
	                           }  
	                   break;     
	            default:  
	            {    
	                System.out.println("Nothing You purchased");  
	            }         
	                return;  
	            }  
	              
	      }while(choice!=4);  
	   }  
}
