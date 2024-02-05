package ArrayList;
import java.util.*;

public class arrayList 
{

	public arrayList() 
	{

	
	}

	public static void main(String[] args) 
	{
		List <Integer> al=new ArrayList<Integer>(); // generic
		
		List<Integer> al1=new ArrayList<Integer>();
		
		List al2=new ArrayList<>();//non generic
		
		ArrayList<String> al3=new ArrayList<>();
	/*	al2.add(1);
		al2.add("java");
		al2.add(22.9);
		al2.add('f');
		System.out.println(al2);*/
		al.add(10);
		al.add(15);
		al.add(5);
		al1.add(30);
		al1.add(25);
		//System.out.println("Before add:"+al.size());
		al.addAll(al1);
	//	System.out.println("After add:"+al.size());
	/*	int x=al.remove(4);
		System.out.println("After remove:"+al.size());
		System.out.println(al);
		System.out.println(al1);
		System.out.println("Removed number:"+x);
		System.out.println("Position 2:"+al.get(2));
		al.set(1, 50);
		Iterator<Integer> i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		al.removeAll(al1);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		System.out.println();*/
		System.out.println("Before sort:"+al);
		//al.sort(Comparator.naturalOrder());//asc order
		al.sort(Comparator.reverseOrder());//desc order
		System.out.println("After sort:"+al);

		
		
	}

}
