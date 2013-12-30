import java.util.Scanner;


public class Arrays {
	
	public  int  MAX;
	int arr[];
    Scanner scan=new Scanner(System.in);
	
	public void add()
	{
		System.out.print("Enter the length of array");
		MAX=scan.nextInt();
		arr=new int[MAX];
        System.out.print("Enter the elements");
        for(int i=0;i<MAX;i++)
        {
          arr[i]=scan.nextInt();    	
        }
		
	}
	
	public void display()
	{
		System.out.println("You entered");
		  for(int i=0;i<MAX;i++)
	        {
				System.out.print(arr[i]+" ");    	
	        }
		
	}
	

	public void reverse()
	{
		  for(int i=0;i<MAX/2;i++)
	        {
				int temp=arr[i];
				arr[i]=arr[MAX-1-i];
				arr[MAX-1-i]=temp;
				
	        }
		
	}
	
	public void sort()
	{
		for(int i=0;i< MAX ;i++)
		{
			for(int j=i+1;j<MAX;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
	
	}
	
	
	public static int[] merge(Arrays a,Arrays b)
	{
			
		int arr[]=new int[a.MAX+b.MAX];
		int i,j,k;
		for(i=0,j=0,k=0;i<a.MAX && j< b.MAX ;k++)
	        {
			  if(a.arr[i]<b.arr[j])   { arr[k]=a.arr[i]; i++;}
			  else   { arr[k]=b.arr[j]; j++;}                 
				  				  				
	        }
		
		if(i==a.MAX)
		{
			while(j<b.MAX)
			{
				arr[k]=b.arr[j];
				j++;
				k++;
			}
			
		}
		else if(j==b.MAX)
		{
			while(i<a.MAX)
			{
				arr[k]=a.arr[i];
				i++;
				k++;
			}
		}
		return arr;
	}
	
	
	public static void main(String[] args)
	{
	
		Arrays a =new Arrays();
		a.add();
		a.sort();
		a.display();
		
		Arrays b =new Arrays();
		b.add();
		b.sort();
		b.display();
		
		Arrays c =new Arrays();
		c.MAX=a.MAX+b.MAX;
	    c.arr=Arrays.merge(a, b);

 c.display();
	}
	
	

}
