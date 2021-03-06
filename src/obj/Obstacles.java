package obj;

/**
 * CPSC 219 Group 24 Project: Obstacles Class
 *
 * @author: Paula Almeida
 *	        Gabriel Atienza
 *	        Sharon Chan
 *	        Hayden Kerr
 *	        Theresa Lam
 *
 * @date: April 11, 2019.
 *
 * @version: Obstacles Class of Space Invaders Game (GUI) INTERACTIVE DEMO
 *
 */

/**
 * Class represents game obstacles such as barriers.
 * Will vary in number and location on the game board
 * based on the level.
 * Attributes will include:
 * damage - will have different levels of damage based on weapon/collision.
 * Methods will track damage, collision counter, etc. 
 *
 */

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.geometry.Rectangle2D;


/*
 * Class representing the barriers in the game Space Invaders
 * Each class of Obstacles will take instance variables of barrierHealth, counter, barrierHit, barrierX, barrier
 * It will also take constant instance variables of BARRIER_IMAGE, BARRIER_WIDTH, BARRIER_HEIGHT, BARRIER_Y, BARRIER1_X,
 * BARRIER2_X, and BARRIER3_X
 */
public class Obstacles {
	//Instance Variables
    private int barrierHealth;
    private int counter = 0;
    private boolean barrierHit;
    private int barrierX;
    private int barrier;

    private static final Image BARRIER_IMAGE = new Image("res/Barrier.png");
    private static final int BARRIER_WIDTH = 100;
    private static final int BARRIER_HEIGHT = 65;
    private static final int BARRIER_Y = 635;
    private static final int BARRIER1_X = 125;
    private static final int BARRIER2_X = 350;
    private static final int BARRIER3_X = 575;


  // Constructors:
    
   /**
    * Takes barrier as an argument 
    * @param barrier tells the constructor which barrier it belongs to and set it's location
    */
    public Obstacles(int barrier){
        barrierHealth = 12;

        if (barrier == 1){
            barrierX = BARRIER1_X;
        }
        else if (barrier == 2){
            barrierX = BARRIER2_X;
        }
        else{
            barrierX = BARRIER3_X;
        }
    }
/**
 * Takes gc as a argument to draw the barrier on the Stage
 * @param gc allows to draw the barriers at a set location as well as set a text of it's health status
 */
    public void drawBarrier(GraphicsContext gc){
        gc.drawImage(BARRIER_IMAGE, barrierX, BARRIER_Y, BARRIER_WIDTH, BARRIER_HEIGHT);
        gc.setFill(Color.BLACK);
        gc.fillText("12", barrierX + 30, BARRIER_Y + 30);
    }

    public Rectangle2D getBoundary1(){
        return new Rectangle2D(BARRIER1_X, BARRIER_Y, BARRIER_WIDTH, BARRIER_HEIGHT);
    }

    public Rectangle2D getBoundary2(){
        return new Rectangle2D(BARRIER2_X, BARRIER_Y, BARRIER_WIDTH, BARRIER_HEIGHT);
    }

    public Rectangle2D getBoundary3(){
        return new Rectangle2D(BARRIER3_X, BARRIER_Y, BARRIER_WIDTH, BARRIER_HEIGHT);
    }

    // Accessor (getter) Methods: 
/**
 * Retrieves the barrier's health from the obstacles
 * @return the value of the barrier's health
 */
    public int getBarrierHealth(){
        return barrierHealth;
    }

    public void barrierHit(){
        barrierHealth -= 1;
  
    }
}
