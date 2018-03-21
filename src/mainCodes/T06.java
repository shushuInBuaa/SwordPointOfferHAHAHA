package mainCodes;

import java.util.ArrayList;
import java.util.Stack;
import dataStructure.*;

public class T06 {
	
    public static void main(String[] args)
    {
    	T06 test=new T06();
    	ListNode node1=new ListNode(1);
    	ListNode node2=new ListNode(2);
    	node1.next=node2;
    	ListNode node3=new ListNode(3);
    	node2.next=node3;
    	ArrayList<Integer> result=test.printListFromTailToHeadIteratively(node1);
    	
    	for(Integer i:result)
    	{
    		System.out.println(i);
    	}
    }
	
    public ArrayList<Integer> printListFromTailToHeadIteratively(ListNode listNode)
    {
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	Stack<Integer> stack=new Stack<Integer>();
    	
    	while(listNode!=null)
    	{
    		stack.push(listNode.val);
    		listNode=listNode.next;
    	}
    	
    	
    	while(!stack.empty())
    	{
    		list.add(stack.pop());
    	}
    	
    	return list;
    }
}
