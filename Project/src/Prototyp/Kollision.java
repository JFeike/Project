package Prototyp;

import java.awt.Rectangle;
import java.awt.Shape;
import java.util.Timer;
import java.util.TimerTask;

public class Kollision {
	Timer kollision;
	Player userDot;
	enemy_KI enemyDot;

	public Kollision() {
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

					boolean movement = true;
					Rectangle maze = new Rectangle(50,0, 60,1000);
					
						if(((Shape) userDot).intersects(maze)) {
							userDot.setDestination(20, 20);
						}
						if(((Shape) userDot)==(Shape)enemyDot) {
							userDot.setDestination(20, 20);
						}
			}
		}, 0, 15);
	
	}
}
