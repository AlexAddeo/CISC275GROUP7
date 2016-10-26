package model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * End Screen
 * @author Nick Hoffman
 *
 */
public class EndScreen {
	/**
	 * This is the main for the end screen.
	 */
	public static void main(String args[]) {
		JFrame frame = new JFrame("Mainframe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setFocusable(true);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setVisible(true);
		// We should have different end screens depending if the player saved the estuary
	}
	/**
	 * This will start a new game.
	 */
	public static void restartgame() {
	}
}
