package lab11;

import java.util.Scanner;

public class Program 
{
	static MyList list;
	static Scanner sc;
	
	private static void add() // ���������� ��������� �������� � ������
	{
		Scanner in = new Scanner(System.in);
		System.out.print("������� ��������: ");  
		String x = in.nextLine();
		
		list.add(x);
	}
	
	private static void del() // �������� ��������� �������� �� ������
	{
		Scanner in = new Scanner(System.in);
		System.out.print("������� ��������: ");
		
		String x = in.nextLine();
		list.delElem(x);
		
		if (list.delElem(x))
		{
			System.out.println("������� �����!");
		}
		else
		{
			System.out.println("������� ������� �� �������!");
		}
	}

	public static void main(String[] args) 
	{
		// ListElem e1 = new ListElem();
		// ListElem e2 = e1; // e2 ��� ������ �� e1
		
		list = new MyList();
		
		sc = new Scanner(System.in);
		
		/*
		
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		
		String s = list.toString();
		
		System.out.println(s);
		System.out.println("� ������ " + list.count() + " ���������");
		
		list.add(25);
		
		System.out.println("� ������ " + list.count() + " ���������");
		
		*/
		
		int choose = 0;
		
		do
		{
			System.out.println("1 - �������� �������\n2 - ������� �������\n3 - ������� ������\n4 - �����");
			
			choose = sc.nextInt();
			
			switch(choose)
			{
			case 1:
				add();
				break;
				
			case 2:
				del();
				break;
				
			case 3:
				System.out.println(list.toString());
				break;
				
			default:
				break;
			}
		
		}
		while (choose != 4);
	}

}
