package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot r2d2 = new Robot();
	//hi my name is sean i am awesome
	r2d2.sparkle();	
	r2d2.setSpeed(10);
	r2d2.penDown();
	for (int i = 0; i < 99; i++) {
		
	
	r2d2.setPenColor(Color.cyan);
	r2d2.move(200);
	r2d2.turn(99);
	}
	
		
		
		}
}
	
	
	

