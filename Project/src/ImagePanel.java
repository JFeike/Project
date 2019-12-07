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
            tile = ImageIO.read(new File("Project/src/material/Background.png"));  
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    protected void paintComponent(Graphics g) {
    	
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        int tileWidth = tile.getWidth();
        int tileHeight = tile.getHeight();
        for (int y = 0; y < screenSize.getHeight(); y += tileHeight) {
            for (int x = 0; x < screenSize.getWidth(); x += tileWidth) {
                g2d.drawImage(tile, x, y, this);
        	   
            }
        }
        g2d.dispose();
    }
}

