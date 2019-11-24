

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Graphic extends JLabel {

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		
		g.drawImage(Variables.key, Variables.key1X, Variables.key1Y, null);
		g.drawImage(Variables.key, Variables.key2X, Variables.key2Y, null);
		g.drawImage(Variables.wall, Variables.wall1X, Variables.wall1Y, null);
		g.drawImage(Variables.player, Variables.playerX, Variables.playerY, null);
		repaint();
		
	}
	

	
	
	
	
	
	
	
	
	
	
}
