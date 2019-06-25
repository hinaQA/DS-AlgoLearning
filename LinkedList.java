package data.data;



public class LinkedList {
	static Node head;  // head of list
	 
    /* Linked list Node.  This inner class is made static so that
       main() can \
       access it */
    static class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next=null; } // Constructor
    }
 
    /* This function prints contents of linked list starting from head */
    public void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
 
    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList llist = new LinkedList();
 
        llist.head       = new Node(1);
        Node second      = new Node(2);
        Node third       = new Node(3);
 
        llist.head.next = second; // Link first node with the second node
        second.next = third; // Link first node with the second node
 
        llist.printList();
        
        System.out.print(search(2));
    }
    public int getcount()
    {
    	Node temp =head;
    	int count =0;
    	while(temp!=null)
    	{
    		count++;
        	temp= temp.next;
    	}
    	
    	return count;
    	
    }
    public int getcountrec(Node node)
    {
    	if(node==null)
    	{
    		return 0;
    	}
    	return 1+getcountrec(node.next);
    	
    }
    public int getcount1()
    {
    	return getcountrec(head);
    }
    public static  Node search(int nodedata)
    { 
    	Node temp = head;
    	while(temp!=null)
    	{
    		if(nodedata==temp.data)
    		{
    			return temp;
    		}
    		temp = temp.next;
    	}
    	return temp;
    }
    
}
