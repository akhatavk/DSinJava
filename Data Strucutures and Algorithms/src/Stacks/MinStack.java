package Stacks;


public class MinStack {
	class Node
	{
		int data;
		Node link;
		Node next_min;
		Node()
		{
			link=null;
			next_min=null;
		}
		
		void display()
		{
			System.out.println(data+" "+link);
		}
	}
	
	Node top,min;
	
	void push(int data)
	{
		Node new_node=new Node();
		new_node.data=data;
		new_node.link=top;
		
		if(top==null)
		{
			min=new_node;
			new_node.next_min=null;
		}
			
		else if(min.data>new_node.data)
		{
			new_node.next_min=min; 
			min=new_node;			 
		}
		
		top=new_node;
		
		
	}
	
	Node min()
	{
		if(top!=null)
		return min;
		else
			return null;
	}

	Node pop()
	{
		if(top!=null)
		{
		Node t=top;
		top=top.link;
		if(t.next_min!=null)
			min=t.next_min;
		return t;
		}
		return null;
	}
	
	void display()
	{
		Node index=top;
		while(index!=null)
		{
			index.display();
			index=index.link;
		}
	}
	
public static void main(String []args)
{
	MinStack s=new MinStack();
	s.push(4);
	System.out.println(s.min().data+" is the minimum");
	s.push(3);
	System.out.println(s.min().data+" is the minimum");
	s.push(2);
	System.out.println(s.min().data+" is the minimum");
	s.push(1);
	System.out.println(s.min().data+" is the minimum");
	s.display();	
	System.out.println(s.pop().data+" popped");
	System.out.println(s.min().data+" is the minimum");
	System.out.println(s.pop().data+" popped");
	System.out.println(s.min().data+" is the minimum");
	System.out.println(s.pop().data+" popped");
	System.out.println(s.min().data+" is the minimum");
	System.out.println(s.pop().data+" popped");
	System.out.println(s.min()+" is the minimum");
	System.out.println(s.pop()+" popped");
	
}
	
}

	
