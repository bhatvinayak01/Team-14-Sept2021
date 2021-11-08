import java.util.Scanner;
class Circle
{
	public static void main(String args[])
	{
		double r, p, a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Radius : ");
		r = sc.nextDouble();
		sc.close();
		p = 2 * 3.14 * r;
		a = 3.14 * r * r;
		System.out.println("Perimeter is = "+p);
		System.out.println("Area is = "+a);
	}
}