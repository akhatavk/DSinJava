package LinkedList;

public class LinkedList {
   class Node {
		int data;
		Node link;
		
		Node()
		{
			link=null;
		}
		
		void display()
		{
			System.out.println(data+" "+ link);	
		}

	}
	
 Node first;
 
 LinkedList()
 {
 }

 
 void append(int data)
 {
	 Node temp,new_node;
	 if(first==null)
	 {
		 first=new Node();
		 first.data=data;
	 }
	 else
	 {
		 
		 temp=first;
		 while(temp.link!=null)
		 {
			 temp=temp.link;
		 }
		 
		 new_node=new Node();
		 temp.link=new_node;
		 new_node.data=data;
		 
		 
	 }
 }
 
 void addAtBeg(int data)
 {
	 Node temp;
	 if(first==null)
	 {
		 first=new Node();
		 first.data=data;
	 }
	 else
	 {
		 
		 temp=new Node();		 
		 temp.link=first;		 
		 temp.data=data;
		 first=temp;		 
		 
	 }
 }
 
 
 void addAfter(int loc,int num)
 {
	 int i;
	 Node temp,temp1;
	 if(loc!=0)
	 {
	 	 temp1=first;
	 for( i=1;i<loc;i++)
	 {
		   temp1=temp1.link;
		   if(temp1==null) {
			   System.out.println("Number of nodes are less than the location specified");
			    return;
		             }
		   
	 }
	 temp=new Node();
	 temp.data=num;
     temp.link=temp1.link;
	 temp1.link=temp;
	 
	 }
	 
 }
 
 
 
 int count()
 {
	 int count=0;
Node temp=first;
while(temp!=null)
{
	count++;
	temp=temp.link;
}
return count;
	 
 }

 
 
 void display()
 {
	 Node temp=first;
	 while(temp!=null)
	 {
		 temp.display();
		 temp=temp.link;
		 
	 }

 }
 
 void del(int num)
 {
	 System.out.println("Deleting :"+num);
	 Node curr=first;
	 Node old=curr;
	 
	 while(curr.data!=num)
	 {
		 old=curr;
		 curr=curr.link;
		 if(curr==null)
		 {
			 System.out.println("Data not found!");
			 return;
		 }
	 }
	 if(curr==first)
	 {
		 first=curr.link;
	 }
	 else if(curr!=null)
	 {
		 old.link=curr.link;
	 }
	 
 }
 

 public static void main(String []args)
 {
	 LinkedList l=new LinkedList();
	 l.append(12);
	 l.append(13);
	 l.append(14);
	 l.display();
	 l.addAtBeg(15);	
	 l.append(16);
	 l.display();
	 l.addAfter(3,17);
	 l.display();
	 System.out.println(l.count());
	 l.del(17);
	 l.display();
	 System.out.println(l.count());
	 l.del(15);
	 l.display();
	 System.out.println(l.count());
	 l.del(16);
	 l.display();
	 System.out.println(l.count());
	 l.del(18);
	 
	 
 }
 
}
