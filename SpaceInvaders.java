/**
*/


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This class represents a game. It launches the game and quits the game. 
 * 
 * Initializes all elements in the game. Including:
 * Setting up the board
 * Initializing and placing the user's avatar at the designated place for the appropriate level.
 * Placing obstacles and enemies at their designated positions.
 * This is carried out through calls to each object's respective classes.
 *
 */
public class SpaceInvaders {
	
	
  /**
   * DEMO 1:
   * For demo 1, the main method of this class is taking over:
   * initialization and the movement of the avatar from Avatar class
   * initialization and setup of the game board from the Board class
   *
   * Prompts user for desired movement of the avatar/option to quit game, and executes action:
   * Takes String as parameters:
   * "a" to move the avatar left
   * "d" to move the avatar right 
   * "x" to quit the game
   *
   */
  public static void main(String[] args) {
	System.out.println("       Space Invaders     ");
	
    Scanner input = new Scanner(System.in);
    String sc = "";
	
	int location = 22;
	
	ArrayList<String> myList = new ArrayList<String>();
	
	String[] targetQuads = { "*", "*", "*", "*", "*",  "*", "*", "*", "*", "*",  " ", " ", " ", " ", " ",  "-", " ", "-", " ", "-", " ", " ", "X", " ", " "};
	
	int i;
	
	for (i = 0; i < targetQuads.length; i++) {
		myList.add(targetQuads[i]);
	}

	while ((sc.equals("x") == false))
    {
    	System.out.println("Move character (left 'a' or right 'd') or 'x' to quit game.");
        sc = input.next();
        
        if (sc.equals("a"))
        {
        	if (location > 20) {
				Collections.swap(myList, location, location - 1);
				location = location - 1;
				for (i = 0; i < myList.size(); i++) {
					System.out.print(myList.get(i) + "          ");
					if ((i + 1) % 5 == 0){
						System.out.println("");
					}
				}
        	}
        	else
			{
				System.out.println("Sorry can't move farther left.");
			}
        } 
        else if (sc.equals("d")) 
        {
        	if (location < 24) {
				Collections.swap(myList, location, location + 1);
				location = location + 1;
				for (i = 0; i < myList.size(); i++) {
					System.out.print(myList.get(i) + "          ");
					if ((i + 1) % 5 == 0){
						System.out.println("");
					}
				}
        	}
        	else
			{
				System.out.println("Sorry can't move farther left.");
			}
        }
        else if (sc.equals("x")) 
        {
          System.out.println("Game over");
        }
        
        else 
	     {
	        System.out.println("Invalid input, try again");
	        
	     }
	       
       
    }
  }
}


