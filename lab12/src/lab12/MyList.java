package lab12;

import lab12.ListElem;

public class MyList 
{
	private ListElem head = null;
	private ListElem tail = null;
	
	public void add(String x) // Добавление элемента в список
	{
		ListElem e = new ListElem();
		e.value = x;
		e.next = head;
		head = e;
	}
	
	public void addToHead(String x) // Добавление элемента в голову двусвязного списка
	{
		ListElem e = new ListElem();
		e.value = x;
		e.next = head;
		e.prev = null;
		
		if (tail == null)
		{
			tail = e;
		}
		else
		{
			head.prev = e; // Устанавливаем ссылку на наш новый добавленный элемент
		}
		
		head = e; // Переставляем голову на наш новый добавленный элемент
	}
	
	public void addToTail(String x) // Добавление элемента в хвост двусвязного списка
	{
		ListElem e = new ListElem();
		e.value = x;
		e.prev = tail;
		e.next = null;
		
		if (head == null)
		{
			head = e;
		}
		else
		{
			tail.next = e; // От текущего хвоста следующий элемент будет наш новый
		}
		
		tail = e; // Переставляем хвост на наш новый добавленный элемент
	}
	
	public String toString() // Преобразует наш список в строку для вывода
	{
		String res = "";
		ListElem pos = head;
		
		while (pos != null) // Обход списка
		{
			res += pos.value + " ";
			pos = pos.next;
		}
		
		return res;
	}
	
	public String toStringReverse() // Преобразует наш список в строку для вывода в обратную сторону
	{
		String res = "";
		ListElem pos = tail;
		
		while (pos != null) // Обход списка
		{
			res += pos.value + " ";
			pos = pos.prev;
		}
		
		return res;
	}
	
	public boolean isExist(String x) // Проверяем есть ли какой-либо элемент в списке
	{
		ListElem pos = head;
		
		while (pos != null) // Обход списка
		{
			if (pos.value.equals(x)) // Если элемент найден
			{
				return true;
			}
			
			pos = pos.next;
		}
		
		return false;
	}
	
	public int count() // Подсчёт кол-ва элементов в списке
	{
		int cnt = 0;
		ListElem pos = head;
		
		while (pos != null) // Обход списка
		{
			cnt++;
			pos = pos.next;
		}
		
		return cnt;
	}
	
	public void delFirst() // Удаляет элемент из головы двусвязного списка
	{
		if (head == null)
		{
			return;
		}
		
		head = head.next;
		
		if (head != null)
		{
			head.prev = null;
		}
		else
		{
			tail = null;
		}
	}
	
	public void delLast() // Удаляет элемент из хвоста двусвязного списка
	{
		if (tail == null)
		{
			return;
		}
		
		tail = tail.prev; // Переставляем хвост на предыдущий элемент
		
		if (tail != null)
		{
			tail.next = null;
		}
		else
		{
			head = null;
		}
	}
	
	public boolean delElem(String x) // Удаляет элемент из двусвязного списка
	{
		if (head == null) // Если список пустой
		{
			return false;
		}
		
		if (head.value.equals(x)) // Если элемент в голове списка
		{
			delFirst();
			
			return true;
		}
		
		if (tail.value.equals(x)) // Если элемент в хвосте списка
		{
			delLast();
			
			return true;
		}
		
		ListElem pos = head;
		
		while (pos.next != null)
		{
			if (pos.value.equals(x))
			{
				pos.prev.next = pos.next; // У пред. элемента ссылку на next делаем на следующий
				pos.next.prev = pos.prev; // У след. элемента, стоящего после него ссылку на prev делаем на предыдущий
				
				return true;
			}
			
			pos = pos.next;
		}
		
		return false;
	}
}
