package LinkedList;


public class DoublyLinkedList {
   class Node {
		int data;
		Node next;
		Node prev;
		Node()
		{
			next=null;
			prev=null;
		}
		
		void display()
		{
			System.out.println(prev+" "+data+" "+next );	
		}

	}
	
 Node first;
 
 DoublyLinkedList()
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
		 while(temp.next!=null)
		 {
			 temp=temp.next;
		 }
		 
		 new_node=new Node();
		 temp.next=new_node;
		 new_node.prev=temp;
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
		 temp.next=first;		 
		 temp.data=data;
		 first.prev=temp;
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
		   temp1=temp1.next;
		   if(temp1==null) {
			   System.out.println("Number of nodes are less than the location specified");
			    return;
		             }
		   
	 }
	 temp=new Node();
	 temp.data=num;
     temp.next=temp1.next;
     temp1.next.prev=temp;
	 temp1.next=temp;
	 temp.prev=temp1;
	 
	 }
	 
 }
 
 
 
 int count()
 {
	 int count=0;
Node temp=first;
while(temp!=null)
{
	count++;
	temp=temp.next;
}
return count;
	 
 }

 
 
 void display()
 {
	 Node temp=first;
	 while(temp!=null)
	 {
		 temp.display();
		 temp=temp.next;
		 
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
		 curr=curr.next;
		 if(curr==null)
		 {
			 System.out.println("Data not found!");
			 return;
		 }
	 }
	 if(curr==first)
	 {
		 first=curr.next;
	 }
	 else if(curr!=null)
	 {
		 old.next=curr.next;
		if(curr.next!=null)
		 curr.next.prev=old;
	 }
	 
 }
 
 void reverse()
 {
	 Node curr=first,prev=null,next=curr.next;
	 while(curr!=null)
	 {
		 curr.next=prev;
		 curr.prev=next;
		 prev=curr;
		 curr=next;
		 if(next!=null)
		 next=next.next;
	 }
	 first=prev;
	 first.prev=null;
	 
 }
 

 public static void main(String []args)
 {
	 DoublyLinkedList l=new DoublyLinkedList();
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
	 l.append(20);
	 l.append(21);
	 l.append(22);
	 l.reverse();
	 l.display();
	 l.reverse();
	 l.display();
	 
	 
 }
 
}
