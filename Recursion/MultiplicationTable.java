import java.util.*;
public class MultiplicationTable
{
	static void Mul(int num, int i)
	{
		System.out.print("\n");
		System.out.print(num+" * "+i+" = "+num*i);
	    if(i<10)
	        Mul(num, i+1);
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
	    int num;
	    System.out.print("Enter a number: ");
	    num = sc.nextInt();
	    System.out.print("Multiplication Table of "+num+" is:");
	    Mul(num, 1);
	}
}