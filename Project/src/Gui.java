import javax.swing.JFrame;

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
		g.setBounds(0,0,Var.jf.getWidth(), Var.jf.getHeight());
		
	}
	
	public static void secondFrame() {
		
		Var.sf.setLayout(null);
		Var.sf.setTitle("Menü");
		Var.sf.setSize(400, 200);
		Var.sf.setResizable(false);
		Var.sf.setVisible(true);
		Var.sf.add(Var.jb1);
		Var.sf.add(Var.jb2);
		Var.jb1.setBounds(90, 10, 200, 40);
		Var.jb2.setBounds(90, 70, 200, 40);
		Var.jb1.addActionListener(new InputHandler());
		Var.jb2.addActionListener(new InputHandler());
		
		
		
	}
	
}
