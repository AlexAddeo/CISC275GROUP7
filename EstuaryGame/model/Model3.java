package model;
import java.util.*;
public class Model3 extends java.util.Observable {
	//static boolean playing;
	int trashbCnt, hayCnt, seedCnt, compCnt;
	//CollectableObject trashb, hay, seed, comp;
	CollectableObject trashb = new CollectableObject();
	//trashb = new CollectbleObject();
	
	public void setPos(int x){
		trashb.xpos = x;
	}
	
	public int sendPos(){
		return trashb.xpos;
	}
	public void changePos() {
		//playing = true;
		while(trashb.xpos > 0){
			trashb.xpos -= 7;
			setChanged();
			notifyObservers();
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
