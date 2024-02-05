package Queue;
import java.util.*;

public class QueueEx 
{

	public QueueEx()
	{

	
	}
	void dequeex()
	{
		Deque<String> d=new ArrayDeque<String>();
		d.add("1");
		d.add("2");
		
		d.add("3");
		System.out.println(d);
		d.addFirst("0");
		d.addLast("4");
		System.out.println(d);
	}

	public static void main(String[] args) 
	{
		QueueEx qe=new QueueEx();
		qe.dequeex();
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("ABC");
		pq.add("EFG");
		pq.add("HIJ");
		
	//	System.out.println("Head:"+pq.element());
	//	System.out.println("Head:"+pq.peek());
		System.out.println(pq);
	/*	Iterator itr=pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		//	pq.remove();
		pq.poll();
		System.out.println(pq);
		// TODO Auto-generated method stub

	}

}
