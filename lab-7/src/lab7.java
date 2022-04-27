import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class lab7 extends JPanel {

	
	
	int arr[][];
	int x;
	int y;
	int px;
	int py;
	//private BufferedImage image;
	private Image img;
	private Image img1;
	private int lvl = 0;

	public void Text() {
		if (arr[px][py]==2) {
			JOptionPane.showMessageDialog(null, "Ура!", "Уровень пройден!" , JOptionPane.INFORMATION_MESSAGE);
			lvl++;
			if (lvl < 3) {
				glavfinction();	
			}
			else {
				JOptionPane.showMessageDialog(null, "Победа!", "Вы прошли игру!" , JOptionPane.INFORMATION_MESSAGE);
				lvl = 0;
				glavfinction();
			}
		}
	}
	public void moveDown() {
		if(arr[px][py+1] !=1) {
			py++;
			Text();
		}
		repaint();
	}
	public void moveUp() {
		if(arr[px][py-1] !=1) {
			py--;
			Text();
		}
		repaint();
	}
	public void moveLeft() {
		if(arr[px-1][py] !=1) {
			px--;
			Text();
		}
		repaint();
	}
	public void moveRight() {
		if(arr[px+1][py] !=1) {
			px++;
			Text();
		}
		repaint();
	}
	
	
	
	public lab7() {
		glavfinction();
		Image();
	}
	
	public void glavfinction() {
	
	/*	
	int arr[][];
	int x;
	int y;
	*/
		String LVL = "F:\\lvl";
		LVL+= lvl + ".txt";
	
	Scanner sc;
	try {
		sc = new Scanner(new File(LVL));
		x = sc.nextInt();
		y = sc.nextInt();
		px = sc.nextInt();
		py = sc.nextInt();
		arr = new int [x][y];
		for (int j = 0; j < y; j++) {
			for (int i = 0; i < x; i++) {
				arr[i][j] = sc.nextInt();
			}
		}
			
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
	
 
	
	
	
}
	public void Image() {
	try {
		img = ImageIO.read(new File("C:\\Users\\Molniya\\Desktop\\pers.jpg"));
		img1 = ImageIO.read(new File("C:\\Users\\Molniya\\Desktop\\kirpich.jpg"));
 
  } catch (Exception e) {
       e.printStackTrace();
  }
	}
	
	
	public void paint(Graphics g) {
		super.paint(g);	
		for (int j = 0; j < y; j++) {
			for (int i = 0; i < x; i++) {			
				switch(arr[i][j]) {
				case(0):
					g.setColor(Color.white);
					break;
				case(1):
					g.setColor(Color.black );
					break;
				case(2):
					g.setColor(Color.red);
					/*
				case(3):
					g.setColor(Color.blue);
					break;
				case(4):
					g.setColor(Color.pink);
					break;
				case(5):
					g.setColor(Color.yellow);
					break;
				case(6):
					g.setColor(Color.green);
					break;
				case(7):
					g.setColor(Color.orange);
					break;
				case(8):
					g.setColor(Color.gray);
					break;
				case(9):
					g.setColor(Color.magenta);
					break;	
					*/
				}
				
				
				g.fillRect(10 + i * 20, 10 + j * 20, 20, 20);	
				if (arr[i][j]==1) {
					g.drawImage(img1, 10 + i * 20,  10 + j * 20, 20, 20, null);
				}
				if (px == i && py == j) {	
					g.drawImage(img, 10 + px * 20,  10 + py * 20, 20, 20, null);
					
				}
			}
		}
		
	}	
		
}

