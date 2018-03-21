package mainCodes;

import java.util.Stack;

public class T09 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public static void main(String[] args)
    {
    	T09 test=new T09();
    	System.out.println(test.pop());
    }
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	if(stack1.isEmpty())
    	{
    		return 0;//Ó¦¸Ãthrow exception
    	}
    	else{
    		int ans;
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }

            ans= stack2.pop();

            while(!stack2.isEmpty())
            {
                stack1.push(stack2.pop());
            }
            return ans;
    	}   
    }
}
