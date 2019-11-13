package ch.parisi.oopl1.u1;

import ch.parisi.oopl1.turtles.TurtlesUtil;

public class Figure3 {

	public static void main(String[] args) {
	TurtlesUtil.init(200, 200);
		
		int counter = 0;
		while(counter < 4) {
			TurtlesUtil.leftMove(90, 100, false);
			TurtlesUtil.rightMove(90, 100, false);
			TurtlesUtil.rightMove(90, 100, false);
			counter = counter + 1;	
		}
			
	}
}