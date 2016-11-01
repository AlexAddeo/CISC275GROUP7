import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class ClickableObject extends JFrame{
	
	
	private final int SIZE = 6;
	
	private ArrayList<ClickableOyster> oysterList;
	private ArrayList<ClickableSeed> seedList;
	
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	DrawPanel drawPanel = new DrawPanel();
	
	
	private ClickableOyster oyster;
	private ClickableSeed seed;
	private ClickableOyster oyster2;
	private ClickableSeed seed2;

	public ClickableObject(){
		
		oysterList = new ArrayList<ClickableOyster>();
		seedList = new ArrayList<ClickableSeed>();
		
		oyster = new ClickableOyster(100, 100);
		seed = new ClickableSeed(100, 50);
		oyster2 = new ClickableOyster(300, 150);
		seed2 = new ClickableSeed(200, 60);
		
		oysterList.add(oyster);
		seedList.add(seed);
		oysterList.add(oyster2);
		seedList.add(seed2);

		addMouseListener(new ClickableListener());
		
		add(drawPanel);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

		
		
	}
	
	public void clickedObject(Object o1){
		
		// need to have an array of objects that can be clicked..
		// where do i put this array?
		// within this method, need to check if getPoint in mouse
		// has the same location as an object that is stored in the array.
		// if so, then remove that object in the array. 
		// going to have to pass in an object i think and then
		// check to see waht type of object was clicked to know which 
		// object to remove.
		// have a certain amount on screen at first, then once a few clicked
		// spawn some more using random coordinate values
		
		if(o1 instanceof ClickableOyster){
			
		}
		
		if(o1 instanceof ClickableSeed){
			
		}
	}
	
private class DrawPanel extends JPanel{
	
		private Shape circle;

		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.white);
			
			g.setColor(Color.green);
			
			for(ClickableSeed seed : seedList){
				//g.fillOval(seed.xpos-15, seed.ypos-40, SIZE*2, SIZE*2);
				circle = new Ellipse2D.Double(seed.getX(),seed.getY(),50,50);
				Graphics2D g2d = (Graphics2D) g;
				g2d.draw(circle);
				shapes.add(circle);
			}
			
			g.setColor(Color.blue);
			
			for(ClickableOyster oyster : oysterList){
				g.fillOval(oyster.xpos-15, oyster.ypos-40, SIZE*2, SIZE*2);
			}
			

//			if(removeFromScreen == false && isColl == true){
//				g.setColor(interColor);
//				g.fillRect(interPos, getHeight()/2, 35, 35);
//				isColl = false;
//			}
//			if(removeFromScreen == false && isObst == true){
//				g.setColor(interColor);
//				g.fillArc(interPos, getHeight()/2, 45, 45, 0, 180);
//				isObst = false;
//			}
//			
		}
		
//		public void paintComponent(Graphics page){
//			super.paintComponent(page);
//			
//			page.setColor(Color.green);
//			
//			for(Point gab : gabionList){
//				page.fillOval(gab.x-SIZE, gab.y-SIZE, SIZE*2, SIZE*2);
//			}
//			
//			page.drawString("Count: " + gabionList.size(), 5, 15);
//		}

		public Dimension getPreferredSize() {
			return new Dimension(400, 200);
		}
		
	}


private class ClickableListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		//Point p = new Point(e.getPoint());
		
//		for(ClickableSeed seed : seedList){
//			
//			if(seed.getX() == e.getX() && seed.getY() == e.getY()){
//				seedList.remove(seed);
//			}
//		}
//		repaint();
//		
//		for(ClickableOyster oyster : oysterList){
//			
//			if(oyster.getX() == e.getX() && oyster.getY() == e.getY()){
//				oysterList.remove(oyster);
//			}
//		}
//		repaint();


		for (Shape s : shapes){
			if(s.contains(e.getPoint())){
				for(ClickableSeed seed : seedList){
					if(s.contains(seed.getX(),seed.getY())){
						//seedList.remove(seed);
						System.out.println("Congrats u found a seed");
					}
				}
				//shapes.remove(s);
				System.out.println("Congrats u found a circle");
			}
		}
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
	
	
	public static void main(String[] args){
		
		ClickableObject c1 = new ClickableObject();
	}
}
