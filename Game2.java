
import java.util.Observer;

public class Game2 {
	int s = 400;
	public Game2(){
		Model myModel = new Model();
		View myView = new View();
		myModel.addObserver(myView);
		Controller myController = new Controller();
		myController.addModel(myModel);
		myController.addView(myView);
		//myView.addController(myController);
		myView.addModel(myModel);
		myController.initModel(s);
		myModel.run();
		
	}
	
	public static void main(String[] args){
		Game2 run = new Game2();
	}
	
}