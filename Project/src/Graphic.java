import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class Graphic extends JPanel {

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2d.drawImage(Var.wall, Var.wallLocX, Var.wallLocY, null);
		g2d.drawImage(Var.wall, Var.headerLocX, Var.headerLocY, Var.jf.getWidth(), 10, null);
		g2d.drawImage(Var.Akey, Var.AkeyLocX, Var.AkeyLocY, null);
		g2d.drawImage(Var.Bkey, Var.BkeyLocX, Var.BkeyLocY, null);
		g2d.drawImage(Var.Bkey, 10, 10, null);
		g2d.drawImage(Var.player, Var.playerLocX, Var.playerLocY, null);
		repaint();
		
	}
}
