package ½£Ö¸offer_java;

public class T04 {
	public static void main(String args[])
	{
		int[][] array=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int[][] badArray=new int[][]{{}};
		
		T04 test=new T04();
		System.out.println(test.Find(5,badArray));
	}
	
	public boolean Find(int target, int [][] array)
	{	
		int row=array.length-1;
		int column=0;
		if(row>0)
			column=array[1].length-1;
		
		if(row>0&&column>0)
		{
			int min_row_count=0;
			int max_column_count=column;
			
			while(min_row_count<=row&&max_column_count>=0)
			{
				if(array[min_row_count][max_column_count]>target)
				{
					max_column_count--;
				}
				else if(array[min_row_count][max_column_count]==target)
				{
					return true;
				}
				else {
					min_row_count++;
				}
			}
			
			
			return false;
		}
		
		return false;
	}
}
