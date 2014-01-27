package Stacks;


public class Node
	{
		int data;
		Node link;
		public Node()
		{
			link=null;
		}
		public int getData()
		{
			return data;
		}
		
		public void display()
		{
			System.out.println(data+" "+link);
		}
	}
	