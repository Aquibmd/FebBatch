package pkj1;

public class arithmatic {
	
	public int sum(int a,int b)
	{
		int c=a+b;
		System.out.println("sum result is "+c);
		return c;
	}
	public int sub(int a1,int b1)
	{
		int c1=a1-b1;
		System.out.println("sub result is "+c1);
		return c1;
	}
	public int multi(int a2, int b2)
	{
		int c2=a2*b2;
		System.out.println("multi result is"+c2);
		return c2;
	}
	public void div(int a3,int b3)
	{
		int result;
		result=a3/b3;
		System.out.println("Final result is "+ result);
	}
	
	public static void main(String[] args)
	{
		arithmatic id=new arithmatic();
		int sumresult=id.sum(10,2);
		int sumresult2=id.sum(sumresult,2);
		int subresult=id.sub(sumresult2,2);
		int multiresult=id.multi(subresult,2);
		
		id.div(multiresult,2);
		
		
	}

}
