/* 
Good morning! Here's your coding interview problem for today.
This problem was asked by Google.
Determine whether a doubly linked list is a palindrome. What if it’s singly linked?
For example, 1 -> 4 -> 3 -> 4 -> 1 returns True while 1 -> 4 returns False.*/

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
public class onehundredfour{
	 Node head;  
	 Node tail;
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
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			Solution g = new Solution();
			if(g.isPalindrome(head) == true)
			    System.out.println(1);
		    else
			    System.out.println(0);
			t--;
		}
        sc.close();
		
	}
}
 class Solution{
 boolean isPalindrome(Node head) 
    {
      Stack<Integer> s = new Stack<Integer>();
      for(Node curr = head;curr!=null;curr=curr.next)
      {
        s.push(curr.data);

      }
       for(Node curr = head;curr!=null;curr=curr.next)
      {
        int x = s.peek();
        if(x != curr.data)
        {
          return false;
        }
        s.pop();

      }


        return true;
    }  
}
