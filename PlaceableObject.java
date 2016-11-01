import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlaceableObject extends JFrame {

	private final int SIZE = 6; //size of each object
	
	private ArrayList<Point> gabionList;
	private ArrayList<Point> plantList;
	
	DrawPanel drawPanel = new DrawPanel();

	
	public PlaceableObject(){
		//need to override mouse clicked method,
		// then within that, call getPoint to return the loc of mouse.
		// need to check if that loc is within bounds of where we want gabs/plants
		// after loc is returned, need to add the object itself.
		
		gabionList = new ArrayList<Point>();
		plantList = new ArrayList<Point>();
		
		addMouseListener (new PlaceableListener());
		
		//setBackground(Color.white);
		//setPreferredSize(new Dimension(300,200));
		

		add(drawPanel);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	public void placeObject(){

	}
	



	
	private class PlaceableListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			gabionList.add(e.getPoint());
			repaint();
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
	private class DrawPanel extends JPanel{
		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.white);
			
			g.setColor(Color.yellow);
			
			for(Point gab : gabionList){
				g.fillOval(gab.x-15, gab.y-40, SIZE*2, SIZE*2);
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
	
	
	public static void main(String[] args){
		
		PlaceableObject p1 = new PlaceableObject();
	}
}
