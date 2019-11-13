package ch.parisi.oopl1.editor;

import java.util.Scanner;

import ch.parisi.oopl1.turtles.Turtles;

public class TurtleEditor {

	public static void main(String[] args) {
		Turtles.show();
		Turtles.moveTo(200, 200);
		Scanner s = new Scanner(System.in);
		String cmd = s.next();
		while(!cmd.equals("exit")) {
			switch(cmd) {
			case "home": Turtles.up(); Turtles.moveTo(200,  200); Turtles.setDirection(0); break;
			case "move":  Turtles.move(s.nextInt()); break;
			case "left" : Turtles.left(s.nextInt()); break;
			case "right" : Turtles.right(s.nextInt()); break;
			case "up":  Turtles.up(); break;
			case "down" : Turtles.down(); break;
			case "clear" : Turtles.clear(); break;
			default: System.out.println(cmd + " not understand");
			}
			cmd = s.next();
		}
		s.close();
	}
}
