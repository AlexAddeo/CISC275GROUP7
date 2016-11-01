package model;
import java.util.*;
import java.util.Random;

public class Model3 extends java.util.Observable {

	boolean playing = true;
	int trashbCnt = 0, hayCnt = 0, seedCnt = 0, compCnt = 0;
	CollectableObject trashb = new CollectableObject();
	CollectableObject hay = new CollectableObject();
	CollectableObject seed = new CollectableObject();
	CollectableObject comp = new CollectableObject();
	CollectableObject currC1 = new CollectableObject();
	CollectableObject animal = new CollectableObject();
	People people = new People();
	DeadSoil deadsoil= new DeadSoil();
	EmptySoil emptysoil = new EmptySoil();
	Chemicals chemicals = new Chemicals();
	Obstacle currO;
	Random randI = new Random();
	Random randC = new Random();
	Random randY = new Random();
	int n, m, y;
	int collectablePos;
	int obstPos;
	CollectableObject[] collObjs = {trashb, hay, seed, comp, animal};
	Obstacle[]obstObjs = {people, chemicals, emptysoil, deadsoil};
	boolean useTrashb, useSeeds, useComp, useHay;
	boolean correctItem = false;
	BlueCrab bc = new BlueCrab(10, 200);
	int health = 10;
	int corrObst = 0;
	boolean win;
	
	public void initC(int x){
		n = randC.nextInt(5);
		currC1 = collObjs[n];
		collectablePos = x;
		currC1.xpos = collectablePos;
		currC1.ypos = 200;
	}
	public void setPosC(){
		n = randC.nextInt(5);
		currC1 = collObjs[n];
		currC1.xpos = collectablePos;
		y = randY.nextInt(3);
		if(y == 0){
			currC1.ypos = 200;
		}
		else if(y == 1){
			currC1.ypos = 100;
		}
		else{
			currC1.ypos = 50;
		}
	}
	
	public void setPosCY(){
		currC1.ypos = 200;
	}
	
	public void setPosO(int x){
		n = randI.nextInt(4);
		currO = obstObjs[n];
		currO.xpos = x;
		currO.ypos = 200;
		obstPos = x;
	}
	
	public void setPosCharX(int x){
		bc.xpos = x;
	}
	
	public void setPosCharY(int y){
		bc.ypos = y;
	}
	
	public void sendColl(){
		while(currC1.xpos > 9){
			currC1.changePosC();
			setChanged();
			notifyObservers();
			try{
				Thread.sleep(10);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		if ((n == 0) && (Math.abs(currC1.xpos-bc.xpos)<=10) && (Math.abs(currC1.ypos-bc.ypos)<=10)){
			trashbCnt += 1;
			useTrashb = true;
		}
		else if((n == 1) && (Math.abs(currC1.xpos-bc.xpos)<=10) && (Math.abs(currC1.ypos-bc.ypos)<=10)){
			hayCnt += 1;
			useHay = true;
		}
		else if((n == 2) && (Math.abs(currC1.xpos-bc.xpos)<=10) && (Math.abs(currC1.ypos-bc.ypos)<=10)){
			seedCnt += 1;
			useSeeds = true;
		}
		else if ((n == 3) && (Math.abs(currC1.xpos-bc.xpos)<=10) && (Math.abs(currC1.ypos-bc.ypos)<=10)){
			compCnt += 1;
			useComp = true;
		}
		else if ((n == 4) && (Math.abs(currC1.xpos-bc.xpos)<=10) && (Math.abs(currC1.ypos-bc.ypos)<=10)){
			health -= 2;
		}
		else{
			
		}
		setPosC();
		setChanged();
		notifyObservers();
		//System.out.println("t: " + trashbCnt + "h: " + hayCnt + "s: " + seedCnt + "c: " + compCnt);
	}

	public void run(){
		while(playing == true){
			if(health == 0){
				playing = false;
				win = false;
				setChanged();
				notifyObservers();
			}
			else if(corrObst == 7){
				playing = false;
				win = true;
				setChanged();
				notifyObservers();
			}
			else if(!(useTrashb && useHay && useSeeds && useComp)){
				sendColl();
			}
			else{
				m = randI.nextInt() % 2;
				if(m == 0){
					sendColl();
				}
				if(m == 1){
					while(currO.xpos >= 11){
						currO.changePosO();
						setChanged();
						notifyObservers();
						try{
							Thread.sleep(10);
						}
						catch(InterruptedException e){
							e.printStackTrace();
						}
					}
					while(correctItem == false){
						System.out.print("");
					}
					correctItem = false;
					setPosO(obstPos);
					setChanged();
					notifyObservers();
				}
			}
		}	
	}
	
	public boolean modelCheck(int obst, int coll){
		boolean check;
		if(obst == 0){
			if(trashbCnt == 0){
				System.out.println("can't pass this obstacle, lose health");
				check = true;
			}
			else{
				check = people.checkItem(coll);
			}
		}
		else if(obst == 1){
			if(hayCnt == 0){
				System.out.println("can't pass this obstacle, lose health");
				check = true;
			}
			else{
				check = chemicals.checkItem(coll);
			}
		}
		else if(obst == 2){
			if(seedCnt == 0){
				System.out.println("can't pass this obstacle, lose health");
				check = true;
			}
			else{
				check = emptysoil.checkItem(coll);
			}
		}
		else{
			if(compCnt == 0){
				System.out.println("can't pass this obstacle, lose health");
				check = true;
			}
			else{
				check = deadsoil.checkItem(coll);
			}
		}
		if(check == false){
			health -= 2;
			setChanged();
			notifyObservers();
		}
		else{
			health ++;
			corrObst += 1;
			setChanged();
			notifyObservers();
		}
		if(coll == 0){
			if(trashbCnt != 0){
				trashbCnt -= 1;
			}
			else{
				System.out.println("Ran out of trash bags and can't use them!");
				useTrashb = false;
			}
		}
		else if(coll == 1){
			if(hayCnt != 0){
				hayCnt -= 1;
			}
			else{
				System.out.println("Ran out of hay and can't use them!");
				useHay = false;
			}
		}
		else if(coll == 2){
			if(seedCnt != 0){
				seedCnt -= 1;
			}
			else{
				useSeeds = false;
				System.out.println("Ran out of seeds and can't use them!");
			}
		}
		else{
			if(compCnt != 0){
				compCnt -= 1;
			}
			else{
				useComp = false;
				System.out.println("Ran out of compost and can't use them!");
			}
		}
		return check;
	}
	
	public void modelJump(){
		bc.jump();
		setChanged();
		notifyObservers();
	}
	
	public void modelunJump(){
		bc.unjump();
		setChanged();
		notifyObservers();
	}
}
