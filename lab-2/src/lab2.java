import java.util.Scanner;
public class lab2 {
	
	public static void main(String[] args) {
		
		
		System.out.print("������� 1, ����� ����������� ���� while ��� ������� 2, ����� ������������ ���� do while:");
		
		Scanner poc = new Scanner (System.in);
		int c = poc.nextInt();
		System.out.print("������� n:");
		
		int n = poc.nextInt();
		int i = n;
		int j = 1;
		switch(c) {
		case(1):
		
		while(i>=1) {
		
			j = n;
			while(j>=i) {
				System.out.print(j + " ");
				j--;
			}
			i--;
			System.out.println();
		}
		break;
		
		case(2):
		do {
			j = n;
			do {
				System.out.print(j + " ");
				j--;
			}
			while(j>=i);
			i--;
			System.out.println();
		}
		while(i>=1);
		break;
		}
		
		
		
		
		poc.close();
	}

}
