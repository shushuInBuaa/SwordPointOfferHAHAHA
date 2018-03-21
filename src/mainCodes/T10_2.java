package mainCodes;

public class T10_2 {
	public static void main(String[] args)
	{
		T10_2 test=new T10_2();
		System.out.println(test.JumpFloor(5));
	}
	
    public int JumpFloor(int target) {
        if(target==0)
            return 0;
        else if(target==1)
            return 1;
        else if(target>1)
        {
            int a=1,b=1;
            while(target>1)
            {
                int ans=a+b;
                a=b;
                b=ans;
                target--;
            }
            return b;
        }
        else//target<0
            return 0;
    }
}
