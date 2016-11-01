package model;
import java.awt.*;
import javax.swing.*;

import model.Bindings.useColl;

import java.math.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Observable;		//for update();
import java.awt.event.ActionListener;	//for addController()

public class View extends JFrame implements java.util.Observer{
private static final long serialVersionUID = 1L;

	DrawPanel drawPanel = new DrawPanel();
	int characterPosX;
	int characterPosY;
	Color interColor;
	int colorNum;
	int interPosX;
	int interPosY;
	Model3 model;
	boolean isColl = false;
	boolean isObst = false;
	int interType;
	boolean active = true;
	boolean check = true;
	
	public View(){
		JFrame frame = new JFrame("Game 3");
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.add( drawPanel );
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setVisible(true);
	}
	
	public void update(Observable obs, Object obj){
		colorNum = model.n;
		interType = model.m;
		characterPosX = model.bc.xpos;
		characterPosY = model.bc.ypos;
		if (interType == 0){
			interPosX = model.currC1.xpos;
			interPosY = model.currC1.ypos;
			isColl = true;
		}
		else{
			interPosX = model.currO.xpos;
			interPosY = model.currO.ypos;
			if(colorNum == 4){
				colorNum -= 1;
			}
			isObst = true;
		}
		if(colorNum == 0){
			interColor = Color.black;
		}
		else if(colorNum == 1){
			interColor = Color.yellow;
		}
		else if(colorNum == 2){
			interColor = Color.GREEN;
		}
		else if(colorNum == 3){
			interColor = Color.red;
		}
		else{
			interColor = Color.gray;
		}
		drawPanel.repaint();
	}

	private class DrawPanel extends JPanel{
		int obst;
		
		public DrawPanel(){
			bindKeyWith("trashbag", KeyStroke.getKeyStroke(KeyEvent.VK_T, 0), new useColl(0));
			bindKeyWith("hay", KeyStroke.getKeyStroke(KeyEvent.VK_H, 0), new useColl(1));
			bindKeyWith("seeds", KeyStroke.getKeyStroke(KeyEvent.VK_S, 0), new useColl(2));
			bindKeyWith("compost", KeyStroke.getKeyStroke(KeyEvent.VK_C, 0), new useColl(3));
			bindKeyWith("jump", KeyStroke.getKeyStroke("UP"), new jump());
			bindKeyWith("unjump", KeyStroke.getKeyStroke("DOWN"), new unjump());
		}
		
		protected void bindKeyWith(String name, KeyStroke keyStroke, Action action) {
			InputMap im = getInputMap(WHEN_FOCUSED);
			ActionMap am = getActionMap();
			im.put(keyStroke, name);
			am.put(name, action);
		}
		
		public class useColl extends AbstractAction{
			int coll;
			public useColl(int collectable){
				coll = collectable;
			}
			@Override
			public void actionPerformed(ActionEvent e){
				obst = model.n;
				check = model.modelCheck(obst, coll);
				model.correctItem = check;
				drawPanel.repaint();
			}
		}
		
		public class jump extends AbstractAction{
			@Override
			public void actionPerformed(ActionEvent e){
				model.modelJump();
			}
		}
		
		public class unjump extends AbstractAction{
			@Override
			public void actionPerformed(ActionEvent e){
				model.modelunJump();
			}
		}
		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.white);
			g.fillRect(0, 0, getWidth(), getHeight());
			g.setColor(Color.blue);
			g.fillOval(characterPosX, characterPosY, 55, 40);
			if(isColl == true){
				g.setColor(interColor);
				g.fillRect(interPosX, interPosY, 35, 35);
				isColl = false;
			}
			if(isObst == true){
				g.setColor(interColor);
				g.fillOval(interPosX, interPosY, 35, 35);
				g.setColor(Color.black);
				g.drawString("You have come across an obstacle. what item should you use?", 10,55);
				isObst = false;
			}
			g.setColor(Color.black);
			if(interPosY != 200){
				g.drawLine(interPosX-10, interPosY+40, interPosX+45, interPosY+40);
				g.drawLine(0, 240, interPosX-10, 240);
				g.drawLine(interPosX+45, 240, 600, 240);
			}
			else{
				g.drawLine(0, 240, 600, 240);
			}
//			if(isObst == true){
//				String text;
//				if(colorNum == 0){
//					text = "You have come across a group of people, what item should you use?";
//				}
//				else if(colorNum == 1){
//					text = "You have come across runoff and chemicals, what item should you use?";
//				}
//				else if(colorNum == 2){
//					text = "You have come across a patch of empty soil, what item should you use?";
//				}
//				else{
//					text = "You have come across a patch of dead plants, what item should you use?";
//				}
//				g.drawString(text, 10, 55);
//			}
			g.setColor(Color.gray);
			g.fillRect(350, 0, 12, 12);
			g.setColor(Color.black);
			g.fillRect(10, 0, 12, 12);
			g.drawString("Trashbag = " + model.trashbCnt + ", ", 25, 10);
			g.drawString("Hay = " + model.hayCnt + ", ", 125, 10);
			g.drawString("Seeds = " + model.seedCnt + ", ", 190, 10);
			g.drawString("Compost = " + model.compCnt + ", ", 270, 10);
			g.drawString("Health: " + model.health, 10, 25);
			g.drawString("People", 500, 10);
			g.drawString("Runoff/Chemicals", 500, 30);
			g.drawString("Empty Soil", 500, 50);
			g.drawString("Dead Soil", 500, 70);
			g.drawString("Animals", 365, 10);
			g.fillOval(480, 0, 12, 12);
			g.setColor(Color.yellow);
			g.fillRect(110, 0, 12, 12);
			g.fillOval(480, 20, 12, 12);
			g.setColor(Color.green);
			g.fillRect(175, 0, 12, 12);
			g.fillOval(480, 40, 12, 12);
			g.setColor(Color.red);
			g.fillRect(255, 0, 12, 12);
			g.fillOval(480, 60, 12, 12);
			if(check == false){
				g.drawString("Incorrect item used, health decreased. Try Again.", 10, 40);
				check = true;
			}
			if(model.win == true && model.corrObst == 7){
				g.drawString("Congratulations! You saved the estuary!", 100, 100);
			}
			else if(model.win == false && model.health == 0){
				g.drawString("The health has fallen too low and the estuary cannot be saved. Try again?", 100, 100);
			}
			else{
				
			}
		}
		public Dimension getPreferredSize() {
			return new Dimension(600, 300);
		}
		
	}
	
	public void addModel(Model3 mod){
		this.model = mod;
		characterPosX = model.bc.xpos;
		characterPosY = model.bc.ypos;
	}
	
}
