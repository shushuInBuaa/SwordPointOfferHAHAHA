package mainCodes;

public class T11 {
	public static void main(String[] args)
	{
		T11 test=new T11();
		System.out.println(test.minNumberInRotateArray(new int[]{3,4,5,6,7,1,2}));
	}
	
	public int minNumberInRotateArray(int [] array) 
	{
	    int minPosition=getMinPosition(array, 0, array.length-1);
	    
	    return array[minPosition];
	}
	
	public int getMinPosition(int[] array, int leftPointer, int rightPointer)
	{
		int middle=(rightPointer-leftPointer)/2+leftPointer;
		
		if(leftPointer==rightPointer)
		{
			return 0;
		}
		else
		{
			if(array[leftPointer]<=array[middle]&&array[middle+1]<=array[rightPointer])//min at middle+1
			{
				return middle+1;
			}
			else if(array[leftPointer]>array[middle]&&array[middle+1]<=array[rightPointer])//min at left subarray
			{
				return getMinPosition(array, leftPointer, middle);
			}
			else if(array[leftPointer]<=array[middle]&&array[middle+1]>array[rightPointer])
			{
				return getMinPosition(array, middle+1, rightPointer);
			}
			else {
				return 0;
			}
		}
	}
}
