package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot olivia = new Robot();
		for (int i = 0; i < 5; i++) {
			olivia.turn(90);
			olivia.move(90);
			olivia.penDown();
			olivia.setPenColor(255,0,0);
		}
	}	
	
}