package lab11;

public class MyList 
{
	private ListElem head = null;
	
	public void add(String x) // ���������� �������� � ������
	{
		ListElem e = new ListElem();
		e.value = x;
		e.next = head;
		head = e;
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
	
	public boolean delElem(String x) // ������� ������� �� ������
	{
		if (head == null) // ���� ������ ������
		{
			return false;
		}
		
		if (head.value.equals(x)) // ���� � ������ 1 �������
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
