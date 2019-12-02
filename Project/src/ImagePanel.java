import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JPanel;


public class ImagePanel extends JPanel {

    private BufferedImage tile;

    public ImagePanel() {
        try {
            tile = ImageIO.read(new File("Project/src/material/grassmap.png"));  
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    protected void paintComponent(Graphics g) {
    	
    	int scrollX = Variables.playerX; int scrollY = Variables.playerY;
    	
    	int startX = Math.max(scrollX / 30, 0);
    	int startY = Math.max(scrollY / 30, 0);
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    	int limitX = (int) Math.min((scrollX + screenSize.getWidth()) / 30 + 1, 200);
    	int limitY = (int) Math.min((scrollX + screenSize.getHeight()) / 30 + 1, 200 );
    	
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        int tileWidth = tile.getWidth();
        int tileHeight = tile.getHeight();
        for (int y = 0; y < screenSize.getWidth(); y += tileHeight) {
            for (int x = 0; x < screenSize.getHeight(); x += tileWidth) {
                g2d.drawImage(tile, x * 200 - scrollX, y * 200 - scrollY, this);
        		g2d.drawImage(Variables.key, (int) (Variables.key1X - scrollX * 0.2), (int) (Variables.key1Y - scrollY * 0.2), null);
        		g2d.drawImage(Variables.key, (int) (Variables.key2X - scrollX * 0.2), (int) (Variables.key2Y - scrollY * 0.2), null);
                
            }
        }
        g2d.dispose();
    }
}

