package arraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("BSSE1001");
		list.add("BSSE1002");
		list.add("BSSE1004");
		list.add("BSSE1005");
		list.add("BSSE1006");
		list.add("BSSE1007");
		list.add("BSSE1008");
		list.add(2,"BSSE1003");
		System.out.println("Size of arrayList after 4 additions: " + list.size());
		System.out.println(list);
		
		if(list.contains("BSSE1003"))
			System.out.println("BSSE1003 is at index=" + list.indexOf("BSSE1003"));
		
		list.remove("BSSE1003");
		list.remove(2); 
		System.out.println("After the removal:-");
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		list.set(5, "BSSE1013");
		System.out.println("Final printing as array: ");
		Object[] listArray = list.toArray();
		for(int i=0; i<listArray.length; i++)
		{
			System.out.println(listArray[i]);
		}
	}

}
