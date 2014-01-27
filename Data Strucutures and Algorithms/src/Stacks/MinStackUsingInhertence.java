package Stacks;

public class MinStackUsingInhertence extends Stack {
	
Node min;
Stack min_stack;

MinStackUsingInhertence()
{
	min_stack=new Stack();
}

public void push(int data)
{
  if(data<min())
  {
	 min_stack.push(data);
  }
  super.push(data);		
}

int min()
{
	if(min_stack.isempty())
	{
		return Integer.MAX_VALUE;
	}
	else
	{
		return min_stack.top.data;
	}
}

public Node pop()
{
	Node t=super.pop();
	if(t!=null && t.data==min())
		min_stack.pop();
	
	return t;
}


public static void main(String []args)
{
	MinStackUsingInhertence s=new MinStackUsingInhertence();
	s.push(3);
	System.out.println(s.min()+" is the minimum");
	s.push(2);
	System.out.println(s.min()+" is the minimum");
	s.push(5);
	System.out.println(s.min()+" is the minimum");
	s.push(4);
	System.out.println(s.min()+" is the minimum");
	s.push(1);
	System.out.println(s.min()+" is the minimum");
	s.display();	
	System.out.println(s.pop().data+" popped");
	System.out.println(s.min()+" is the minimum");
	System.out.println(s.pop().data+" popped");
	System.out.println(s.min()+" is the minimum");
	System.out.println(s.pop().data+" popped");
	System.out.println(s.min()+" is the minimum");
	System.out.println(s.pop().data+" popped");
	System.out.println(s.min()+" is the minimum");
	System.out.println(s.pop().data+" popped");
	System.out.println(s.min()+" is the minimum");
}

}
