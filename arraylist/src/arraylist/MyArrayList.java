package arraylist;

import java.util.Arrays;

public class MyArrayList {
	private int length, capacity;
	private String[] list;
	
	public MyArrayList()
	{
		length=0;
		capacity=2;
		list=new String[capacity];
	}
	
	public int size()
	{
		return length;
	}
	
	private boolean isFull()
	{
		if(length==capacity-1)
			return true;
		else
			return false;
	}
	
	private void expand()
	{
		String list2[] = new String[capacity*2];
		for(int i=0; i<capacity; i++)
		{
			list2[i]=list[i];
		}
		capacity*=2;
		list=list2;
	}
	
	private void shrink()
	{
		if(capacity/2<2)
			return;
		String list2[] = new String[capacity/2];
		for(int i=0; i<capacity/2; i++)
		{
			list2[i]=list[i];
		}
		capacity/=2;
		list=list2;
	}
	
	public void add(String s)
	{
		if(isFull())
		{
			expand();
		}
		list[length]=s;
		length++;
	}
	
	public void add(int index, String s)
	{
		if(isFull())
		{
			expand();
		}
		
		for(int i=length; i>index; i--)
		{
			list[i]=list[i-1];
		}
		
		list[index]=s;
		length++;
	}
	
	public boolean remove(String s)
	{
		boolean removed=false;
		for(int i=0; i<capacity; i++)
		{
			if(s.equals(list[i]))
			{
				removed=true;
				for(int j=i; j<capacity-1; j++)
				{
					list[j]=list[j+1];
				}
				length--;
				break;
			}
		}
		if(length<capacity/2 && length>2)
			shrink();
		return removed;
	}
	
	public boolean contains(String s)
	{
		for(int i=0; i<capacity; i++)
		{
			if(s.equals(list[i]))
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String s="[";
		for(int i=0; i<length; i++)
		{
			s+=(list[i]);
			if(i<length-1)
				s+=", ";
		}
		s+="]";
		return s;
	}

	public void remove(int i) {
		remove(list[i]);
		
	}

	public String get(int i) {
		// TODO Auto-generated method stub
		return list[i];
	}

	public void set(int i, String string) {
		list[i]=string;
	}

	public String[] toArray() {
		// TODO Auto-generated method stub
		String list2[]=new String[length];
		for(int i=0; i<length; i++)
			list2[i]=list[i];
		return list2;
	}

	public int indexOf(String string) {
		// TODO Auto-generated method stub
		for(int i=0; i<capacity; i++)
		{
			if(string.equals(list[i]))
			{
				return i;
			}
		}
		return -1;
	}
	
	

}
