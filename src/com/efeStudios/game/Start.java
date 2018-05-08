package com.efeStudios.game;

public class Start {
	public static void main(String[] args) {
		Game g = new Game();
		for(int i=0;i<2;i++) {
			g.addNewNumber(); 		
		}
		g.printArray();
		for(int j=0;j<3;j++) {			
		g.pushLeft();
		g.printArray();
		g.addNewNumber();
		g.printArray();
		g.pushRight();
		g.printArray();
		g.addNewNumber();
		g.printArray();
		g.pushDown();
		g.printArray();
		g.addNewNumber();
		g.printArray();
		g.pushUp();
		g.printArray();
		g.pushRight();
		g.printArray();
		g.pushDown();
		g.printArray();
		g.pushRight();
		g.printArray();
		g.pushRight();
		g.printArray();
		g.pushRight();
		g.printArray();
		g.pushRight();
		g.printArray();
		g.addNewNumber();
		g.printArray();
		g.pushRight();
		g.printArray();
		g.addNewNumber();
		g.printArray();
		g.pushRight();
		g.printArray();
		g.addNewNumber();
		g.printArray();
		g.addNewNumber();
		g.printArray();
		g.addNewNumber();
		g.printArray();
		g.pushRight();
		g.printArray();
		g.pushRight();
		g.printArray();
		}
	}
}
