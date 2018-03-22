package mainCodes;

import java.util.Stack;

public class T12 {
	public static void main(String[] args)
	{
		T12 test=new T12();
		System.out.println(test.hasPath(new char[]{'A','B','C','E','H','J','I','G','S','F','C','S','L','O','P','Q','A','D','E','E','M','N','O','E','A','D','I','D','E','J','F','M','V','C','E','I','F','G','G','S'}, 5, 8, new char[]{'S','G','G','F','I','E','C','V','A','A','S','A','B','C','E','H','J','I','G','Q','E','M'}));
	}
	
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
    	boolean find=false;
    	for(int i=0;i<matrix.length;i++)
    	{
        	boolean[] visited=new boolean[matrix.length];
    		find=search(matrix,i,rows,cols,str,0,visited);
        	if(find==true)
        		break;
    	}
    	
    	return find;
    }
    
    public boolean search(char[] matrix, int i, int rows, int cols, char[] str, int pathIndex, boolean[] visited)
    {
    	if(i>=0&&i<matrix.length&&pathIndex>=0&&pathIndex<str.length&&!visited[i]&&matrix[i]==str[pathIndex])
    	{
    		if(pathIndex==str.length-1)
    			return true;
    		
    		int row=i/cols;
        	int col=i%cols;
        	
        	boolean find=false;

        	visited[i]=true;
        	
        	pathIndex++;
        	
        	find=tryMove(matrix, i, rows, cols, str, pathIndex, visited);
        	
        	if(!find)
        	{
        		pathIndex--;
        		visited[i]=false;
        	}

        	
        	return find;
    	}
    	else
    		return false;
    }
    
    public boolean tryMove(char[] matrix, int i, int rows, int cols, char[] str, int pathIndex,boolean[] visited)
    {
    	boolean available=false;
    	
    	if(search(matrix, move("up", rows, cols, i), rows, cols, str, pathIndex,visited))
    	{
    		available=available||true;
    	}
    	if(search(matrix, move("down", rows, cols, i), rows, cols, str, pathIndex,visited))
    	{
    		available=available||true;
    	}
    	if(search(matrix, move("left", rows, cols, i), rows, cols, str, pathIndex,visited))
    	{
    		available=available||true;
    	}
    	if(search(matrix, move("right", rows, cols, i), rows, cols, str, pathIndex,visited))
    	{
    		available=available||true;
    	}
    	
    	return available;
    }
    
    public int move(String direction, int rows, int cols, int index)
    {
    	int row=index/cols;
    	int col=index%cols;
    	
    	if(direction=="up")
    	{
    		row--;
    	}
    	else if(direction=="down")
    	{
    		row++;
    	}
    	else if(direction=="left")
    	{
    		col--;
    	}
    	else if(direction=="right")
    	{
    		col++;
    	}
    	
    	if(row<0||col<0)
    		return -1;
		return row*cols+col;
    }
}
