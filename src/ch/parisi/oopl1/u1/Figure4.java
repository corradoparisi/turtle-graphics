package ch.parisi.oopl1.u1;

import static ch.parisi.oopl1.turtles.Turtles.move;

import ch.parisi.oopl1.turtles.TurtlesUtil;

public class Figure4 {

	public static void main(String[] args) {
		TurtlesUtil.init(200, 200);

		for (int j = 0; j < 3; j++) {
			drawCircle();
			move(50);
		}

		TurtlesUtil.leftMove(120, 100, true);
		TurtlesUtil.leftMove(60, 50, true);
		drawCircle();
				
		TurtlesUtil.blankMove(50);
		TurtlesUtil.leftMove(120, 200, true);
		TurtlesUtil.rightMove(120, 50, true);
		drawCircle();
	}

	private static void drawCircle() {
		for (int i = 0; i < 6; i++) {
			TurtlesUtil.moveLeft(50, 120, false);
			TurtlesUtil.moveLeft(50, 120, false);
			TurtlesUtil.moveLeft(50, 180, false);
		}
	}
}
