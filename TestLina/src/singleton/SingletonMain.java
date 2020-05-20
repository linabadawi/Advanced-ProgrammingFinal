package singleton;

public class SingletonMain {
	public static void main(String[] args) {
		 //illegal construct
	      //Compile Time Error: The constructor SingletonClass() is not visible
	      //SingletonClass object = new SingletonClass();

	      //Get the only object available
		SingletonClass object = SingletonClass.getInstance();

	      //show the message
	      object.showMessage();
	     
	}

}
