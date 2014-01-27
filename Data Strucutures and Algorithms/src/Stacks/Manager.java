package Stacks;

 class Employee {

	public static int i=10;
	static void display()
	{
		System.out.println(i);
	}
	
	
}


public class Manager extends Employee
{
	public static int i=11;
	static void display()
	{
		System.out.println(i);
	}
	
	
	public static void main(String []args)
	{
		Manager e =new Manager();
		e.display();
		((Employee)e).display();
		((Manager)e).display();
		System.out.println(((Employee)e).i);
		display();
	}
}
