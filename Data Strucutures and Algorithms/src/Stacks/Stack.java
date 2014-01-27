package Stacks;

public class Stack {
	Node top;
 static final int MAX=100;
	int count=0;
	public boolean isempty()
	{
		if(top==null)
			return true;
		else
			return false;
	}
	
	public Node peek()
	{
		return top;
	}
	
	public boolean isFull()
	{
		if(count==MAX)
			return true;
		else return false;
	}
	
	public void push(int data)
	{
		if(count<MAX)
		{
		Node new_node=new Node();
		new_node.data=data;
		new_node.link=top;
		top=new_node;
		count++;
		}
	}

	public Node pop()
	{
		if(top!=null)
		{
		Node t=top;
		top=top.link;
		count--;
		return t;
		}
		return null;
	}
	
	public void display()
	{
		Node index=top;
		while(index!=null)
		{
			index.display();
			index=index.link;
		}
	}
	
	public Stack sorting()
	{
		Stack r=new Stack();
		while(!isempty())
		{
			Node temp=pop();
		 while((r.peek()==null || r.peek().data<temp.data)&&(!r.isempty()) )
			{
				push(r.pop().data);
			}
			r.push(temp.data);
		}
		return r;
	}
	
public static void main(String []args)
{
	Stack s=new Stack();
	s.push(4);
	s.push(2);
	s.push(3);
	s.push(1);
	s.push(45);
	s.push(145);
	s.display();
	Stack sorted_stack=s.sorting();
	sorted_stack.display();
	String s1="h"+9.08;
	System.out.println(s1);
	String a = "String";
	int b = 3;
	int c = 7;
	System.out.println(b + c+a);
	/*String [] a1={"akshay"};
	System.out.println(a1[0+1]);*/
	int z = 5;
	if(++z > 5 || ++z > 6)
	 System.out.println(z);
}
	
}

	
