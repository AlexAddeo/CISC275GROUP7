package model;

import java.util.Observer;

public class Game3 {
	int s = 400;
	public Game3(){
		Model3 myModel = new Model3();
		View myView = new View();
		myModel.addObserver(myView);
		Controller3 myController = new Controller3();
		myController.addModel(myModel);
		myController.addView(myView);
		//myView.addController(myController);
		myView.addModel(myModel);
		myController.initModel(s);
		myModel.run();
		
	}
	
	public static void main(String[] args){
		Game3 run = new Game3();
	}
	
}

