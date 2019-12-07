import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui extends JFrame {
	
	Graphic g = new Graphic();
	

	public Gui() {
		
		Var.jf.setLayout(null);
		Var.jf.setTitle("Proj2");
	    Var.jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
		Var.jf.setUndecorated(true);
		Var.jf.setResizable(false);
		Var.jf.addKeyListener(new InputHandler());
		Var.jf.addMouseListener(new InputHandler());
		Var.jf.setVisible(true);
		Var.jf.setContentPane(g);
		Var.jf.add(Var.keys);
		Var.keys.setBounds(22,10,500,50);
		g.setBounds(0,0,Var.jf.getWidth(), Var.jf.getHeight());
		
	}

}
