import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InputHandler implements MouseListener, KeyListener, ActionListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1) {
		Var.MouseLocX = e.getX();
		Var.MouseLocY = e.getY();

		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_W) {
			Var.moveup = true;
		}
		if(e.getKeyCode()==KeyEvent.VK_S) {
			Var.movedown = true;
		}
		if(e.getKeyCode()==KeyEvent.VK_A) {
			Var.moveleft = true;
		}
		if(e.getKeyCode()==KeyEvent.VK_D) {
			Var.moveright = true;
		}
		if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
			Gui.secondFrame();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_W) {
			Var.moveup = false;
		}
		if(e.getKeyCode()==KeyEvent.VK_S) {
			Var.movedown = false;
		}
		if(e.getKeyCode()==KeyEvent.VK_A) {
			Var.moveleft = false;
		}
		if(e.getKeyCode()==KeyEvent.VK_D) {
			Var.moveright = false;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Var.jb1) {
			Var.sf.dispose();
				
		}
		if(e.getSource() == Var.jb2) {
			System.exit(0);
			
		}
		
	}

}
