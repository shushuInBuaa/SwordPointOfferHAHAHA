package mainCodes;

public class T10 {
	public static void main(String[] args)
	{
		T10 test=new T10();
		System.out.println(test.Fibonacci(39));
	}
	
	public int Fibonacci(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else if(n>1)
		{
			int a=0,b=1;
			while(n>1)
			{
				int ans=a+b;
				a=b;
				b=ans;
				n--;
			}
			return b;
		}
		
		return -1;//n<0
    }
}
