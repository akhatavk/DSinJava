package LinkedList;

import java.util.Hashtable;

import LinkedList.CircularLinkedList.Node;

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

 
 Node append(int data)
 {
	 Node temp,new_node;
	 if(first==null)
	 {
		 first=new Node();
		 first.data=data;
		 return first;
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
	  return new_node;	 
		 
	 }
 }

 
 void custom_append()
 {
	 Node temp,second_node,third_node,fourth_node,fifth_node;
		 first=new Node();
		 first.data=1;
		 second_node=new Node();
		 first.link=second_node;
		 second_node.data=2;
		 
		 third_node=new Node();
		 second_node.link=third_node;
		 third_node.data=3;
		 
		 fourth_node=new Node();
		 third_node.link=fourth_node;
		 fourth_node.data=4;
		 
		 fifth_node=new Node(); 
		 fifth_node.data=5;
		 fourth_node.link=fifth_node;
		 
		 fifth_node.link=fifth_node;
		 
 }
 
 
 
 void removeDuplicatesN2()
 {	 	 
	 Node curr=first,temp=first;
	 while(curr.link!=null)
	 {
		while(temp!=null && temp.link!=null)
		{
		 if(temp.link.data==curr.data)
		   	 temp.link=temp.link.link; 	 
		 else
		 temp=temp.link;
		}
		curr=curr.link;
		temp=curr.link;
	 }
	 	 
 }
 
 void removeDuplicatesWithBuffer()
 {	 	 
	  Node prev=null;
	  Node curr=first;
	  Hashtable table=new Hashtable();
	 while(curr!=null)
	 {
		 if(table.containsKey(curr.data) ){ prev.link=curr.link;}
		 else
		 {
			 table.put(curr.data, true);
			 prev=curr;
		 }	
		 
		 curr=curr.link;
		 
	 }
	  
 }
 
 void checkForLoopUsingHairAndTortoiseAlgorithm()
 {
	Node slowRef,fastRef1,fastRef2;
	slowRef=fastRef1=fastRef2=first;
	
	fastRef1=first.link;
	fastRef2=first.link.link;
	System.out.print("slow Ref:"+slowRef.data);
	System.out.print("  fast Ref1:"+fastRef1.data);
	System.out.print("  fast Ref2:"+fastRef2.data);
	System.out.println("");
	while( fastRef1.link.link!=null && fastRef2.link.link!=null)
	{		
		slowRef=slowRef.link;
		System.out.print("slow Ref:"+slowRef.data);
		fastRef1=fastRef1.link.link;
		System.out.print("  fast Ref1:"+fastRef1.data);
		fastRef2=fastRef2.link.link;
		System.out.print("  fast Ref2:"+fastRef2.data);
		if( slowRef==fastRef2 || slowRef==fastRef1)
		{
			System.out.println("Loop Found");
			return;
		}
  System.out.println(" ");			
	}
	
	System.out.println("Loop not found");
		 
 }
 
 void findNthLastElement(int n)
 {
	 
	Node prev=first,curr=first;
  for(int i=0;i<n;i++)
  {
	if(curr!=null)  
	curr=curr.link;
	else
	{
	System.out.println("Invalid input");
	return;
	}
  }	

 while(curr!=null)
 {
	 curr=curr.link;
	 prev=prev.link;
	  
 }

 System.out.println(n+"Nth last element is :"+prev.data);	
	 
 }
 
 
 void deleteMiddleElementGivenOnlyAccessToThatNode(Node n)
 {

	 Node curr=n;
	 curr.data=curr.link.data;
	 curr.link=curr.link.link;	 
	 
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
 
 Node addLists(Node l1, Node l2,
		  int carry) {
		  if (l1 == null && l2 == null) {
		  return null;
		  }
		Node result = new Node();
		  int value = carry;
		  if (l1 != null) {
		  value += l1.data;
		  }
		  if (l2 != null) {
		  value += l2.data;
		  }
		  result.data = value % 10;
		  Node more = addLists(l1 == null ? null : l1.link,
		  l2 == null ? null : l2.link,
		 value > 10 ? 1 : 1);
		  result.link=more;
		  return result;
		  }

 static LinkedList addNumbers(LinkedList l1,LinkedList l2)
 {
	 Node curr1=l1.first;
	 Node curr2=l2.first;
	 int carry_forward=0;
	 int data;
	 LinkedList l3=new LinkedList();
	 while(curr1!=null && curr2!=null)
	 {
	 data=curr1.data+curr2.data+carry_forward;
	 if(data>9)
		 carry_forward=1;
	 else 
		 carry_forward=0;
			
	 
	 l3.append(data%10);
	 curr1=curr1.link;
	 curr2=curr2.link;
	 }
	while(curr1!=null)
	{
		 data=curr1.data+carry_forward;
		 if(data>9)
			 carry_forward=1;
		 else 
			 carry_forward=0;
				
		 
		 l3.append(data%10);
		 curr1=curr1.link;
		
		
	 }
	
	while(curr2!=null)
	{
		 data=curr2.data+carry_forward;
		 if(data>9)
			 carry_forward=1;
		 else 
			 carry_forward=0;
				
		 
		 l3.append(data%10);
		 curr2=curr2.link;
		
		
	 }

	if(carry_forward==1) 
	 l3.append(carry_forward);
	 return l3;
	 
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
 
 
 
 void startOfLoop()
 {
	 Node slow=first,fast=first;
	 while(fast.link!=null)
	 {
		 
		 slow=slow.link;
		 fast=fast.link.link;
		 if(slow==fast)
			 break;
	 }
	 
	 if(fast.link==null)
	 {
		 System.out.println("There is no loop");
		 return;
	 }
	 slow=first;
	 while(slow!=fast)
	 {
		 slow=slow.link;
		 fast=fast.link;
	 }
	 
	 System.out.println("The start of the loop is :"+slow.data);	 		 
 }

 
 void reverse()
 {
	 Node curr=first,prev=null,next=curr.link;
	 while(curr!=null)
	 {
		 curr.link=prev;
		 prev=curr;
		 curr=next;
		 if(next!=null)
		 next=next.link;
	 }
	 first=prev;
	 
 }
 

 public static void main(String []args)
 {
	 LinkedList l=new LinkedList();
	 /*l.append(12);
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
	 l.display();*/
	// l.custom_append();
/*	System.out.println("Before"); 
	 Node n1=l.append(12);
	 Node n2=l.append(13);
	 Node n3=l.append(14);
	 l.addAtBeg(15);	
	 Node n4=l.append(16);
	 l.addAfter(3,17);
	 l.addAfter(2,18);
	 l.addAfter(1,19);
	 Node n5=l.append(16);
	 l.display();


  //l.checkForLoopUsingReverse();
  //l.checkForLoopUsingHairAndTortoiseAlgorithm();
System.out.println("After removing duplicates"); 
  //l.removeDuplicatesWithBuffer();
  
  //l.findNthLastElement(0);
 l.deleteMiddleElementGivenOnlyAccessToThatNode(n2);
  l.display();
  
  
  LinkedList l1=new LinkedList();
  l1.append(1);
  l1.append(1);
  l1.append(1);
  LinkedList l2=new LinkedList();
  l2.append(1);
  l2.append(1);
  LinkedList l3=addNumbers(l1,l2);
  l3.display();*/
  LinkedList l4=new LinkedList();
  
  l4.custom_append();
  //l4.display();
  l4.startOfLoop();
 }
 
}
