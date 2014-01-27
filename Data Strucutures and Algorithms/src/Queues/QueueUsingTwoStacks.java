package Queues;
import Stacks.*;

public class QueueUsingTwoStacks {
	
Stack	s1=new Stack();
Stack   s2=new Stack();	

public void enqueue(int data)
{
	
	s1.push(data);
	
}

public Node dequeue()
{
	if(s2.isempty())
	{
	while(!s1.isempty())
	{
		s2.push(s1.pop().getData());
	}
		
	}
	
	return s2.pop();	
}



public static void main(String []args)
{
	QueueUsingTwoStacks queue=new QueueUsingTwoStacks();
	queue.enqueue(1);
	queue.enqueue(2);
	queue.enqueue(3);
	queue.enqueue(4);
	System.out.println(queue.dequeue().getData()+" removed");
	System.out.println(queue.dequeue().getData()+" removed");
	System.out.println(queue.dequeue().getData()+" removed");
	queue.enqueue(5);
	queue.enqueue(6);
	System.out.println(queue.dequeue().getData()+" removed");
	System.out.println(queue.dequeue().getData()+" removed");
	queue.enqueue(7);
	System.out.println(queue.dequeue().getData()+" removed");
}

}
