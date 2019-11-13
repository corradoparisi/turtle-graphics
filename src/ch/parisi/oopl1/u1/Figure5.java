package ch.parisi.oopl1.u1;

import static ch.parisi.oopl1.turtles.Turtles.*;

import java.awt.Color;

import ch.parisi.oopl1.turtles.TurtlesUtil;

public class Figure5 {
	
	public static void main(String[] args) {
		TurtlesUtil.init(200, 200, Color.BLUE);
		
		for (int i = 2; i <= 360; i = i+2) {
			move(i);
			left(89);			
		}
		move(15);
	}
	
}
