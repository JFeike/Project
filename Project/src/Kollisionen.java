import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.Timer;
import java.util.TimerTask;

public class Kollisionen {
	Timer kollision;

	public Kollisionen() {
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

					Rectangle2D player = new Rectangle2D.Double(Variables.playerX, Variables.playerY, Variables.player.getWidth(), Variables.player.getHeight());
					Rectangle2D key = new Rectangle2D.Double(Variables.key1X, Variables.key1Y, Variables.key.getWidth(), Variables.key.getHeight());
					Rectangle2D key2 = new Rectangle2D.Double(Variables.key2X, Variables.key2Y, Variables.key.getWidth(), Variables.key.getHeight());
					Rectangle2D wall1 = new Rectangle2D.Double(Variables.wall1X, Variables.wall1Y, Variables.wall.getWidth(), Variables.wall.getHeight());
					Line2D l1 = new Line2D.Double(Variables.wall1X, Variables.wall1Y, Variables.wall1X+Variables.wall.getWidth(), Variables.wall1Y);
					Line2D l2 = new Line2D.Double(Variables.wall1X, Variables.wall1Y, Variables.wall1X, Variables.wall1Y+Variables.wall.getHeight());
					Line2D l3 = new Line2D.Double(Variables.wall1X, Variables.wall1Y+Variables.wall.getHeight(), Variables.wall1X+Variables.wall.getWidth(), Variables.wall1Y+Variables.wall.getHeight());
					Line2D l4 = new Line2D.Double(Variables.wall1X+Variables.wall.getWidth(), Variables.wall1Y, Variables.wall1X+Variables.wall.getWidth(), Variables.wall1Y+Variables.wall.getHeight());
					
						if(player.intersects(key)) {
							Variables.keycount++;
							Variables.keyamount.setText("Anzahl Schlüssel: " + Variables.keycount);
							Variables.key1X = 10000;
						} 
						
						if (player.intersects(key2)) {
							Variables.keycount++;
							Variables.keyamount.setText("Anzahl Schlüssel: " + Variables.keycount);
							Variables.key2X = 10000;	
						} 
							
						else if (player.intersectsLine(l1)) {
							System.out.println("wand oben getroffen");
							Variables.playerY = Variables.wall1Y-64;
							
						} else if (player.intersectsLine(l2)) {
							System.out.println("wand links getroffen");
							Variables.playerX = Variables.wall1X-64;
							
						} else if (player.intersectsLine(l3)) {
							System.out.println("wand unten getroffen");
							Variables.playerY = Variables.wall1Y+Variables.wall.getHeight();
							
						} else if (player.intersectsLine(l4)) {
							System.out.println("wand rechts getroffen");
							Variables.playerX = Variables.wall1X+Variables.wall.getWidth();
						}
			}
		}, 0, 15);
	}
}
