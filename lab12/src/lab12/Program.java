package lab12;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Program 
{
	static MyList list;
	static LinkedList<String> list_2 = new LinkedList();
	static Scanner sc;
	
	private static void addFirst_2() // Добавление введённого элемента в начало списка
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Введите значение: ");  
		String x = in.nextLine();
		
		//list.addToHead(x);
		
		list_2.addFirst(x);
	}
	
	private static void addLast_2() // Добавление введённого элемента в конец списка
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Введите значение: ");  
		String x = in.nextLine();
		
		list_2.addLast(x);
		//list.addToTail(x);
	}
	
	private static void del() // Удаление введённого элемента из списка
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Введите значение: ");  
		String x = in.nextLine();
		
		list_2.remove(x);
		
		//list.delElem(x);
		/*
		if (list.delElem(x))
		{
			System.out.println("Элемент удалён!");
		}
		else
		{
			System.out.println("Элемент удалить не удалось!");
		}
		*/
	}

	public static void main(String[] args) 
	{
		// ListElem e1 = new ListElem();
		// ListElem e2 = e1; // e2 как ссылка на e1
		
		list = new MyList();
		
		sc = new Scanner(System.in);
		
		/*
		
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		
		String s = list.toString();
		
		System.out.println(s);
		System.out.println("В списке " + list.count() + " элементов");
		
		list.add(25);
		
		System.out.println("В списке " + list.count() + " элементов");
		
		*/
		
		int choose = 0;
		
		do
		{
			System.out.println("1 - Добавить элемент в голову\n2 - Добавить элемент в хвост\n3 - Вывести список в прямом направлении\n4 - Вывести список в обратном направлении\n5 - Удалить элемент\n6 - Выход");
			
			choose = sc.nextInt();
			
			switch(choose)
			{
			case 1:
				addFirst_2();
				break;
				
			case 2:
				addLast_2();
				break;
				
			case 3:
				ListIterator<String> it = list_2.listIterator();
				
				while (it.hasNext())
				    System.out.print(it.next() + " ");
				
				System.out.print("\n");
				
				break;
				
			case 4:
				ListIterator<String> it_2 = list_2.listIterator(list_2.size());
				
				while (it_2.hasPrevious())
				    System.out.print(it_2.previous() + " ");
				
				System.out.print("\n");
				break;
				
			case 5:
				del();
				break;
				
			default:
				break;
			}
		
		}
		while (choose != 6);
	}

}
