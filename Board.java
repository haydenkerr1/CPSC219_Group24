import java.util.ArrayList;
import java.util.Random; 

public class Board {
	private ArrayList<Obstacles> obstacles;
	private Avatar avatar; 
 char[][] grid;
	
	public static void main(String[] args) {
		char[][] startConfiguration = new char[5][5];
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 5; column++) {
				startConfiguration[row][column] = args[row*5+column].charAt(0)
 
 }
