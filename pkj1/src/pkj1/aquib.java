package pkj1;

public class aquib {
	
	public int sub(int a,int b)
	{
		int c=a-b;
		System.out.println(" sub of result "+c);
		return c;
	}
	public int sum(int a1,int b1 )
	{ 
		int c1=a1+b1;
		System.out.println("sum of result " +c1);
		return c1;
	}
	public int multi( int a2, int b2)
	{
		int c3=a2*b2;
		System.out.println("multi of result" +c3);
		return c3;
	}
	public void div(int a3, int b3)
	{ 
		int result;
		result=a3/b3;
		System.out.println( " final result "+ result);
	}

	public static void main(String[] args)
	{
	
	aquib id=new aquib();
	int subresult=id.sub(10,4);
	int subresult6=id.sum(subresult,4);
	int sumresult;
	int multiresult10=id.multi(sumresult,6);
	
	int multiresult;
	id.div(multiresult, 8);
	
	
		
		
		
	}

}
