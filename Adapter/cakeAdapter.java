package Adapter;

public class cakeAdapter implements redVelvet{

	
	cake k; 
    public cakeAdapter(cake k) {
		// TODO Auto-generated constructor stub
    	this.k = k; 
	}
	
	@Override
	public void prices() {
		// TODO Auto-generated method stub
		k.price(); 
	} 
  
   

}
