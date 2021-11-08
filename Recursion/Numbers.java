//  Write a program to print a series of numbers with recursive Java methods

import java.util.*;
class Numbers
{
	static int n;
	static int i = 0;
	static void Num()
	{
		++i;
		if(i<=n) 
		{
			System.out.println(i);
			Num(); 
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n = sc.nextInt();
		Num();
	}
}