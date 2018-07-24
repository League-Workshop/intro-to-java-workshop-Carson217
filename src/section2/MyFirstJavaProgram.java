package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	
 Robot Emrald = new Robot("batman");
		
 Emrald.setSpeed(400);
 void drawsquare() {
	 
 Emrald.penDown();
 
 for(int i = 0; i<4; i++) {
	 
	 Emrald.move(100);

	 Emrald.turn(90);
	 
 }
 
 
 

	}
}
