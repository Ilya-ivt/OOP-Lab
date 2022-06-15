package lab11;

public class MyList 
{
	private ListElem head = null;
	
	public void add(String x) // Добавление элемента в список
	{
		ListElem e = new ListElem();
		e.value = x;
		e.next = head;
		head = e;
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
	
	public boolean delElem(String x) // Удаляет элемент из списка
	{
		if (head == null) // Если список пустой
		{
			return false;
		}
		
		if (head.value.equals(x)) // Если в списке 1 элемент
		{
			head = head.next;
			
			return true;
		}
		
		ListElem pos = head;
		
		while (pos.next != null)
		{
			if (pos.next.value.equals(x))
			{
				pos.next = pos.next.next;
				
				return true;
			}
			
			pos = pos.next;
		}
		
		return false;
	}
}
