

public class Controller implements java.awt.event.ActionListener{
	Model model;
	View view;
	
	public void actionPerformed(java.awt.event.ActionEvent e){
		System.out.println("Controller: acting on Model");
		model.changePosC();
	} 
	
	public void addModel(Model m){
		this.model = m;
	}
	
	public void addView(View v){
		this.view = v;
	}  
	
	public void initModel(int x){
		model.setPosC(x);
		model.setPosO(x);
	} 
}