package ch.parisi.oopl1.u1;

import java.awt.Color;

import ch.parisi.oopl1.turtles.TurtlesUtil;

public class Figure1 {
	public static void main(String[] args) {
		TurtlesUtil.init(150, 150, Color.RED);
	
		TurtlesUtil.moveLeft(42, 90, false);
		
		for (int i = 0; i < 5; i++) {
			TurtlesUtil.moveLeft(100, 135, false);		
		}
	}
}
