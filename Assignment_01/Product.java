import java.util.Scanner;
class Product
{
	public static void main(String args[])
	{
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number : ");
		a = sc.nextInt();
		System.out.print("Input second number : ");
		b = sc.nextInt();
		sc.close();
		c = a * b;
		System.out.println(a+ " x " +b+ " = " +c);
	}
}