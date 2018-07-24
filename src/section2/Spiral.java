package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		 Robot Emrald = new Robot("batman");
		// 5. Set your robot's pen down 
		 Emrald.penDown();
		// 3. Set the robot to go at max speed (100)
		 Emrald.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
			for(int i = 0; i<75; i++) {
				 Emrald.setRandomPenColor();
				
			
			
			// 7. Change the pen color to random
			 Emrald.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
			 Emrald.move(5*i);
			// 2. Turn the robot 360/7 degrees to the right
		Emrald.turn(360/7);
			// 8. Set the pen width to i
			Emrald.setPenWidth(i);
			}		
	}
}
