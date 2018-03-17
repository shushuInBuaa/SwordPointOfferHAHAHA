package mainCodes;

public class T05 {
	public static void main(String args[])
	{
		T05 test=new T05();
		System.out.println(test.replaceSpace(new StringBuffer("hello world i am shushu")));
	}
	
	public String replaceSpace(StringBuffer str)
	{
		int charCount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				charCount++;
			}
		}
		
		int bias=charCount*2;
		char[] result=new char[bias+str.length()];
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)==' ')
			{
				bias-=2;
				result[i+bias]='%';
				result[i+bias+1]='2';
				result[i+bias+2]='0';
			}
			else
			{
				result[i+bias]=str.charAt(i);
			}
				
		}
		
		StringBuffer finalResult=new StringBuffer();
		
		for(char a:result)
		{
			finalResult.append(a);
		}
		return finalResult.toString();
	}
}
