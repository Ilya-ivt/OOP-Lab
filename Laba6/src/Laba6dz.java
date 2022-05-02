import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Laba6dz extends JPanel {
	
	
	int arr[][];
	int x;
	int y;
	int max;
	int min;
	int minstr = 0;
	int maxstr = 0;
	
	public void updateArrey() {
		for (int j = 0; j < y; j++) {
			for (int i = 0; i < x; i++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					maxstr = j;
				}
				if (arr[i][j] < min) {
					min = arr[i][j];
					minstr = j;
				}
			}
		}
		for (int i=0; i<x; i++) {
			arr[i][minstr]+=arr[i][maxstr];
			arr[i][maxstr]=arr[i][minstr] - arr[i][maxstr];
			arr[i][minstr]-=arr[i][maxstr];
		}
		
		repaint();
	}
	
	
	
	
	public Laba6dz() {
		glavfinction();
	}
	
	public void glavfinction() {
	
	/*	
	int arr[][];
	int x;
	int y;
	*/
	
	
	Scanner sc;
	try {
		sc = new Scanner(new File("E:\\input6.txt"));
		x = sc.nextInt();
		y = sc.nextInt();
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
					break;
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
				default:
					g.setColor(Color.darkGray);
					break;
				}
				g.fillRect(10 + i * 20, 10 + j * 20, 20, 20);		
			}
		}
	}	
		

}
