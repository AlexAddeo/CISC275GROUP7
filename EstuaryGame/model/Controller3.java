package model;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.Action;
import javax.swing.AbstractAction;

public class Controller3 {
	Model3 model;
	View view;

	int obst;
	
	public void addModel(Model3 m){
		this.model = m;
	}
	
	public void addView(View v){
		this.view = v;
	}  
	
	public void initModel(int x){
		model.initC(x);
		model.setPosO(x);
		model.run();
	} 
}
