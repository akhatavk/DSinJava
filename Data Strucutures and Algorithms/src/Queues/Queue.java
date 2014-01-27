package Queues;



public class Queue {
	
	class Node
	{
		int data;
		Node link;
		Node()
		{
			link=null;
		}
		
		void display()
		{
			System.out.println(data+" "+link);
		}
	}
	
	Node first,last;
	
	void enqueue(int data)
	{
		Node new_node= new Node();
		new_node.data=data;
		if(first==null)
		{
			first=new_node;
			last=new_node;
			
		}
		else
		{
		last.link=new_node;
		last=new_node;
		}
				
	}
	
	Node dequeue()
	{
		if(first!=null)
		{
		Node temp=first;
		first=first.link;
	return temp;
		}
		return null;
				
	}

	void display()
	{
		Node index=first;
		while(index!=null)
		{
			index.display();
			index=index.link;
		}
	}

public static void main(String []args)
{
	Queue q=new Queue();
	q.enqueue(1);
	q.enqueue(2);
	q.enqueue(3);
	q.enqueue(4);
	q.display();
	System.out.println(q.dequeue().data+" removed");
	System.out.println(q.dequeue().data+" removed");
	System.out.println(q.dequeue().data+" removed");
	System.out.println(q.dequeue().data+" removed");
	System.out.println(q.dequeue()+" removed");
}

}
