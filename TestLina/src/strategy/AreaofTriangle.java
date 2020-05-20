package strategy;

public class AreaofTriangle implements Strategy{

	@Override
	public float calculation(float height , float width) {
		// TODO Auto-generated method stub
		  return (1/2 )*height * width ;
	}

}
