package model;
import java.awt.*;
import javax.swing.*;
import java.math.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Observable;		//for update();
import java.awt.event.ActionListener;	//for addController()

public class View extends JFrame implements java.util.Observer{
private static final long serialVersionUID = 1L;

	
	DrawPanel drawPanel = new DrawPanel();
	int collectablePos;
	Model3 model;
	
	//private Character player = new Character(getWidth()-375, getHeight()/2);
//	private boolean buttonPressed = false;
//	int squareColorIndex = 0;
	boolean active = true;
	
//	Color[] colorArray = generateColorArray();
//	//Static circle color gets randomly chosen from the array
//	Color randCircleColor = colorArray[(int)(Math.random() * ((colorArray.length -1)))];
//	
	/**
	 * Function that returns what button is pressed.
	 */
//	public boolean getButtonPressed(){
//		return buttonPressed;
//	}
	
	/**
	 * Function that sets the button pressed boolean.
	 * @param b
	 */
//	public void setButtonPressed(Boolean b){
//		this.buttonPressed = b;
//	}
//	
//	 Color[] generateColorArray(){
//		ArrayList<Color> c = new ArrayList<Color>();
//		for(int r = 0; r < 100; r++){
//			c.add(new Color(r*255/100,255,0));
//		}
//		for (int g=100; g>0; g--){
//			c.add(new Color(255, g*255/100,0));
//		}
//		for (int b=0; b<100; b++){
//			c.add(new Color(255,0, b*255/100));
//		}
//		for (int r=100; r>0; r--){
//			c.add(new Color(r*255/100,0,255));
//		}
//		for (int g=0; g<100; g++){
//			c.add(new Color(0,g*255/100,255));
//		}
//		for (int b=100; b>0; b--){
//			c.add(new Color(0,255, b*255/100));
//			//brings it back to green (0,255,0)
//            c.add(new Color(0,255,0));
//		}
//		Color[] cArray = c.toArray(new Color[c.size()]);
//		return cArray;
//		
//	}
	
	/**
	 * 
	 */
	
	public View(){
//		JButton b3 = new JButton("CLOSE");
//
//		b3.
//		add(b3);

		
		Action rightAction = new AbstractAction(){
			public void actionPerformed(ActionEvent e){
				//System.out.println("buttonPressed set to true");
				//int i = 0;
				while(active){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println("in while loop");
					
					//squareColorIndex = (squareColorIndex+10) % colorArray.length;
					drawPanel.repaint();
					
					
				}
				//active = !active;
				
			}
		};
		
		InputMap inputMap = drawPanel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
		ActionMap actionMap = drawPanel.getActionMap();

		inputMap.put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
		actionMap.put("rightAction", rightAction);

		add(drawPanel);

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//startGradient(); //please
	}
	
	public void update(Observable obs, Object obj){
		System.out.println(collectablePos);
		collectablePos = model.sendPos();
		drawPanel.repaint();
	}
	
	public void startGradient(){
		while(active){
			//squareColorIndex++;
			drawPanel.repaint();
			
		}
	}
	
	
	private class DrawPanel extends JPanel{
	
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.white);
			g.fillRect(0, 0, getWidth(), getHeight());
			g.setColor(Color.blue);
			g.fillOval(getWidth()-375, getHeight()/2, 50, 35);
			g.setColor(Color.black);
			g.fillRect(getWidth()-375, getHeight()-50, getWidth(), 5);
			g.fillRect(collectablePos, getHeight()/2, 45, 45);
			
		}
		public Dimension getPreferredSize() {
			return new Dimension(400, 200);
		}
		
	}
	
	
	public void addModel(Model3 mod){
		this.model = mod;
	}
	
//	/**Start Button */
//	class ButtonFrame extends JFrame
//	{
//	  JButton bChange ; // reference to the button object
//
//	  // constructor for ButtonFrame
//	  ButtonFrame(String title) 
//	  {
//	    super( title );                     // invoke the JFrame constructor
//	    setLayout( new FlowLayout() );      // set the layout manager
//
//	    bChange = new JButton("Click Me!"); // construct a JButton
//	    add( bChange );                     // add the button to the JFrame
//	    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
//	  }
//	}

	
	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable(){
//			public void run(){
//				new View();
//			}
//		});
//	}
	
}