package Template;

public class Tennis extends TemplateClass {
	@Override
	   void endPlay() {
	      System.out.println("Tennis Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("Tennis Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("Tennis Game Started. Enjoy the game!");
	   }

}
