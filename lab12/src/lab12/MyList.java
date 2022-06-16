package lab12;

import lab12.ListElem;

public class MyList 
{
	private ListElem head = null;
	private ListElem tail = null;
	
	public void add(String x) // ���������� �������� � ������
	{
		ListElem e = new ListElem();
		e.value = x;
		e.next = head;
		head = e;
	}
	
	public void addToHead(String x) // ���������� �������� � ������ ����������� ������
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
			head.prev = e; // ������������� ������ �� ��� ����� ����������� �������
		}
		
		head = e; // ������������ ������ �� ��� ����� ����������� �������
	}
	
	public void addToTail(String x) // ���������� �������� � ����� ����������� ������
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
			tail.next = e; // �� �������� ������ ��������� ������� ����� ��� �����
		}
		
		tail = e; // ������������ ����� �� ��� ����� ����������� �������
	}
	
	public String toString() // ����������� ��� ������ � ������ ��� ������
	{
		String res = "";
		ListElem pos = head;
		
		while (pos != null) // ����� ������
		{
			res += pos.value + " ";
			pos = pos.next;
		}
		
		return res;
	}
	
	public String toStringReverse() // ����������� ��� ������ � ������ ��� ������ � �������� �������
	{
		String res = "";
		ListElem pos = tail;
		
		while (pos != null) // ����� ������
		{
			res += pos.value + " ";
			pos = pos.prev;
		}
		
		return res;
	}
	
	public boolean isExist(String x) // ��������� ���� �� �����-���� ������� � ������
	{
		ListElem pos = head;
		
		while (pos != null) // ����� ������
		{
			if (pos.value.equals(x)) // ���� ������� ������
			{
				return true;
			}
			
			pos = pos.next;
		}
		
		return false;
	}
	
	public int count() // ������� ���-�� ��������� � ������
	{
		int cnt = 0;
		ListElem pos = head;
		
		while (pos != null) // ����� ������
		{
			cnt++;
			pos = pos.next;
		}
		
		return cnt;
	}
	
	public void delFirst() // ������� ������� �� ������ ����������� ������
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
	
	public void delLast() // ������� ������� �� ������ ����������� ������
	{
		if (tail == null)
		{
			return;
		}
		
		tail = tail.prev; // ������������ ����� �� ���������� �������
		
		if (tail != null)
		{
			tail.next = null;
		}
		else
		{
			head = null;
		}
	}
	
	public boolean delElem(String x) // ������� ������� �� ����������� ������
	{
		if (head == null) // ���� ������ ������
		{
			return false;
		}
		
		if (head.value.equals(x)) // ���� ������� � ������ ������
		{
			delFirst();
			
			return true;
		}
		
		if (tail.value.equals(x)) // ���� ������� � ������ ������
		{
			delLast();
			
			return true;
		}
		
		ListElem pos = head;
		
		while (pos.next != null)
		{
			if (pos.value.equals(x))
			{
				pos.prev.next = pos.next; // � ����. �������� ������ �� next ������ �� ���������
				pos.next.prev = pos.prev; // � ����. ��������, �������� ����� ���� ������ �� prev ������ �� ����������
				
				return true;
			}
			
			pos = pos.next;
		}
		
		return false;
	}
}
