import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.Timer;
import java.util.TimerTask;

public class Collisions {
	Timer collision;
	
	public Collisions() {
			collision = new Timer();
			collision.scheduleAtFixedRate(new TimerTask() {

				@Override
				public void run() {

					Rectangle2D player = new Rectangle2D.Double(Var.playerLocX, Var.playerLocY, Var.player.getWidth(), Var.player.getHeight());
					Rectangle2D header = new Rectangle2D.Double(Var.headerLocX, Var.headerLocY, Var.jf.getWidth(), 10);
					Rectangle2D key = new Rectangle2D.Double(Var.AkeyLocX, Var.AkeyLocY, Var.Akey.getWidth(), Var.Akey.getHeight());
					Rectangle2D key2 = new Rectangle2D.Double(Var.BkeyLocX, Var.BkeyLocY, Var.Bkey.getWidth(), Var.Bkey.getHeight());
						
					
					if(player.intersects(header)) {
						Var.playerLocY = 80;
						
						
					}
					if(player.intersects(key)) {
						Var.keycount++;
						Var.keys.setText("x " + Var.keycount);
						Var.AkeyLocX = 10000;
					
					
					}
					if(player.intersects(key2)) {
						Var.keycount++;
						Var.keys.setText("x " + Var.keycount);
						Var.BkeyLocX = 10000;
					
					
					}
						

				}
			}, 0, 15);
		}

}
