package pkj1;

public class Assignment3 {

	public Assignment3()
	{
		this(2,4,6,8);
		System.out.println(" one   parameter ");
	}
	public Assignment3(int a )
	{
		this();
		System.out.println(" defualt parameter ");
	}
	public Assignment3(int a, int b)
	{
		this(2 );
		System.out.println("two  parameter");
	}
	public Assignment3(int a, int b, int c,int d)
	{
		this(1,2,3);
		System.out.println("four   parameter");
	}
	public static void main(String[] args)
	{
		Assignment3 obj=new Assignment3(6,8);
		
		
	}
	
	
	}
	

