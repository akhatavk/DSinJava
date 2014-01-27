package Stacks;

public class Tower {

	Stack stackOfDiscs=new Stack();
	int index;
	
	public Tower(int i)
	{
		index=i;
	}
	
	
	
	public void addToTower(int disc_id)
	{
		stackOfDiscs.push(disc_id);
		
	}
	
	
	public static void main(String []args)
	{
		Tower[] towers=new Tower[3];
		
		for(int i=0;i<3;i++)
		 { 
			towers[i]=new Tower(i);
		 }
		
		for(int i=3;i>=1;i--)
		{
            towers[0].addToTower(i);			
		}
		
		
		towers[0].moveDiscs(3, towers[1], towers[2]);
	}
	
	public void moveNthDiscToDestination(Tower destination)
	{
		if(!stackOfDiscs.isempty())
		{
		   Node disc= stackOfDiscs.pop();
		   destination.addToTower(disc.data);
		   System.out.println("Move "+ disc.data+ " from tower "+index +" to Tower "+destination.index);
		}
		
	}
	
	public void moveDiscs(int n,Tower buffer,Tower destination)
	{
	if(n>0)
	{
		moveDiscs(n-1,destination,buffer);
		moveNthDiscToDestination(destination);
		buffer.moveDiscs(n-1,this,destination);
	}
	 	

}
}
