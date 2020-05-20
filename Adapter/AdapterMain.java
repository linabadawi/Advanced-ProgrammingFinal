package Adapter
;

public class AdapterMain {
	public static void main(String args[]) 
    { 
        ButterCake b= new ButterCake();
        cake ck = new ButterCake(); 
  
        // Wrap a bird in a birdAdapter so that it  
        // behaves like toy duck 
        redVelvet t = new cakeAdapter(b); 
  
       System.out.println("ButterCake..."); 
        b.price(); 
        b.falvor(); 
  
      System.out.println("redVelvet..."); 
       ck.price(); 
  
        // toy duck behaving like a bird  
       System.out.println("cakeAdapter..."); 
       t.prices();
    } 
}
