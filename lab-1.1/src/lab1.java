import java.util.Scanner;
public class lab1 {
	public static void main(String[] args) {
		
		
		System.out.print("������� 1, ����� ����������� ���� while ��� ������� 2, ����� ������������ ���� do while:");
		Scanner end = new Scanner (System.in);
		int c = end.nextInt();
		System.out.print("������� ��������� � ���������� �������:");
		int a = end.nextInt();
		int n = end.nextInt();
		int i = 1;
		int num = a;
		switch(c) {
		case(1):
			while(i<n) {
				a *=num;
				i++;
			}
		break;
		case(2):
			do {
				a *=num;
				i++;
			}
			while(i<n);
		break;
		}
		
		System.out.print(a);
		end.close();
	}
	
}
