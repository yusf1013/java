package arraylist;

public class MyMain {

	public static void main(String[] args) {

		MyArrayList MyList = new MyArrayList();
		
		MyList.add("BSSE1001");
		MyList.add("BSSE1002");
		MyList.add("BSSE1004");
		MyList.add("BSSE1005");
		MyList.add("BSSE1006");
		MyList.add("BSSE1007");
		MyList.add("BSSE1008");
		MyList.add(2,"BSSE1003");
		System.out.println("Size of arrayMyList after 4 additions: " + MyList.size());
		System.out.println(MyList);
		
		if(MyList.contains("BSSE1003"))
			System.out.println("BSSE1003 is at index=" + MyList.indexOf("BSSE1003"));
		
		MyList.remove("BSSE1003");
		MyList.remove(2);
		System.out.println("After the removal:-");
		for(int i=0; i<MyList.size(); i++)
		{
			System.out.println(MyList.get(i));
		}
		
		MyList.set(5, "BSSE1013");
		System.out.println("Final printing as array: ");
		String[] MyListArray = MyList.toArray();
		for(int i=0; i<MyListArray.length; i++)
		{
			System.out.println(MyListArray[i]);
		}
		System.out.println("End of my main");
	}

}
