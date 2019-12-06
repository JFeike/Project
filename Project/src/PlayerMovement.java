import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovement {
	
	Timer movement;

	public PlayerMovement() {
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				
				if(Var.moveup == true && Var.playerLocY > 0){
				     Var.playerLocY -= Var.playerSpeed;
				     Var.moveup = false;
				     
				} else if(Var.movedown == true && Var.playerLocY <= Var.jf.getHeight()-Var.player.getHeight()) {
				     Var.playerLocY += Var.playerSpeed;
				     Var.movedown = false;
				    }
				
				if(Var.moveleft == true && Var.playerLocX > 0) {
				     Var.playerLocX -= Var.playerSpeed;
				     Var.moveleft = false;
				     
				} else if(Var.moveright == true && Var.playerLocX <= Var.jf.getWidth()-Var.player.getWidth()) {
				     Var.playerLocX += Var.playerSpeed;
				     Var.moveright = false;
				}

			}
			
		}, 0, 10);
	}
}
	
