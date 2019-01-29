import java.awt.Graphics;

import javax.swing.JPanel;

public class Grade extends JPanel{
	
	
	@Override
	public void paintComponent(Graphics g) {
		
		for(int x = 0; x < getWidth(); x += getWidth()/8) {
			
			g.drawLine(x, 0, x, getHeight());
			
		}
		
	}
}
