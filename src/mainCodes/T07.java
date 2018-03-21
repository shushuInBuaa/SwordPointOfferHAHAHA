package mainCodes;
import dataStructure.*;

public class T07 {
	public static void main(String[] args)
	{
		T07 test=new T07();
		int[] pre=new int[]{1,2,3,7,4,5,6,8};
		int[] in=new int[]{4,7,2,1,5,3,8,6};
		try
		{
			TreeNode root=test.reConstructBinaryTree(pre,in);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }

		System.out.println();
	}
	
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) throws Exception{
    	if(pre.length==0||in.length==0)
    		return null;
    	return construct(pre, in, 0,pre.length-1, 0, in.length-1);
    }
    
    public TreeNode construct(int [] pre, int [] in, int preStart, int preEnd, int inStart, int inEnd) throws Exception
    {
    	int root=pre[preStart];
    	TreeNode node=new TreeNode(root);
    	
    	int positionIn=inStart;
    	while(positionIn<=inEnd)
    	{
    		if(in[positionIn]==root)
    			break;
    		
    		positionIn++;
    	}
    	
    	if(positionIn>inEnd)
    		throw new Exception("Invalid");
    	
    	int leftLength=positionIn-inStart;
    	int rightLength=inEnd-positionIn;
    	
    	//left
    	if(leftLength!=0)
    		node.left=construct(pre, in, preStart+1, preStart+leftLength, inStart, positionIn-1);
    	
    	//right
    	if(rightLength!=0)
    		node.right=construct(pre, in, preStart+leftLength+1, preEnd, positionIn+1, inEnd);
    	
    	return node;
    }
}
