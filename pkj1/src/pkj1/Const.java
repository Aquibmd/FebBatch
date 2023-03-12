package pkj1;

public class Const {
	
	public Const()
	{
		this (10,20,30);
		System.out.println("Defualt Constructor ");
	}
	public Const(int a )
	{
		this ();
		System.out.println("one parameter constructor ");
	}
	
	public Const(int a ,int b)
	{
		this (10,20,30,40);
	System.out.println("Two prameter constructor  ");
	}
	public Const(int a , int b ,int c )
	{
		System.out.println(" Three parameter constructor ");
	}
	public Const(int a, int b,int c, int d)
	{
		this (10);
		System.out.println(" Four parameter constructor ");
	}
	public static void main(String[] args)
	{
		Const obj=new Const(10,20);
		
	}
	
	
	
	}

