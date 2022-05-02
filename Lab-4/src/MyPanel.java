import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class MyPanel extends JPanel {
	
	@Override
	
	public void paint(Graphics g) {
		super.paint(g);
		//Земля
		g.setColor(Color.green);
		g.fillRect(0, 525, 932, 20);
		 
		// рисуем корпус домика
		g.setColor(new Color(192, 192, 192));
		g.fillRect(150, 350, 250, 175);
		g.setColor(Color.black);
		g.drawRect(150, 350, 250, 175);
		
		//Рисуем крышу
		g.drawLine(100, 350, 175, 275);
		g.drawLine(100, 350, 150, 350);
		g.drawLine(450, 350, 375, 275);
		g.drawLine(450, 350, 400, 350);
		g.drawLine(175, 275, 375, 275);
		
		//Труба
		g.setColor(Color.gray);
		g.fillRect(200, 225, 25, 50);
		g.setColor(Color.black);
		g.drawRect(200, 225, 25, 50);
		
		//Дверь 
		g.setColor(new Color(101, 67, 33));
		g.fillRect(175, 425, 50, 100);
		g.setColor(Color.black);
		g.drawRect(175, 425, 50, 100);
		
		//Окно
		g.setColor(Color.yellow);
		g.fillRect(250, 400, 50, 100);
		g.fillRect(325, 400, 50, 100);
		g.setColor(Color.black);
		g.drawLine(250, 450, 300, 450);
		g.drawLine(275, 400, 275, 500);
		g.drawLine(325, 450, 375, 450);
		g.drawLine(350, 400, 350, 500);
		g.drawLine(250, 400, 300, 400);
		g.drawLine(250, 400, 250, 500);
		g.drawLine(250, 500, 300, 500);
		g.drawLine(300, 400, 300, 500);
		g.drawLine(325, 400, 375, 400);
		g.drawLine(325, 400, 325, 500);
		g.drawLine(325, 500, 375, 500);
		g.drawLine(375, 400, 375, 500);
		
		//Дерево
		g.drawLine(650, 475, 650, 525);
		g.drawLine(660, 475, 660, 525);
		g.drawOval(625, 325, 60, 150);
		g.setColor(new Color(23, 114, 69));
		g.fillOval(625, 325, 60, 150);
		
		//Облака
		g.setColor(new Color(0, 191, 255));
		g.fillOval(50, 10, 200, 100);
		g.fillOval(270, 10, 200, 100);
		g.fillOval(490, 10, 200, 100);
		
		
		
		
		/*
		// рисуем внешний контур окна домика
		g.drawRect(225, 400, 100, 75);  
		//вертикальная линия окна
		g.drawLine(275, 400, 275, 475); 
		//горизонтальная линия окна
		g.drawLine(275, 425, 325, 425); 
		// левая линия крыши
		g.drawLine(150,350,275,250);
		// правая линия крыши
		g.drawLine(275,250,400,350); 
		*/
			
		

	}

}
