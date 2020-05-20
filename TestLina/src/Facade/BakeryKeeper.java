package Facade;

public class BakeryKeeper {
	 private gardeniaBakery cakes;  
	    private gardeniaBakery coffee;  
	    private gardeniaBakery doughnuts;  
	      
	    public BakeryKeeper() { 
	       cakes= new Cakes();  
	        coffee=new Coffee();  
	        doughnuts=new Doughnuts();  
	    }  
	    public void cakesSale(){  
	        cakes.types();;  
	        cakes.price();  
	    }  
	        public void coffeeSale(){  
	        coffee.types();  
	        coffee.price();  
	    }  
	   public void doughnutsSale(){  
	   doughnuts.types();  
	    doughnuts.price();  
	        }  
}
