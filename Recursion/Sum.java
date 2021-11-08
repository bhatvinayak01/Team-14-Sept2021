// Write a program to sum a series of numbers with Java recursion

class Sum
{
	static int Num(int n)
	{	
		if(n<=1) 
			return 1;
		else
			return n + Num(n-1);
	}
	public static void main(String args[])
	{
		System.out.println("Sum: "+Num(5));
	}
}