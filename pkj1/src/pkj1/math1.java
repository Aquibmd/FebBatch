package pkj1;

public class math1 {
	
	public int  div(int a,int b)
	{
		int c=a/b;
		System.out.println("div results is "+c);
		
		return c;
	}
	public int sum(int a1,int b1)
	{
		int c1=a1+b1;
		System.out.println("sum result is "+c1);
		return c1;
	}
	public int sub(int a2,int b2)
	{
		int c2=a2-b2;
		System.out.println("sub of result is "+ c2);
		return c2;
	}
	public void  multi(int a3,int b3)
	{
	
		int result;
		result=a3*b3;
		System.out.println("Final result is "+ result);
	}
	
	public static void main(String[] args)
	{
		math1 id =new math1();
		int divresult=id.div(10,2);
		int subresult2=id.sub(divresult, 2);
		int sumresult=id.sum(subresult2, 2);
		int subresult=id.sub(sumresult, 2);
		
		id.multi(subresult,2);
		
		
	
	}

}
