

import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovement {
	
	Timer movement;

	public PlayerMovement() {
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				
				if(Variables.moveup == true && Variables.playerY >= 10){
				     Variables.playerY -= Variables.playerSpeed;
				     Variables.moveup = false;
				     
				    }else if(Variables.movedown == true &&  Variables.playerY <= 790){
				     Variables.playerY += Variables.playerSpeed;
				     Variables.movedown = false;
				    }
				
				
				if(Variables.moveleft == true && Variables.playerX >= 10){
				     Variables.playerX -= Variables.playerSpeed;
				     Variables.moveleft = false;
				     
				    }else if(Variables.moveright == true &&  Variables.playerX <= 1190){
				     Variables.playerX += Variables.playerSpeed;
				     Variables.moveright = false;
				    }
			}
			
		}, 0, 10);
		
	}

}
