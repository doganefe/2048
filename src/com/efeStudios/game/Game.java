package com.efeStudios.game;

import java.util.ArrayList;
import java.util.Random;

public class Game {
private int[][] gameBoard;
Random r = new Random();


public Game() {
	gameBoard = new int[5][5];
}

public void printArray() {
	for(int[] x:gameBoard) {
		System.out.format("%6d%6d%6d%6d%6d\n",x[0],x[1],x[2],x[3],x[4]);
	}
	System.out.format("\n");
}
public void addNewNumber() {
	System.out.println("Adding new number");
	ArrayList<Integer> emptySpacesX = new ArrayList<Integer>();
	ArrayList<Integer> emptySpacesY = new ArrayList<Integer>();
	for(int x=0;x<5;x++) {
		for(int y=0;y<5;y++) {
			if(gameBoard[x][y]==0) {
				emptySpacesX.add(new Integer(x));
				emptySpacesY.add(new Integer(y));
				}
			}
		}	
	int choice = r.nextInt(emptySpacesX.size());
	int numberChooser = r.nextInt(10);
	int newNumber = 2;
	if(numberChooser == 0) {
		newNumber = 4;
	}
	int X = emptySpacesX.get(choice);
	int Y = emptySpacesY.get(choice);
	gameBoard[X][Y] = newNumber; 
}
public void pushUp( ) {
	System.out.println("Pushing up...");
	boolean[][] alreadyCombined = {{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false}};
	for(int y=0;y<5;y++) {
		for(int x=1;x<5;x++) {
			while(gameBoard[x][y]!=0) {
				int value = gameBoard[x][y];
				int X = x-1;
				while(X >= 0 && gameBoard[X][y] == 0) {
					X--;
				}
				if(X ==-1) {
					gameBoard[0][y] = value;
					gameBoard[x][y] = 0;
				}
				else if(gameBoard[X][y]!=value && x-X != 1) {
					gameBoard[X+1][y] = value;
					gameBoard[x][y] =0;

				}
				else if(gameBoard[X][y]!=value) {
					break;
				}
				else	{
					if(alreadyCombined[X][y]) {
						gameBoard[X+1][y] = value;
						gameBoard[x][y] = 0;
					}
					else {
						gameBoard[X][y] *= 2;
						alreadyCombined[X][y]=true;
						gameBoard[x][y] = 0;
					}
				}			
			}						
		}
	}		
}
public void pushDown( ) {
	System.out.println("Pushing down...");
	boolean[][] alreadyCombined = {{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false}};
	for(int y=0;y<5;y++) {
		for(int x=3;x>-1;x--) {
			while(gameBoard[x][y]!=0) {
				int value = gameBoard[x][y];
				int X = x+1;
				while(X <= 4 && gameBoard[X][y] == 0) {
					X++;
				}
				if(X ==5) {
					gameBoard[4][y] = value;
					gameBoard[x][y] = 0;
				}
				else if(gameBoard[X][y]!=value && X-x != 1) {
					gameBoard[X-1][y] = value;
					gameBoard[x][y] = 0;

				}
				else if(gameBoard[X][y]!=value) {
					break;
				}
				else	{
					if(alreadyCombined[X][y]) {
						gameBoard[X-1][y] = value;
						gameBoard[x][y] = 0;
					}
					else {
						gameBoard[X][y] *= 2;
						alreadyCombined[X][y]=true;
						gameBoard[x][y] = 0;
					}
				}			
			}						
		}
	}		
}
public void pushLeft() {
	System.out.println("Pushing left...");
	boolean[][] alreadyCombined = {{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false}};
	for(int x=0;x<5;x++) {
		for(int y=1;y<5;y++) {
			while(gameBoard[x][y]!=0) {
				int value = gameBoard[x][y];
				int Y = y-1;
				while(Y >= 0 && gameBoard[x][Y] == 0) {
					Y--;
				}
				if(Y ==-1) {
					gameBoard[x][0] = value;
					gameBoard[x][y] = 0;
				}
				else if(gameBoard[x][Y]!=value && y-Y != 1) {
					gameBoard[x][Y+1] = value;
					gameBoard[x][y] =0;

				}
				else if(gameBoard[x][Y]!=value) {
					break;
				}
				else	{
					if(alreadyCombined[x][Y]) {
						gameBoard[x][Y+1] = value;
						gameBoard[x][y] = 0;
					}
					else {
						gameBoard[x][Y] *= 2;
						alreadyCombined[x][Y]=true;
						gameBoard[x][y] = 0;
					}
				}			
			}						
		}
	}		
}
public void pushRight() {
	System.out.println("Pushing right...");
	boolean[][] alreadyCombined = {{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false}};
	for(int x=0;x<5;x++) {
		for(int y=3;y>-1;y--) {
			while(gameBoard[x][y]!=0) {
				int value = gameBoard[x][y];
				int Y = y+1;
				while(Y <= 4 && gameBoard[x][Y] == 0) {
					Y++;
				}
				if(Y ==5) {
					gameBoard[x][4] = value;
					gameBoard[x][y] = 0;
				}
				else if(gameBoard[x][Y]!=value && Y-y != 1) {
					gameBoard[x][Y-1] = value;
					gameBoard[x][y] =0;

				}
				else if(gameBoard[x][Y]!=value) {
					break;
				}
				else	{
					if(alreadyCombined[x][Y]) {
						gameBoard[x][Y-1] = value;
						gameBoard[x][y] = 0;
					}
					else {
						gameBoard[x][Y] *= 2;
						alreadyCombined[x][Y]=true;
						gameBoard[x][y] = 0;
					}
				}			
			}						
		}
	}		
}
}



