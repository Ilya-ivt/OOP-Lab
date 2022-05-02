import javax.swing.JPanel;
import java.awt.Graphics;

public class StarPanel extends JPanel {
	
	private int sDepth = 5;
	
	public void setDepth(int depth)
	{
		sDepth = depth;
		
		repaint();
	}
	
	
	public void DrawStar(Graphics g, int x, int y, int size) {
		
		
		g.drawLine(x, y - size, x + size/4, y - size/4);
		g.drawLine(x + size/4, y - size/4, x + size, y);
		g.drawLine(x + size, y, x + size/4, y + size/4);
		g.drawLine(x + size/4, y + size/4, x, y + size);
		g.drawLine(x, y + size, x - size/4, y + size/4);
		g.drawLine(x - size/4, y + size/4, x - size, y);
		g.drawLine(x - size, y, x - size/4, y - size/4);
		g.drawLine(x - size/4, y - size/4, x, y - size);
	
		
	}
	
	public void Recur(Graphics g, int x, int y, int size, int depth) {
		
		if(depth <= 0) {
			return;
		}
		
		DrawStar(g, x, y, size);
		
		Recur(g, x, y - size, size/2, depth - 1);
		Recur(g, x + size, y, size/2, depth - 1);
		Recur(g, x - size, y, size/2, depth - 1);
		Recur(g, x, y + size, size/2, depth - 1);
	
		
	}
	
	
	
	
	
	
	
	

	@Override
	public void paint(Graphics g) {
		super.paint(g); 
		
		
		
		
		int x = 400;
		int y = 300;
		int size = 100;
	
		Recur(g, x, y, size, sDepth);
		
		
			
		
		
	}
	
	
	
	
	
	
	

	
}
