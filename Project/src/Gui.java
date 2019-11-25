

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui extends JFrame {
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int w = (int) screenSize.getWidth();
	int h = (int) screenSize.getHeight();
	
	public Gui() {
		
	   	ImagePanel backgroundImage = new ImagePanel(); 
		Variables.jf = new JFrame();
		Variables.jf.setContentPane(backgroundImage);
		Variables.keyamount = new JLabel("Anzahl Schlüssel: " + Variables.keycount);
		Variables.jf.setLayout(null);
		Variables.jf.setSize(w,h);
		Variables.jf.setTitle("Proj2: Game");
		Variables.jf.setResizable(false);
		Variables.jf.isAutoRequestFocus();
		Variables.jf.addKeyListener(new InputHandler());
		Variables.jf.setVisible(true);
		Variables.jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Variables.l = new Graphic();
		Variables.l.setBounds(0,0,w,h);
		Variables.jf.add(Variables.l);
		Variables.jf.add(Variables.keyamount);
		Variables.keyamount.setBounds(10, 10, 200, 10); 
		
	}
}
