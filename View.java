import java.awt.*;
import javax.swing.*;

import java.math.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;		//for update();
import java.awt.event.ActionListener;	//for addController()

public class View extends JFrame implements java.util.Observer{
private static final long serialVersionUID = 1L;

	
	private final int SIZE = 6; //size of each object

	private ArrayList<Point> gabionList;
	private ArrayList<Point> plantList;
	
	private ArrayList<ClickableOyster> oysterList;
	private ArrayList<ClickableSeed> seedList;
	
	DrawPanel drawPanel = new DrawPanel();
	
	private ClickableOyster oyster;
	private ClickableSeed seed;
	private ClickableOyster oyster2;
	private ClickableSeed seed2;
	
	public View(){
		
		gabionList = new ArrayList<Point>();
		plantList = new ArrayList<Point>();
		
		addMouseListener (new PlaceableListener());
		
		
		oysterList = new ArrayList<ClickableOyster>();
		seedList = new ArrayList<ClickableSeed>();
		
		oyster = new ClickableOyster(100, 100);
		seed = new ClickableSeed(150, 50);
		oyster2 = new ClickableOyster(300, 150);
		seed2 = new ClickableSeed(200, 60);
		
		oysterList.add(oyster);
		seedList.add(seed);
		oysterList.add(oyster2);
		seedList.add(seed2);

		addMouseListener(new ClickableListener());
		
		setBackground(Color.white);

		add(drawPanel);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	
	private class DrawPanel extends JPanel{
	
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			g.setColor(Color.green);
			
			for(ClickableSeed seed : seedList){
				g.fillOval(seed.xpos-15, seed.ypos-40, SIZE*2, SIZE*2);
			}
			
			g.setColor(Color.blue);
			
			for(ClickableOyster oyster : oysterList){
				g.fillOval(oyster.xpos-15, oyster.ypos-40, SIZE*2, SIZE*2);
			}
			
			
			g.setColor(Color.yellow);
			
			for(Point gab : gabionList){
				g.fillOval(gab.x-15, gab.y-40, SIZE*2, SIZE*2);
			}
			

			
		}
		public Dimension getPreferredSize() {
			return new Dimension(400, 200);
		}
		
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
			
			for(ClickableSeed seed : seedList){
				
				if(seed.getX() == e.getX() && seed.getY() == e.getY()){
					seedList.remove(seed);
				}
			}
			repaint();
			
			for(ClickableOyster oyster : oysterList){
				
				if(oyster.getX() == e.getX() && oyster.getY() == e.getY()){
					oysterList.remove(oyster);
				}
			}
			repaint();

//			Iterator<ClickableOyster> oysterIter = oysterList.iterator();
//			Iterator<ClickableSeed> seedIter = seedList.iterator();
//			
//			while(seedIter.hasNext() || oysterIter.hasNext()){
//				if(seed.getX() == e.getX() && seed.getY() == e.getY())
//				seedList.remove(seed);
//				
//				if(oyster.getX() == e.getX() && oyster.getY() == e.getY())
//					oysterList.remove(oyster);
//			}
	//
//			repaint();
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	public void addModel(Model myModel) {
		// TODO Auto-generated method stub
		
	}

	
}