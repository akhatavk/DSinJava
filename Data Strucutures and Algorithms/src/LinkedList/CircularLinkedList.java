package LinkedList;

public class CircularLinkedList {
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
 
 CircularLinkedList()
 {
 }

 
 void append(int data)
 {
	 Node temp,new_node;
	 if(first==null)
	 {
		 first=new Node();
		 first.data=data;
		 first.link=first;
	 }
	 else
	 {
		 
		 temp=first;
		 while(temp.link!=first)
		 {
			 temp=temp.link;
		 }
		 
		 new_node=new Node();
		 temp.link=new_node;
		 new_node.data=data;
		 new_node.link=first;
		 
	 }
 }
 
 void addAtBeg(int data)
 {
	 Node temp,temp1;
	 temp1=first;
	 if(first==null)
	 {
		 first=new Node();
		 first.data=data;
		 first.link=first;
	 }
	 else
	 {
		 
		 temp=new Node();		 
		 temp.link=first;		 
		 temp.data=data;
		 while(temp1.link!=first)
			  temp1=temp1.link;
		first=temp; 
		temp1.link=first;	 
			 
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
		   if(temp1==first) {
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
	if(temp==first){ break;}
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
		 if(temp==first)
			 break;
		 
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
		 if(curr==first)
		 {
			 System.out.println("Data not found!");
			 return;
		 }
	 }
	 if(curr==first)
	 {
		 first=curr.link;
	 }
	 else if(curr!=first)
	 {
		 old.link=curr.link;
	 }
	 
 }
 
 void reverse()
 {
	 Node curr=first,prev=null,next=curr.link;
	 while(next!=first)
	 {
		 curr.link=prev;
		 prev=curr;
		 curr=next;
		 next=next.link;
	 }
	 curr.link=prev;
	 first=curr;
	 next.link=first;
	 
 }
 
 void checkForLoopUsingReverse()
 {
	 Node curr=first,prev=null,next=curr.link;
	 while(next!=null)
	 {
		 curr.link=prev;
		 prev=curr;
		 curr=next;
		 next=next.link;
		 if(curr==first)
		 {
			 System.out.println("loop found");
			 return;
		 } 	 
	 }
	 
	 System.out.println("Loop Not found!");
	 
	 
 }
 

 public static void main(String []args)
 {
	 CircularLinkedList l=new CircularLinkedList();
	 l.append(12);
	 l.append(13);
	l.append(14);
	 l.display();
	 System.out.println("");
	 l.addAtBeg(15);	
	 l.append(16);
	 l.display();
	 System.out.println("Adding 17 after 3rd node");
	 l.addAfter(5,17);
	 l.display();
	 System.out.println(l.count());
	 l.del(13);
	 l.display();
	 System.out.println(l.count());
	 l.reverse();
	 l.display();
	 l.checkForLoopUsingReverse();

	 
	 
 }
 
}
