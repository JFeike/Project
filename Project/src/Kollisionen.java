

import java.awt.Rectangle;
import java.util.Timer;
import java.util.TimerTask;

public class Kollisionen {
	Timer kollision;

	public Kollisionen() {
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

					boolean movement = true;
					Rectangle player = new Rectangle(Variables.playerX, Variables.playerY, Variables.player.getWidth(), Variables.player.getHeight());
					Rectangle key = new Rectangle(Variables.key1X, Variables.key1Y, Variables.key.getWidth(), Variables.key.getHeight());
					Rectangle key2 = new Rectangle(Variables.key2X, Variables.key2Y, Variables.key.getWidth(), Variables.key.getHeight());
					Rectangle wall1 = new Rectangle(Variables.wall1X, Variables.wall1Y, Variables.wall.getWidth(), Variables.wall.getHeight());
					
					Rectangle enemy = new Rectangle(Variables.enemyX, Variables.enemyY, Variables.enemy.getWidth(), Variables.enemy.getHeight());
					
						if(player.intersects(key)) {
							Variables.keycount++;
							Variables.keyamount.setText("Anzahl Schlüssel: " + Variables.keycount);
							Variables.key1X = 10000;
							
						} else if (player.intersects(key2)) {
							Variables.keycount++;
							Variables.keyamount.setText("Anzahl Schlüssel: " + Variables.keycount);
							Variables.key2X = 10000;
							
						} else if (player.intersects(wall1)) {
							System.out.println("wwall getroffen");
							Variables.playerX = 50;
							Variables.playerY = 50;
							
							while(movement == true) {
								Variables.enemyX += Math.random() * 10;
								Variables.enemyY += Math.random() * 10;
							}	
							
						}
			}
		}, 0, 15);
	}
}
