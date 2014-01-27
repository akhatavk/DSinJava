package Stacks;

import java.util.ArrayList;

public class SetOfStacks {
	ArrayList<Stack> setOfStacks=new ArrayList();
	
	public void push(int data)
	{
		Stack recent=getRecent();
		if(recent==null|| recent.isFull())
		{
			recent=new Stack();
			setOfStacks.add(recent);
		}
		recent.push(data);
		
	}
	
	public Stack getRecent()
	{
		if(setOfStacks.isEmpty())
			return null;
		else
			 return setOfStacks.get(setOfStacks.size()-1);
	}
	
	public Node pop()
	{
		Stack recent=getRecent();
		if(recent==null)
		{
			return null;
		}
		
	   Node temp=recent.pop();
	   if(recent.isempty())
		   setOfStacks.remove(recent);
	   return temp;
	}
	
	public void display()
	{
	  int i=1;
		for(Stack s: setOfStacks)
		{
			System.out.println("Stack: "+ (i++));
			s.display();
		}
			
	}
	
	public static void main(String []args)
	{
		SetOfStacks s=new SetOfStacks();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.display();
		System.out.println(s.pop().data+" popped");
		System.out.println(s.pop().data+" popped");
		System.out.println(s.pop().data+" popped");
		System.out.println(s.pop().data+" popped");
		System.out.println(s.pop()+" popped");
		
	}

	

}
