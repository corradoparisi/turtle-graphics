package ch.parisi.oopl1.u1;

import static ch.parisi.oopl1.turtles.Turtles.*;

import java.awt.Color;

import ch.parisi.oopl1.turtles.TurtlesUtil;

public class Figure6 {

	public static void main(String[] args) {
		TurtlesUtil.init(300, 300, Color.RED);
		
		for (int i = 2; i <= 360; i = i+1) {
			move(i);
			left(80);			
		}
		move(15);
	}
	
}
