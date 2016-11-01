package model;

import javax.swing.JFrame;

public class Game3 extends JFrame {
	int s = 600;
	public Game3(){
		Model3 myModel = new Model3();
		View myView = new View();
		myModel.addObserver(myView);
		Controller3 myController = new Controller3();
		myController.addModel(myModel);
		myController.addView(myView);
		myView.addModel(myModel);
		myController.initModel(s);
	}
	
	public static void main(String[] args){
		Game3 run = new Game3();
	}
	
}

