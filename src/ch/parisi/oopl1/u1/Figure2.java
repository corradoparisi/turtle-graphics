package ch.parisi.oopl1.u1;

import ch.parisi.oopl1.turtles.Turtles;

public class Figure2 {

	/**
	 * Draws a nine-pointed polygon (nonagram).
	 */
	public static void main(String[] args) {
		Turtles.show();
		Turtles.moveTo(100, 100);
		Turtles.down();

		for (int i = 0; i < 10; i++) {
			Turtles.move(100);
			Turtles.left(160);
		}
	}
}
