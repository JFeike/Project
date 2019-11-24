

import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui extends JFrame {
	


	public Gui() {
		
		Variables.jf = new JFrame();
		Variables.keyamount = new JLabel("Anzahl Schlüssel: " + Variables.keycount);
		Variables.jf.setLayout(null);
		Variables.jf.setSize(1200, 800);
		Variables.jf.setTitle("Proj2: Game");
		Variables.jf.setResizable(false);
		Variables.jf.isAutoRequestFocus();
		Variables.jf.addKeyListener(new InputHandler());
		Variables.jf.setVisible(true);
		Variables.jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Variables.l = new Graphic();
		Variables.l.setBounds(0,0,1200,800);
		Variables.jf.add(Variables.l);
		Variables.jf.add(Variables.keyamount);
		Variables.keyamount.setBounds(10, 10, 200, 10);
		
	}
}
