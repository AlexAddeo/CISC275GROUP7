package model;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class StartScreen extends JComponent{
	/**
	 * This is the main for the start screen.
	 */
	public static void main(String args[]){
	JFrame frame = new JFrame("Mainframe");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);
    frame.setFocusable(true);
    frame.getContentPane().setBackground(Color.WHITE);
    JButton start=new JButton("Press to start");
    ActionListener listener = new StartButtonListener();
    start.addActionListener(listener);
    frame.add(start);
    frame.setVisible(true);
	}
	/**
	 * This calls game 1.
	 */
	public static void startgame(){
		//Game1.start();
	}
}

class StartButtonListener implements ActionListener{
	
	/**
	 * This creates an action listener for the button.
	 * @param Actionevent E
	 */
	public void actionPerformed(ActionEvent e) {
		StartScreen.startgame();
	}
	
}
