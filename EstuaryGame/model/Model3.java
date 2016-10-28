package model;
import java.util.*;
import java.util.Random;

public class Model3 extends java.util.Observable {

	boolean playing = true;
	int trashbCnt, hayCnt, seedCnt, compCnt = 0;
	CollectableObject trashb = new CollectableObject();
	CollectableObject hay = new CollectableObject();
	CollectableObject seed = new CollectableObject();
	CollectableObject comp = new CollectableObject();
	CollectableObject curr = new CollectableObject();
	People people = new People();
	DeadSoil deadsoil= new DeadSoil();
	EmptySoil emptysoil = new EmptySoil();
	Chemicals chemicals = new Chemicals();
	Obstacle currO;
	Random randI = new Random();
	Random randC = new Random();
	int n, m;
	int collectablePos;
	int obstPos;
	CollectableObject[] collObjs = {trashb, hay, seed, comp};
	Obstacle[]obstObjs = {people, chemicals, emptysoil, deadsoil};
	//boolean change = false;
	boolean useTrashb, useSeeds, useComp, useHay = false;
	
	public void setPosC(int x){
		n = randC.nextInt(4);
		curr = collObjs[n];
		curr.xpos = x;
		collectablePos = x;
	}
	
	public void setPosO(int x){
		n = randC.nextInt(4);
		currO = obstObjs[n];
		currO.xpos = x;
		obstPos = x;
	}
	
	public int sendPosC(){
		return curr.xpos;
	}
	public int sendPosO(){
		return currO.xpos;
	}
	public int sendColor(){
		return n;
	}
	public int sendInter(){
		return m;
	}
	public void changePosC() {
		while(curr.xpos >= 9){
			curr.xpos -= 10;
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
	public void changePosO() {
		while(currO.xpos >= 9){
			currO.xpos -= 10;
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
	
	public void run(){
		while(playing == true){
			if(!(useTrashb && useHay && useSeeds && useComp)){
				changePosC();
				if (n == 0){
					trashbCnt += 1;
					useTrashb = true;
				}
				else if(n == 1){
					hayCnt += 1;
					useHay = true;
				}
				else if(n == 2){
					seedCnt += 1;
					useSeeds = true;
				}
				else{
					compCnt += 1;
					useComp = true;
				}
				System.out.println("Trashbag = " + trashbCnt + ", Hay = " + hayCnt + ", Seeds = " + seedCnt + ", Compost = " + compCnt);
				setPosC(collectablePos);
				setChanged();
				notifyObservers();
			}
			else{
				m = randI.nextInt() % 2;
				if(m == 0){
					changePosC();
					if (n == 0){
						trashbCnt += 1;
						useTrashb = true;
					}
					else if(n == 1){
						hayCnt += 1;
						useHay = true;
					}
					else if(n == 2){
						seedCnt += 1;
						useSeeds = true;
					}
					else{
						compCnt += 1;
						useComp = true;
					}
					System.out.println("Trashbag = " + trashbCnt + ", Hay = " + hayCnt + ", Seeds = " + seedCnt + ", Compost = " + compCnt);
					setPosC(collectablePos);
					setChanged();
					notifyObservers();
				}
				if(m == 1){
					changePosO();
					setPosO(obstPos);
					setChanged();
					notifyObservers();
				}
				
			}
		}
		
	}
}
