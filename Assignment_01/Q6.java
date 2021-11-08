import java.util.Scanner;
class Q6
{
	public static void main(String args[])
	{
		int a, b, c, d, e, f, g;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number : ");
		a = sc.nextInt();
		System.out.print("Input second number : ");
		b = sc.nextInt();
		sc.close();
		c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;
		g = a % b;
		System.out.println(a+" + "+b+" = "+c);
		System.out.println(a+" - "+b+" = "+d);
		System.out.println(a+" x "+b+" = "+e);
		System.out.println(a+" / "+b+" = "+f);
		System.out.println(a+" mod "+b+" = "+g);
	}
}