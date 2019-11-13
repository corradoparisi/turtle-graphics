package ch.parisi.oopl1.turtles;

import static ch.parisi.oopl1.turtles.Turtles.down;
import static ch.parisi.oopl1.turtles.Turtles.left;
import static ch.parisi.oopl1.turtles.Turtles.move;
import static ch.parisi.oopl1.turtles.Turtles.moveTo;
import static ch.parisi.oopl1.turtles.Turtles.right;
import static ch.parisi.oopl1.turtles.Turtles.setColor;
import static ch.parisi.oopl1.turtles.Turtles.show;
import static ch.parisi.oopl1.turtles.Turtles.up;

import java.awt.Color;

public class TurtlesUtil {


	/**
	 * Initializes the graphics window, sets the Turtles position 
	 * to the specified x and y coordinate, sets a draw color 
	 * and sets the pen in down position.
	 * 
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	public static void init(int x, int y, Color color) {
		init(x, y);
		setColor(color);
	}
	
	/**
	 * Initializes the graphics window, sets the Turtles position 
	 * to the specified x and y coordinate and sets the pen in down position.
	 * 
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	public static void init(int x, int y) {
		show();
		up();
		moveTo(x, y);
		down();
	}
	
	/**
	 * Moves the Turtle without drawing by the given distance.
	 * @param distance the distance
	 */
	public static void blankMove(int distance) {
		up();
		move(distance);
		down();
	}
	
	/**
	 * Turns the Turtle by the specified angle to the left 
	 * and moves it by the given distance.
	 * 
	 * @param angle the angle
	 * @param distance the distance
	 * @param blank whether the move is executed without drawing
	 */
	public static void leftMove(int angle, int distance, boolean blank) {
		left(angle);
		
		if(blank) {
			blankMove(distance);
		}
		else {			
			move(distance);
		}
	}
	
	/**
	 * Moves the Turtle by the given distance
	 * and turns it by the specified angle to the left.
	 * 
	 * @param angle the angle
	 * @param distance the distance
	 * @param blank whether the move is executed without drawing
	 */
	public static void moveLeft(int distance, int angle, boolean blank) {
		if(blank) {
			blankMove(distance);
		}
		else {			
			move(distance);
		}
		
		left(angle);
	}
	
	/**
	 * Turns the Turtle by the specified angle to the right 
	 * and moves it by the given distance.
	 * 
	 * @param angle the angle
	 * @param distance the distane
	 * @param blank whether the move is executed without drawing
	 */
	public static void rightMove(int angle, int distance, boolean blank) {
		right(angle);
		
		if(blank) {
			blankMove(distance);
		}
		else {			
			move(distance);
		}
	}
	
	/**
	 * Moves the Turtle by the given distance
	 * and turns it by the specified angle to the right.
	 * 
	 * @param angle the angle
	 * @param distance the distance
	 * @param blank whether the move is executed without drawing
	 */
	public static void moveRight(int distance, int angle, boolean blank) {
		if(blank) {
			blankMove(distance);
		}
		else {			
			move(distance);
		}
		
		right(angle);
	}
	
}
