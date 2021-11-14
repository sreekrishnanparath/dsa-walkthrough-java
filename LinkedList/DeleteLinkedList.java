/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.LinkedList;
// { Driver Code Starts
import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}
class DeleteLinkedList
{
	Node head;
	void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	public void addToTheLast(Node node) 
	{
		if (head == null) 
		{
			head = node;
		} else 
		{
		   Node temp = head;
		   while (temp.next != null)
		   temp = temp.next;

		   temp.next = node;
		}}
	public static void main(String args[])
    {
       
         Scanner sc = new Scanner(System.in);
		 int t  =sc.nextInt();
		 
		 while(t>0)
         {
			int n = sc.nextInt();
			//int k = sc.nextInt();

                        DeleteLinkedList llist = new DeleteLinkedList();
			//int n=Integer.parseInt(br.readLine());
			int a1 = sc.nextInt();
			Node head = new Node(a1);
                        llist.addToTheLast(head);
                        for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
                        System.out.println("==============");
                        llist.printList(llist.head);
                        System.out.println("==============");
                        
			int x = sc.nextInt();
			//System.out.println(llist.head.data);
			  GfG g = new GfG(); 
			//System.out.println(k);
			//System.out.println(g.getNthFromLast(llist.head,k));
			Node result = g.deleteNode(llist.head, x);			
                         System.out.println("==============removed");
                         llist.printList(result);
                        //sc.remove();
		t--;
		}
                  
	}
}// } Driver Code Ends

class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here	
	Node temp = head,prev = null;
	
	if(x==0){
	    head = temp.next;
	    return head;
	}
	
	
	int i=0;
	while(i<x-1){
	    temp = temp.next;
//	    System.out.println(temp.data);
	    i++;
	}
	
	if(temp==null || temp.next==null){
	    return head;
	}
	
	Node next = temp.next.next;
	temp.next = next;
	return head;
	
	
    }
    
    	void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
}