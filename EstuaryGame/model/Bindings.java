package model;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;


public class Bindings extends JComponent{
	int obst;
	Model3 model;
	
	public Bindings(){
		bindKeyWith("trashbag", KeyStroke.getKeyStroke(KeyEvent.VK_T, 0), new useColl(0));
		bindKeyWith("chemicals", KeyStroke.getKeyStroke(KeyEvent.VK_C, 0), new useColl(1));
		bindKeyWith("seeds", KeyStroke.getKeyStroke(KeyEvent.VK_S, 0), new useColl(2));
		bindKeyWith("compost", KeyStroke.getKeyStroke(KeyEvent.VK_P, 0), new useColl(3));
	}
	
	protected void bindKeyWith(String name, KeyStroke keyStroke, Action action) {
		InputMap im = getInputMap(WHEN_FOCUSED);
		ActionMap am = getActionMap();
		
		im.put(keyStroke, name);
		am.put(name, action);
	}
	
	public void addModel(Model3 m){
		this.model = m;
	}
	
	public class useColl extends AbstractAction{
		int coll;
		public useColl(int collectable){
			coll = collectable;
			//System.out.println("hello");
		}
		@Override
		public void actionPerformed(ActionEvent e){
			obst = model.sendColor();
			boolean check = model.modelCheck(obst, coll);
			System.out.println(check);
		}
	}
}
