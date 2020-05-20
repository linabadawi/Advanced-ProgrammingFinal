package singleton;

public class SingletonClass {
	//create an object of SingletonClass
	   private static SingletonClass instance = new SingletonClass();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingletonClass(){}

	   //Get the only object available
	   public static SingletonClass getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Lina_Badawi");
	   }
	   
	  


}
