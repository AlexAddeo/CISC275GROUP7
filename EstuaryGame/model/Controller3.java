package model;

public class Controller3 implements java.awt.event.ActionListener{
	Model3 model;
	View view;
	
	public void actionPerformed(java.awt.event.ActionEvent e){
		System.out.println("Controller: acting on Model");
		model.changePos();
	} 
	
	public void addModel(Model3 m){
		this.model = m;
	}
	
	public void addView(View v){
		this.view = v;
	}  
	
	public void initModel(int x){
		model.setPos(x);
	} 
}
